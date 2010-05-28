package br.com.maisha.wind.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Locale;
import java.util.Map;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.framework.BundleContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Validation;
import br.com.maisha.terra.lang.ValidationRule;
import br.com.maisha.terra.lang.Operation.OperationType;
import br.com.maisha.wind.common.Activator;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.execution.api.RuleAPI;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
import br.com.maisha.wind.controller.storage.IStorage;
import br.com.maisha.wind.controller.validator.IValidator;
import br.com.maisha.wind.controller.validator.ValidatorRegistry;

/**
 * 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationController implements IApplicationController {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ApplicationController.class);

	/** Reference to the script engine manager. */
	private ScriptEngineManager engineManager = new ScriptEngineManager();

	/** Model listeners for message model. */
	private IAppModelListenerRegistry modelListener;

	/** Validator Registry. */
	private ValidatorRegistry validatorRegisty;

	/** */
	private IStorage persistentStorage;
	
	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#runOperation(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	@SuppressWarnings("unchecked")
	public ExecutionContext<ModelReference> runOperation(ExecutionContext<ModelReference> ctx) {

		try {
			Operation op = ctx.getOperation();
			OperationType type = OperationType.valueOf(op.getType());
			IProgressMonitor monitor = ctx.getMonitor();

			Class c = ctx.getInstance().getClass();
			
			// validation phase
			monitor.setTaskName("Validating...");
			ctx = processValidations(ctx);
			if (!ctx.getMessages().isEmpty()) {
				return ctx;
			}

			monitor.worked(10);

			// run operation
			monitor.setTaskName("Executing operation...");
			ScriptEngine engine = engineManager.getEngineByName(op.getType());
			Invocable invocable = (Invocable) engine;

			BundleContext bundle = ctx.getOperation().getDomainObject().getApplication().getBundleContext();

			URL ruleUrl = bundle.getBundle().getEntry("/src/" + op.getPropertyValue(PropertyInfo.FILE));

			InputStream is = ruleUrl.openStream();
			Reader r = new InputStreamReader(is);

			engine.eval(r);
			engine.put("ctx", ctx);
			RuleAPI api = new RuleAPI(ctx);
			api.setPersistentStorage(persistentStorage);
			engine.put("api", api);

			engine.eval("rule = " + (type.getUseNewOperator() ? "new " : "") + op.getRef() + "(ctx, api)");
			Object o = engine.get("rule");

			monitor.worked(5);
			ctx = (ExecutionContext<ModelReference>) invocable.invokeMethod(o, "execute");

		} catch (Exception e) {
			e.printStackTrace(); // TODO handle
		}
		return ctx;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#processExecutionContext(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	public void processExecutionContext(ExecutionContext<ModelReference> ctx) {

		// process messages
		if (ctx.getMessages() != null && !ctx.getMessages().isEmpty()) {
			modelListener.fireEvent(null, ctx.getMessages(), LevelType.Message, ChangeType.Added);
		}
	}

	public ExecutionContext<ModelReference> processValidations(ExecutionContext<ModelReference> ctx) {
		try {
			ModelReference modelInstance = ctx.getInstance();
			DomainObject meta = modelInstance.getMeta();

			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			juelEngine.put("this", modelInstance);
			juelEngine.put("meta", meta);

			// validate bean constraints
			for (Attribute att : meta.getAtts()) {
				for (Map.Entry<String, Property> prop : att.getProperties().entrySet()) {
					boolean validate = PropertyInfo.getPropertyInfo(prop.getKey()).isValidate();

					if (validate) {
						IValidator validator = validatorRegisty.getValidator(prop.getKey());

						if (validator != null) {
							validator.configure(prop.getValue());

							Object value = juelEngine.eval("${this." + att.getRef() + "}");

							if (!validator.validate(value)) {
								ctx.getMessages().add(
										new UserMessage(MessageKind.ERROR, validator.getMessageKey(), meta));
							}
						}
					}
				}
			}

			Operation op = ctx.getOperation();
			String validationRef = op.getPropertyValue(PropertyInfo.VALID_WHEN);
			if (StringUtils.isNotBlank(validationRef)) {
				Validation validation = op.getDomainObject().getValidation(validationRef);
				if (validation != null) {
					log.debug("Validating [" + validation.getRef() + "] for object [" + meta.getLabel() + "]");
					for (ValidationRule rule : validation.getRules()) {
						Object ret = juelEngine.eval(rule.getExpression());
						if (!(ret instanceof Boolean && ((Boolean) ret).booleanValue())) {
							ctx.getMessages().add(new UserMessage(MessageKind.ERROR, rule.getMessageKey(), meta));
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // TODO handle
		}
		return ctx;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#evalExpressions(br.com.maisha.terra.lang.ModelReference)
	 */
	public void evalExpressions(ModelReference modelInstance) {
		try {
			if (modelInstance == null) {
				return;
			}
			IConverterService convService = ServiceProvider.getInstance().getService(IConverterService.class,
					Activator.getDefault());
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			DomainObject meta = modelInstance.getMeta();

			log.debug("Evaluating expressions for " + meta.getLabel());

			juelEngine.put("this", modelInstance);
			juelEngine.put("meta", meta);

			for (Attribute attr : meta.getAtts()) {
				for (Map.Entry<String, Property> entry : attr.getProperties().entrySet()) {
					Property prop = entry.getValue();

					if (prop.getExpression() != null) {
						Object ret = juelEngine.eval(prop.getExpression());
						ret = convService.convert(PropertyInfo.getPropertyInfo(prop.getPropName()).getType(), ret);
						if (ret != null) {
							log.debug("Attribute [" + attr.getLabel() + "] property value [" + prop.getPropName()
									+ "] evaluated to: " + ret);
							prop.setValue(ret);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // TODO handle
		}
	}

	/** @see #modelListener */
	public IAppModelListenerRegistry getModelListener() {
		return modelListener;
	}

	/** @see #modelListener */
	public void setModelListener(IAppModelListenerRegistry modelListener) {
		this.modelListener = modelListener;
	}

	/** @see #validatorRegisty */
	public ValidatorRegistry getValidatorRegisty() {
		return validatorRegisty;
	}

	/** @see #validatorRegisty */
	public void setValidatorRegisty(ValidatorRegistry validatorRegisty) {
		this.validatorRegisty = validatorRegisty;
	}

	public IStorage getPersistentStorage() {
		return persistentStorage;
	}

	public void setPersistentStorage(IStorage persistentStorage) {
		this.persistentStorage = persistentStorage;
	}

	
	
}
