package br.com.maisha.wind.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Validation;
import br.com.maisha.terra.lang.ValidationRule;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.terra.lang.Operation.OperationType;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.preferences.IPreferenceStore;
import br.com.maisha.wind.controller.execution.api.RuleAPI;
import br.com.maisha.wind.controller.execution.el.ELListener;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
import br.com.maisha.wind.controller.rcp.Activator;
import br.com.maisha.wind.controller.storage.IStorage;
import br.com.maisha.wind.controller.validator.IValidator;
import br.com.maisha.wind.controller.validator.ValidatorRegistry;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

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

	/** The application registry. */
	private IApplicationRegistry registry;
	
	/** Current model being edited;  */
	private ModelReference currentInstance;

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

			// validation phase
			if(op.getPropertyValue(PropertyInfo.VALIDATE)){
				monitor.setTaskName("Validating...");
				ctx = processValidations(ctx);
				if (!ctx.getMessages().isEmpty()) {
					return ctx;
				}
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
			ctx.setLog(log);
			engine.put("ctx", ctx);
			RuleAPI api = new RuleAPI(ctx);
			api.setPersistentStorage(persistentStorage);
			engine.put("api", api);

			engine.eval("rule = " + (type.getUseNewOperator() ? "new " : "") + op.getRef() + "(ctx, api)");
			Object o = engine.get("rule");

			monitor.worked(5);
			ctx = (ExecutionContext<ModelReference>) invocable.invokeMethod(o, "execute");

			modelListener.fireEvent(null, ctx.getOperation().getDomainObject(), LevelType.Object,
					ChangeType.ValueChanged);
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
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
		
		// process grid data
		modelListener.fireEvent(null, ctx.getGridData(), LevelType.GridData, ChangeType.ValueChanged);
		
	}

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	private ExecutionContext<ModelReference> processValidations(ExecutionContext<ModelReference> ctx) {
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
					boolean visible = att.getPropertyValue(PropertyInfo.VISIBLE);

					Object value = juelEngine.eval("${this." + att.getRef() + "}");

					// property validation
					if (visible && validate) {
						IValidator validator = validatorRegisty.getValidator(prop.getKey());

						if (validator != null) {
							validator.configure(prop.getValue());

							if (!validator.validate(value)) {
								ctx.getMessages().add(
										new UserMessage(MessageKind.ERROR, validator.getMessageKey(), meta, att
												.getLabel(), value, prop.getValue().getValue()));
							}
						}
					}
				}
			}

			// validate operation rules
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
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
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
					Activator.getDefault()); //TODO injetar com spring
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			DomainObject meta = modelInstance.getMeta();

			if(meta == null){
				return;
			}
			
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
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#getObjectValue(java.lang.Object, java.lang.String)
	 */
	public Object getObjectValue(Object instance, String attributeName) {
		Object ret = null;

		try {
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			juelEngine.put("this", instance);
			ret = juelEngine.eval("${this." + attributeName + "}");
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

		return ret;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#runScript(java.lang.String,
	 *      java.util.Map)
	 */
	public Object runScript(String script, Map<String, Object> context) {
		Object ret = null;
		try {
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");

			for (Map.Entry<String, Object> entry : context.entrySet()) {
				juelEngine.put(entry.getKey(), entry.getValue());
			}

			ret = juelEngine.eval(script);
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		return ret;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#filter(br.com.maisha.terra.lang.DomainObject, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings("unchecked")
	public List<ModelReference> filter(DomainObject dobj, IProgressMonitor monitor) {
		List<ModelReference> ret = Collections.EMPTY_LIST;

		// procura por operacao "filtro"
		Operation filterOp = null;
		List<Operation> ops = dobj.getOperations();
		for (Operation op : ops) {
			if (op.getPropertyValue(PropertyInfo.IS_FILTER)) {
				filterOp = op;
				break;
			}
		}

		if (filterOp != null) {
			//utiliza operacao filtro
			ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
			ctx.setOperation(filterOp);
			ctx.setInstance(null); // there is no instance because user just opened the object.
			ctx.setMonitor(monitor);
			runOperation(ctx);
			ret = ctx.getGridData();
		} else {
			//nenhuma operacao filtro especificada... utiliza getAll
			ret = (List<ModelReference>) persistentStorage.getAll(dobj.getApplication().getAppId(), dobj);
			if (ret != null && !ret.isEmpty()) {
				for (ModelReference ref : ret) {
					ref.setMeta(dobj);
				}
			}
		}

		return ret;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#toMap(br.com.maisha.terra.lang.DomainObject,
	 *      java.util.List)
	 */
	public List<Map<String, Object>> toMap(DomainObject obj, List<ModelReference> lst) {

		List<Map<String, Object>> lstMap = new ArrayList<Map<String, Object>>();

		if (lst == null || lst.isEmpty()) {
			return lstMap;
		}

		try {
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");

			for (ModelReference ref : lst) {
				juelEngine.put("ref", ref);
				Map<String, Object> map = new HashMap<String, Object>();
				for (Attribute attr : obj.getAtts()) {
					map.put(attr.getRef(), juelEngine.eval("${ref." + attr.getRef() + "}"));
				}
				map.put("ref", ref);
				lstMap.add(map);
			}
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

		return lstMap;

	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#configureAllLabels(org.osgi.framework.BundleContext)
	 */
	public void configureAllLabels(BundleContext context) {
		List<WindApplication> apps = registry.retrieve();
		if (apps != null) {
			for (WindApplication app : apps) {
				configureAllLabels(context, app);
			}
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#configureAllLabels(org.osgi.framework.BundleContext, br.com.maisha.terra.lang.WindApplication)
	 */
	public void configureAllLabels(BundleContext context, WindApplication app) {

		IPreferenceStore prefs = ServiceProvider.getInstance().getService(IPreferenceStore.class, context);

		String strLoc = prefs.get("general", "currentLocale", "pt_BR"); // TODO
		// constantes
		String[] spltLoc = strLoc.split("_");
		Locale loc = new Locale(spltLoc[0], spltLoc[1]);

		List<ResourceBundle> rbs = app.getResouceBundle(loc);

		if (rbs != null) {
			for (DomainObject dObj : app.getDomainObjects()) {
				for (Attribute attr : dObj.getAtts()) {
					for (ResourceBundle rb : rbs) {
						attr.setI18nLabel(getBundleMessage(rb, attr.getLabel()));
					}
				}
				
				for(Operation op : dObj.getOperations()){
					for (ResourceBundle rb : rbs) {
						op.setI18nLabel(getBundleMessage(rb, op.getLabel()));
					}
				}
			}
		}

	}
	
	/**
	 * 
	 * @param rb
	 * @param key
	 * @return
	 */
	private String getBundleMessage(ResourceBundle rb, String key){
		String ret = "";
		try {
			String label = rb.getString(key);
			if (label != null) {
				ret = label;
			}
		} catch (MissingResourceException mre) {
			ret = key;
		}
		return ret;
	}
	
	/**
	 * 
	 * @param dObj
	 * @param ct
	 * @param level
	 */
	public void handleObjectEvent(DomainObject dObj, ChangeType ct, LevelType level){
		try{
			log.debug("	Handling Domain Object Event Level[ " + level + " ] ChangeType[ " + ct + " ]");
			String type = "";
			
			String file = dObj.getPropertyValue(PropertyInfo.EVENT_HANDLER);
			if(StringUtils.isBlank(file)){
				return;
			}
			
			type = file.substring(file.indexOf(".") + 1);
			OperationType opType = OperationType.valueOf(type);
			
			String className = file.substring(file.lastIndexOf("/") + 1, file.indexOf("."));
			
			ScriptEngine engine = engineManager.getEngineByName(type);
			Invocable invocable = (Invocable) engine;
	
			BundleContext bundle = dObj.getApplication().getBundleContext();
			URL ruleUrl = bundle.getBundle().getEntry("/src/" + file);
	
			InputStream is = ruleUrl.openStream();
			Reader r = new InputStreamReader(is);
			engine.eval(r);
			
			
			// preparing to execute
			ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
			ctx.setLog(log);
			ctx.setInstance(currentInstance);
			ctx.setMonitor(new NullProgressMonitor());
			
			RuleAPI api = new RuleAPI(ctx);
			api.setPersistentStorage(persistentStorage);
			
			engine.put("ctx", ctx);
			engine.put("api", api);
	
			engine.eval("rule = " + (opType.getUseNewOperator() ? "new " : "") + className + "(ctx, api)");
			Object result = engine.get("rule");
			
			//execute
			invocable.invokeMethod(result, StringUtils.uncapitalize(ct.name()), ctx);
		}catch(Exception e){
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		
	}
	

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#openObjectInstance(br.com.maisha.terra.lang.ModelReference)
	 */
	public void openObjectInstance(ModelReference ref) {
		this.currentInstance = ref;
		modelListener.fireEvent(null, ref, LevelType.Object, ChangeType.InstanceOpened);
	}
	
	
	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#createNewInstance(br.com.maisha.terra.lang.DomainObject)
	 */
	public ModelReference createNewInstance(DomainObject dObj) {
		try{
			currentInstance = (ModelReference) dObj.getObjectClass().newInstance();
			currentInstance.setMeta(dObj);

			// configures Application Id and Object Id in the recently created instance.
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("ref", currentInstance);
			context.put("appId", dObj.getApplication().getAppId());
			context.put("objId", dObj.getRef());
			runScript("${ref.setAppId(appId)}", context);
			runScript("${ref.setObjId(objId)}", context);

			// evaluates metaobject attribute expressions
			evalExpressions(currentInstance);
			
			// listen for changes in the values of instance attributes and reevaluate the metaobject 
			currentInstance.addPropertyChangeListener(new ELListener());
		}catch(Exception e){
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		return currentInstance;
	}
	
	
	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#getCurrentModelInstance()
	 */
	public ModelReference getCurrentModelInstance() {
		return currentInstance;
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

	/** @see ApplicationController#persistentStorage */
	public IStorage getPersistentStorage() {
		return persistentStorage;
	}

	/** @see ApplicationController#persistentStorage */
	public void setPersistentStorage(IStorage persistentStorage) {
		this.persistentStorage = persistentStorage;
	}

	/** @see ApplicationController#registry */
	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}
}
