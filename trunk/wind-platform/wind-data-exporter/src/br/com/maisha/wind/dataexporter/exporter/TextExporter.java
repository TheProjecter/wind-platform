package br.com.maisha.wind.dataexporter.exporter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Map;

import org.apache.log4j.Logger;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.dataexporter.Activator;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.Configuration;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleHash;
import freemarker.template.Template;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TextExporter implements IExporter {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(TextExporter.class);

	/**
	 * 
	 * @see br.com.maisha.wind.dataexporter.exporter.IExporter#export(java.util.Map,
	 *      java.io.InputStream)
	 */
	public InputStream export(Map<String, Object> model, InputStream template) {
		ByteArrayInputStream bais = null;
		try {
			Configuration cfg = new Configuration();
			Template t = new Template("templ", new InputStreamReader(template), cfg);

			StringWriter out = new StringWriter();
			t.process(model, out);

			bais = new ByteArrayInputStream(out.getBuffer().toString().getBytes());
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getDefault().getBundle().getSymbolicName(), e, log);
		}
		return bais;
	}

}
