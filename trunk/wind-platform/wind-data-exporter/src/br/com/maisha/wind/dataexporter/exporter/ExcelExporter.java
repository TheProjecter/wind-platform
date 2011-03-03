package br.com.maisha.wind.dataexporter.exporter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.dataexporter.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ExcelExporter implements IExporter {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ExcelExporter.class);

	/**
	 * 
	 * @see br.com.maisha.wind.dataexporter.exporter.IExporter#export(java.util.Map,
	 *      java.io.InputStream)
	 */
	public InputStream export(Map<String, Object> model, InputStream template) {
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			XLSTransformer transformer = new XLSTransformer();
			Workbook wb = transformer.transformXLS(template, model);

			baos = new ByteArrayOutputStream();
			wb.write(baos);

			bais = new ByteArrayInputStream(baos.toByteArray());
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getDefault().getBundle().getSymbolicName(), e, log);
		} finally {
			IOUtils.closeQuietly(baos);
		}
		return bais;
	}

}
