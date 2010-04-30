package br.com.maisha.wind.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Map;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.Activator;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.execution.api.RuleAPI;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationController implements IApplicationController {

	/** Log ref. */
	private static final Logger log = Logger
			.getLogger(ApplicationController.class);

	/** Reference to the script engine manager. */
	private ScriptEngineManager engineManager = new ScriptEngineManager();

	/** Model listeners for message model. */
	private IAppModelListenerRegistry modelListener;

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#runOperation(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	@SuppressWarnings("unchecked")
	public ExecutionContext<ModelReference> runOperation(
			ExecutionContext<ModelReference> ctx) {

		try {
			IProgressMonitor monitor = ctx.getMonitor();

			// validation phase
			monitor.setTaskName("Validating...");
			monitor.worked(10);

			// run operation
			monitor.setTaskName("Executing operation...");
			Operation op = ctx.getOperation();
			ScriptEngine engine = engineManager.getEngineByName(op.getType());
			Invocable invocable = (Invocable) engine;

			BundleContext bundle = ctx.getOperation().getDomainObject()
					.getApplication().getBundleContext();

			URL ruleUrl = bundle.getBundle().getEntry(
					"/src/" + op.getPropertyValue(PropertyInfo.FILE));

			InputStream is = ruleUrl.openStream();
			Reader r = new InputStreamReader(is);

			engine.eval(r);
			engine.put("ctx", ctx);
			engine.put("api", new RuleAPI(ctx));
			engine.eval("rule = " + op.getRef() + "(ctx, api)");
			Object o = engine.get("rule");

			monitor.worked(5);
			ctx = (ExecutionContext<ModelReference>) invocable.invokeMethod(o,
					"execute");
			
			if (ctx.getMessages() != null && !ctx.getMessages().isEmpty()) {
				modelListener.fireEvent(null, ctx.getMessages(),
						LevelType.Message, ChangeType.Added);
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
			if(modelInstance == null){
				return;
			}
			IConverterService convService = ServiceProvider
					.getInstance()
					.getService(IConverterService.class, Activator.getDefault());
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");
			DomainObject meta = modelInstance.getMeta();

			log.debug("Evaluating expressions for " + meta.getLabel());

			juelEngine.put("this", modelInstance);
			juelEngine.put("meta", meta);

			for (Attribute attr : meta.getAtts()) {
				for (Map.Entry<String, Property> entry : attr.getProperties()
						.entrySet()) {
					Property prop = entry.getValue();

					if (prop.getExpression() != null) {
						Object ret = juelEngine.eval(prop.getExpression());
						ret = convService.convert(PropertyInfo.getPropertyInfo(
								prop.getPropName()).getType(), ret);
						if (ret != null) {
							log.debug("Attribute [" + attr.getLabel()
									+ "] property value [" + prop.getPropName()
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

}
