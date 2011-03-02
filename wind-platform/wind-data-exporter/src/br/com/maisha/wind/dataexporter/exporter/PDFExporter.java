package br.com.maisha.wind.dataexporter.exporter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.xhtmlrenderer.pdf.ITextRenderer;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.dataexporter.Activator;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PDFExporter implements IExporter {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(PDFExporter.class);

	/**
	 * 
	 * @see br.com.maisha.wind.dataexporter.exporter.IExporter#export(java.util.Map,
	 *      java.io.InputStream)
	 */
	public InputStream export(Map<String, Object> model, InputStream template) {
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();;
		try {
			Configuration cfg = new Configuration();
			Template t = new Template("templ", new InputStreamReader(template), cfg);

			StringWriter out = new StringWriter();
			t.process(model, out);

			String xhtml = out.getBuffer().toString();
			ITextRenderer renderer = new ITextRenderer();
			renderer.setDocumentFromString(xhtml);
			renderer.layout();
			renderer.createPDF(baos, true);
			
			bais = new ByteArrayInputStream(baos.toByteArray());
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getDefault().getBundle().getSymbolicName(), e, log);
		} finally{
			IOUtils.closeQuietly(baos);
		}
		return bais;
	}

}
