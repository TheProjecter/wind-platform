package br.com.maisha.wind.dataexporter.exporter;

import java.io.InputStream;
import java.util.Map;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public interface IExporter {

	/**
	 * 
	 * @param model
	 * @param template
	 * @return
	 */
	InputStream export(Map<String, Object> model, InputStream template);
	
}
