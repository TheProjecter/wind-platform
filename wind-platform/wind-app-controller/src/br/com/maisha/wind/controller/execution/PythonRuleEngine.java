package br.com.maisha.wind.controller.execution;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.controller.execution.api.RuleAPI;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * Rule engine for python business rules.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PythonRuleEngine implements IRuleEngine {

	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IRuleEngine#execute(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	@SuppressWarnings("unchecked")
	public ExecutionContext<ModelReference> execute(
			ExecutionContext<ModelReference> ctx) {
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("python");
			Invocable invocable = (Invocable) engine;

			Operation op = ctx.getOperation();
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

			ctx = (ExecutionContext<ModelReference>) invocable.invokeMethod(o,
					"execute");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ctx;
	}
}
