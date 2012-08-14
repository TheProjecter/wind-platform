/**
 * 
 */
package br.com.maisha.wind.controller.execution;

import java.util.Date;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.controller.rcp.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class ScriptExecutor implements IScriptExecutor{

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ScriptExecutor.class);

	/** Reference to the script engine manager. */
	private ScriptEngineManager engineManager;
	
	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IScriptExecutor#runScript(java.lang.String, java.util.Map)
	 */
	public Object runScript(String script, Map<String, Object> context) {
		return runScript("juel", script, context);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IScriptExecutor#runScript(java.lang.String, java.lang.String, java.util.Map)
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

	

	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IScriptExecutor#getObjectValue(java.lang.Object, java.lang.String)
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
	 * @see br.com.maisha.wind.controller.execution.IScriptExecutor#evalExpressions(br.com.maisha.terra.lang.ModelReference)
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
							log.debug("Attribute [" + attr.getRef() + "] property value [" + prop.getPropName()
									+ "] evaluated to: " + ret);
							prop.setValue(ret);

							// TODO rever o porque disso; Desabilitado pois
							// causa stack overflow.
							// se for a propriedade value, setta o valor no
							// model tambem
							// if
							// (PropertyInfo.VALUE.getPropName().equals(prop.getPropName()))
							// {
							// juelEngine.put("val", ret);
							// juelEngine.eval("${this.set" +
							// StringUtils.capitalize(attr.getRef()) +
							// "(val)}");
							// }
						}
					}
				}
			}
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	
	/** @see ScriptExecutor#engineManager */
	public void setEngineManager(ScriptEngineManager engineManager) {
		this.engineManager = engineManager;
	}
}
