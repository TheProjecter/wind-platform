package br.com.maisha.wind.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
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
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.preferences.IPreferenceStore;
import br.com.maisha.wind.controller.execution.BasicRule;
import br.com.maisha.wind.controller.execution.el.ELListener;
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
			modelListenerRegistry.fireEvent(ctx.getSessid(), null, ctx.getOperation().getDomainObject(),
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
			modelListenerRegistry.fireEvent(ctx.getSessid(), null, ctx.getMessages(), LevelType.Message,
					ChangeType.Added);
		}

		// process grid data
		modelListenerRegistry.fireEvent(ctx.getSessid(), null, ctx.getGridData(), LevelType.GridData,
				ChangeType.ValueChanged);

		// create a new opened instance
		return openObjectInstance(ctx.getSessid(), createNewInstance(ctx.getMeta()));
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
	 * @see br.com.maisha.wind.controller.IApplicationController#evalExpressions(br.com.maisha.terra.lang.ModelReference)
	 */
	public void evalExpressions(ModelReference modelInstance) {
		try {
			if (modelInstance == null) {
				return;
			}

			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			DomainObject meta = modelInstance.getMeta();

			if (meta == null) {
				return;
			}

			log.debug("Evaluating expressions for " + meta.getLabel());

			juelEngine.put("this", modelInstance);
			juelEngine.put("meta", meta);
			juelEngine.put("currDate", new Date());

			for (Attribute attr : meta.getAtts()) {
				for (Map.Entry<String, Property> entry : attr.getProperties().entrySet()) {
					Property prop = entry.getValue();

					if (prop.getExpression() != null) {
						Object ret = juelEngine.eval(prop.getExpression());

						if (ret != null) {
							log.debug("Attribute [" + attr.getLabel() + "] property value [" + prop.getPropName()
									+ "] evaluated to: " + ret);
							prop.setValue(ret);

							// se for a propriedade value, setta o valor no
							// model tambem
							if (PropertyInfo.VALUE.getPropName().equals(prop.getPropName())) {
								juelEngine.put("val", ret);
								juelEngine.eval("${this.set" + StringUtils.capitalize(attr.getRef()) + "(val)}");
							}
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
	 * @see br.com.maisha.wind.controller.IApplicationController#getObjectValue(java.lang.Object,
	 *      java.lang.String)
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
		return runScript("juel", script, context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.controller.IApplicationController#runScript(java.lang
	 * .String, java.lang.String, java.util.Map)
	 */
	public Object runScript(String engineType, String script, Map<String, Object> context) {
		Object ret = null;
		try {
			ScriptEngine engine = engineManager.getEngineByName(engineType);

			if (context != null && !context.isEmpty()) {
				for (Map.Entry<String, Object> entry : context.entrySet()) {
					engine.put(entry.getKey(), entry.getValue());
				}
			}

			ret = engine.eval(script);
		} catch (Exception e) {
			e.printStackTrace();
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.controller.IApplicationController#filter(br.com.maisha
	 * .terra.lang.DomainObject)
	 */
	@SuppressWarnings("unchecked")
	public List<ModelReference> filter(Serializable sessid, DomainObject dObj) {
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
			ctx.setInstance(createNewInstance(dObj));
			ctx.setSessid(sessid);

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
	 * @see br.com.maisha.wind.controller.IApplicationController#configureAllLabels(org.osgi.framework.BundleContext,
	 *      br.com.maisha.terra.lang.WindApplication)
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

				for (Operation op : dObj.getOperations()) {
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
	private String getBundleMessage(ResourceBundle rb, String key) {
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
	public void handleObjectEvent(DomainObject dObj, ChangeType ct, LevelType level) {
		// TODO REDESIGN THIS FUNCTIONALITY
		/*
		 * try { log.debug("	Handling Domain Object Event Level[ " + level +
		 * " ] ChangeType[ " + ct + " ]"); String type = "";
		 * 
		 * String file = dObj.getPropertyValue(PropertyInfo.EVENT_HANDLER); if
		 * (StringUtils.isBlank(file)) { return; }
		 * 
		 * type = file.substring(file.indexOf(".") + 1); OperationType opType =
		 * OperationType.valueOf(type);
		 * 
		 * String className = file.substring(file.lastIndexOf("/") + 1,
		 * file.indexOf("."));
		 * 
		 * ScriptEngine engine = engineManager.getEngineByName(type); Invocable
		 * invocable = (Invocable) engine;
		 * 
		 * BundleContext bundle = dObj.getApplication().getBundleContext(); URL
		 * ruleUrl = bundle.getBundle().getEntry("/" + file);
		 * 
		 * InputStream is = ruleUrl.openStream(); Reader r = new
		 * InputStreamReader(is);
		 * 
		 * // preparing to execute ExecutionContext<ModelReference> ctx = new
		 * ExecutionContext<ModelReference>(); ctx.setInstance(currentInstance);
		 * ctx.setOperation(new Operation(type, className, ct.name()));
		 * ctx.setMeta(dObj);
		 * 
		 * engine.put("model", ctx.getInstance()); engine.put("ctx", ctx);
		 * engine.put("storage", persistentStorage);
		 * 
		 * loadAPI(type, engine); engine.eval(r);
		 * 
		 * engine.eval("rule = " + (opType.getUseNewOperator() ? "new " : "") +
		 * className + "()"); engine.eval("rule.ctx = ctx");
		 * engine.eval("rule.model = model"); Object result =
		 * engine.get("rule");
		 * 
		 * // execute invocable.invokeMethod(result,
		 * StringUtils.uncapitalize(ct.name()), ctx); } catch (Exception e) {
		 * ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e,
		 * log); }
		 */
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.controller.IApplicationController#openObjectInstance
	 * (java.io.Serializable, br.com.maisha.terra.lang.ModelReference)
	 */
	public ModelReference openObjectInstance(Serializable sessid, ModelReference ref) {
		ModelReference currentInstance = null;
		if (ref.getId() > 0) {
			DomainObject meta = registry.getObject(ref.getAppId(), ref.getObjId());
			WindApplication app = registry.retrieve(ref.getAppId());
			
			if (app == null) {
				log.error("Unknow Wind Application [" + ref.getAppId() + "]");
				return null;
			}

			IStorage storage = app.getBean(IStorage.BEAN_NAME, IStorage.class);
			currentInstance = storage.loadFullEntity(meta, ref.getId());
		}
		modelListenerRegistry.fireEvent(sessid, null, currentInstance, LevelType.Object, ChangeType.InstanceOpened);
		return currentInstance;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#createNewInstance(br.com.maisha.terra.lang.DomainObject)
	 */
	public ModelReference createNewInstance(DomainObject dObj) {
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
			runScript("${ref.setAppId(appId)}", context);
			runScript("${ref.setObjId(objId)}", context);

			// configures relationships many-to-one with a new HashSet;
			for (Attribute att : dObj.getAtts()) {
				if (StringUtils.isNotBlank(att.getPropertyValue(PropertyInfo.ONTOMANY))) {
					// relationship identified
					context.put("hSet", new HashSet<Object>());
					runScript("${ref.set" + StringUtils.capitalize(att.getRef()) + "(hSet)}", context);
				}
			}

			// evaluates metaobject attribute expressions
			evalExpressions(instance);

			// listen for changes in the values of instance attributes and
			// reevaluate the metaobject
			instance.addPropertyChangeListener(new ELListener());

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

		return instance;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.controller.IApplicationController#openObject(java.
	 * lang.String, java.lang.String, java.io.Serializable)
	 */
	public DomainObject openObject(String appId, String objectId, Serializable sessid) {
		DomainObject obj = registry.getObject(appId, objectId);
		openObject(obj, sessid);
		return obj;
	}

	/**
	 * 
	 * @param obj
	 */
	private void openObject(DomainObject obj, Serializable sessid) {
		modelListenerRegistry.fireEvent(sessid, null, obj, LevelType.Object, ChangeType.BeforeObjectOpen);
		modelListenerRegistry.fireEvent(sessid, null, obj, LevelType.Object, ChangeType.ObjectOpen);
		modelListenerRegistry.fireEvent(sessid, null, obj, LevelType.Object, ChangeType.AfterObjectOpen);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#closeObject(java
	 * .lang.String, java.lang.String, java.io.Serializable)
	 */
	public void closeObject(String appId, String objectId, Serializable sessid) {
		DomainObject obj = registry.getObject(appId, objectId);
		closeObject(obj, sessid);
	}

	/**
	 * 
	 * @param dObj
	 */
	private void closeObject(DomainObject dObj, Serializable sessid) {
		modelListenerRegistry.fireEvent(sessid, null, dObj, LevelType.Object, ChangeType.BeforeObjectClose);
		modelListenerRegistry.fireEvent(sessid, null, dObj, LevelType.Object, ChangeType.ObjectClose);
		modelListenerRegistry.fireEvent(sessid, null, dObj, LevelType.Object, ChangeType.AfterObjectClose);
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
}
