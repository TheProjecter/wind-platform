package br.com.maisha.wind.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Validation;
import br.com.maisha.terra.lang.ValidationRule;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.common.user.IUserContext.UserData;
import br.com.maisha.wind.controller.execution.BasicRule;
import br.com.maisha.wind.controller.execution.IScriptExecutor;
import br.com.maisha.wind.controller.execution.el.ELListener;
import br.com.maisha.wind.controller.model.Breadcrumb;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
import br.com.maisha.wind.controller.rcp.Activator;
import br.com.maisha.wind.controller.validator.IValidator;
import br.com.maisha.wind.controller.validator.ValidatorRegistry;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;
import br.com.maisha.wind.storage.IStorage;

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
	private ScriptEngineManager engineManager;

	/** Script Executor */
	private IScriptExecutor scriptExecutor;

	/** Model listeners for message model. */
	private IAppModelListenerRegistry modelListenerRegistry;

	/** Validator Registry. */
	private ValidatorRegistry validatorRegisty;

	/** Persistent storage (common implementation with hibernate) */
	private IStorage persistentStorage;

	/** The application registry. */
	private IApplicationRegistry registry;

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#runOperation(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	public ExecutionContext<ModelReference> runOperation(ExecutionContext<ModelReference> ctx) {
		try {
			// gets the operation to be executed
			Operation op = ctx.getOperation();

			// validation phase
			if (op.getPropertyValue(PropertyInfo.VALIDATE) && ctx.getInstance() != null && ctx.getMeta() != null) {
				ctx = processValidations(ctx);
				if (!ctx.getMessages().isEmpty()) {
					return ctx;
				}
			}

			// run!
			BasicRule rule = new BasicRule(op);
			ctx = rule.run(ctx);

			// fires an event for the interested parts react
			modelListenerRegistry.fireEvent(ctx.getUserContext(), null, ctx.getOperation().getDomainObject(),
					LevelType.Object, ChangeType.ValueChanged);

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		return ctx;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#processExecutionContext(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	public ModelReference processExecutionContext(ExecutionContext<ModelReference> ctx) {

		// process messages
		if (ctx.getMessages() != null && !ctx.getMessages().isEmpty()) {
			modelListenerRegistry.fireEvent(ctx.getUserContext(), null, ctx.getMessages(), LevelType.Message,
					ChangeType.Added);
		}

		// process grid data
		modelListenerRegistry.fireEvent(ctx.getUserContext(), null, ctx.getGridData(), LevelType.GridData,
				ChangeType.ValueChanged);

		// create a new opened instance
		return openObjectInstance(ctx.getUserContext(), createNewInstance(ctx.getUserContext(), ctx.getMeta()));
	}

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	public ExecutionContext<ModelReference> processValidations(ExecutionContext<ModelReference> ctx) {
		try {
			ModelReference modelInstance = ctx.getInstance();
			DomainObject meta = ctx.getMeta();

			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			juelEngine.put("this", modelInstance);
			juelEngine.put("meta", meta);

			// validate bean constraints
			for (Attribute att : meta.getAtts()) {
				for (Map.Entry<String, Property> prop : att.getProperties().entrySet()) {
					boolean validate = PropertyInfo.getPropertyInfo(prop.getKey()).isValidate();
					boolean visible = att.getPropertyValue(PropertyInfo.VISIBLE_IN_EDITION);

					// property validation
					if (visible && validate) {
						Object value = juelEngine.eval("${this." + att.getRef() + "}");

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
	 * @see br.com.maisha.wind.controller.IApplicationController#filter(br.com.maisha.wind.common.user.IUserContext,
	 *      br.com.maisha.terra.lang.DomainObject)
	 */
	@SuppressWarnings("unchecked")
	public List<ModelReference> filter(IUserContext userContext, DomainObject dObj) {
		List<ModelReference> ret = Collections.EMPTY_LIST;

		// procura por operacao "filtro"
		Operation filterOp = null;
		List<Operation> ops = dObj.getOperations();
		for (Operation op : ops) {
			if (op.getPropertyValue(PropertyInfo.IS_FILTER)) {
				filterOp = op;
				break;
			}
		}

		if (filterOp != null) {
			// utiliza operacao filtro
			ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
			ctx.setOperation(filterOp);
			ctx.setMeta(dObj);
			ctx.setInstance(createNewInstance(userContext, dObj));
			ctx.setUserContext(userContext);

			runOperation(ctx);
			ret = ctx.getGridData();
		} else {
			// nenhuma operacao filtro especificada... utiliza getAll
			ret = persistentStorage.getAll(dObj);
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
					if (!attr.isGroupAttribute() && StringUtils.isEmpty(attr.getPropertyValue(PropertyInfo.ONTOMANY))) {
						map.put(attr.getRef(), juelEngine.eval("${ref." + attr.getRef() + "}"));
					}
				}
				map.put("REF", ref);
				lstMap.add(map);
			}
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

		return lstMap;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#openObjectInstance(br.com.maisha.wind.common.user.IUserContext,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public ModelReference openObjectInstance(IUserContext userContext, ModelReference ref) {
		ModelReference currentInstance = null;
		if (ref.getId() != null && ref.getId() > 0) {
			DomainObject meta = registry.getObject(ref.getAppId(), ref.getObjId());
			WindApplication app = registry.retrieve(ref.getAppId());

			if (app == null) {
				log.error("Unknow Wind Application [" + ref.getAppId() + "]");
				return null;
			}

			IStorage storage = app.getBean(IStorage.BEAN_NAME, IStorage.class);
			currentInstance = storage.loadFullEntity(meta, ref.getId());
		}

		userContext.storeUserData(UserData.OPENED_INSTANCE, currentInstance);
		modelListenerRegistry
				.fireEvent(userContext, null, currentInstance, LevelType.Object, ChangeType.InstanceOpened);
		return currentInstance;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#createNewInstance(br.com.maisha.wind.common.user.IUserContext,
	 *      br.com.maisha.terra.lang.DomainObject)
	 */
	public ModelReference createNewInstance(IUserContext userContext, DomainObject dObj) {
		ModelReference instance = null;
		try {
			instance = (ModelReference) dObj.getObjectClass().newInstance();
			instance.setMeta(dObj);

			// configures Application Id and Object Id in the recently created
			// instance.
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("ref", instance);
			context.put("appId", dObj.getApplication().getAppId());
			context.put("objId", dObj.getRef());
			scriptExecutor.runScript("${ref.setAppId(appId)}", context);
			scriptExecutor.runScript("${ref.setObjId(objId)}", context);

			// configures relationships many-to-one with a new HashSet;
			for (Attribute att : dObj.getAtts()) {
				if (StringUtils.isNotBlank(att.getPropertyValue(PropertyInfo.ONTOMANY))) {
					// relationship identified
					context.put("hSet", new HashSet<Object>());
					scriptExecutor.runScript("${ref.set" + StringUtils.capitalize(att.getRef()) + "(hSet)}", context);
				}
			}

			// evaluates metaobject attribute expressions
			scriptExecutor.evalExpressions(instance);

			// if there is a navigation trail, then we must link this brand new
			// instance to the instance originating the navigation.
			Breadcrumb trail = userContext.getUserData(UserData.NAVIGATION_TRAIL);
			if (trail != null) {
				Attribute originatingAttribute = trail.getOriginatingAttribute();
				DomainObject related = registry.getObject(originatingAttribute.getDomainObject().getApplication()
						.getAppId(), originatingAttribute.getType());

				String mappedByRef = originatingAttribute.getPropertyValue(PropertyInfo.ONTOMANY);
				Attribute mappedBy = related.getAttribute(mappedByRef);
				mappedBy.getProperties().put(PropertyInfo.DISABLED.getPropName(),
						new Property(PropertyInfo.DISABLED.getPropName(), true));

				Map<String, Object> vars = new HashMap<String, Object>();
				vars.put("ref", instance);
				vars.put("o", trail.getOriginatingModelRef());
				scriptExecutor.runScript("${ref.set" + StringUtils.capitalize(mappedBy.getRef()) + "(o)}", vars);
			}

			// listen for changes in the values of instance attributes and
			// reevaluate the metaobject
			instance.addPropertyChangeListener(new ELListener());

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

		return instance;

	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#openObject(java.lang.String,
	 *      java.lang.String, br.com.maisha.wind.common.user.IUserContext)
	 */
	public DomainObject openObject(String appId, String objectId, IUserContext userContext) {
		DomainObject obj = registry.getObject(appId, objectId);
		openObject(obj, userContext);
		userContext.storeUserData(UserData.OPENED_OBJECT, obj);
		return obj;
	}

	/**
	 * 
	 * @param obj
	 * @param sessid
	 */
	private void openObject(DomainObject obj, IUserContext userContext) {
		modelListenerRegistry.fireEvent(userContext, null, obj, LevelType.Object, ChangeType.BeforeObjectOpen);
		modelListenerRegistry.fireEvent(userContext, null, obj, LevelType.Object, ChangeType.ObjectOpen);
		modelListenerRegistry.fireEvent(userContext, null, obj, LevelType.Object, ChangeType.AfterObjectOpen);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#closeObject(java.lang.String,
	 *      java.lang.String, br.com.maisha.wind.common.user.IUserContext)
	 */
	public void closeObject(String appId, String objectId, IUserContext userContext) {
		DomainObject obj = registry.getObject(appId, objectId);
		closeObject(obj, userContext);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#navigateFrom(br.com.maisha.wind.common.user.IUserContext,
	 *      br.com.maisha.terra.lang.Attribute,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void navigateFrom(IUserContext userContext, Attribute originatingAttribute, ModelReference ref) {
		DomainObject originating = originatingAttribute.getDomainObject();
		final DomainObject related = registry.getObject(originating.getApplication().getAppId(),
				originatingAttribute.getType());

		Breadcrumb trail = userContext.getUserData(UserData.NAVIGATION_TRAIL);
		Breadcrumb bc = new Breadcrumb(trail, originatingAttribute, ref);
		userContext.storeUserData(UserData.NAVIGATION_TRAIL, bc);

		closeObject(originating, userContext);
		openObject(related, userContext);
	}

	/**
	 * 
	 * @param dObj
	 */
	private void closeObject(DomainObject dObj, IUserContext userContext) {
		modelListenerRegistry.fireEvent(userContext, null, dObj, LevelType.Object, ChangeType.BeforeObjectClose);
		modelListenerRegistry.fireEvent(userContext, null, dObj, LevelType.Object, ChangeType.ObjectClose);
		modelListenerRegistry.fireEvent(userContext, null, dObj, LevelType.Object, ChangeType.AfterObjectClose);
	}

	/** @see #modelListenerRegistry */
	public IAppModelListenerRegistry getModelListener() {
		return modelListenerRegistry;
	}

	/** @see #modelListenerRegistry */
	public void setModelListener(IAppModelListenerRegistry modelListener) {
		this.modelListenerRegistry = modelListener;
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

	/** @see ApplicationController#engineManager */
	public void setEngineManager(ScriptEngineManager engineManager) {
		this.engineManager = engineManager;
	}

	/** @see ApplicationController#scriptExecutor */
	public void setScriptExecutor(IScriptExecutor scriptExecutor) {
		this.scriptExecutor = scriptExecutor;
	}
}
