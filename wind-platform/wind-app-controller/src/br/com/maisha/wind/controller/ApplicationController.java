package br.com.maisha.wind.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Map;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.controller.execution.api.RuleAPI;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * TODO javadoc.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationController implements IApplicationController {

	private ScriptEngineManager engineManager = new ScriptEngineManager();

	/**
	 * 
	 * @see br.com.maisha.wind.controller.IApplicationController#runOperation(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	public ExecutionContext<ModelReference> runOperation(ExecutionContext<ModelReference> ctx) {

		try {
			// validation phase
			
			
			
			// run operation
			Operation op = ctx.getOperation();
			ScriptEngine engine = engineManager.getEngineByName(op.getType());
			Invocable invocable = (Invocable) engine;

			BundleContext bundle = ctx.getOperation().getDomainObject().getApplication().getBundleContext();

			URL ruleUrl = bundle.getBundle().getEntry("/src/" + op.getPropertyValue(PropertyInfo.FILE));

			InputStream is = ruleUrl.openStream();
			Reader r = new InputStreamReader(is);

			engine.eval(r);
			engine.put("ctx", ctx);
			engine.put("api", new RuleAPI(ctx));
			engine.eval("rule = " + op.getRef() + "(ctx, api)");
			Object o = engine.get("rule");

			ctx = (ExecutionContext<ModelReference>) invocable.invokeMethod(o, "execute");

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
			ScriptEngine juelEngine = engineManager.getEngineByName("juel");

			DomainObject meta = modelInstance.getMeta();

			juelEngine.put("this", modelInstance);

			for (Attribute attr : meta.getAtts()) {
				for (Map.Entry<String, Property> entry : attr.getProperties().entrySet()) {
					Property prop = entry.getValue();

					if (prop.getExpression() != null) {
						Object ret = juelEngine.eval(prop.getExpression());
						if (ret != null) {
							prop.setValue(ret);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // TODO handle
		}
	}

}
