package br.com.maisha.wind.dataexporter;

import java.io.InputStream;
import java.util.Map;

import br.com.maisha.wind.dataexporter.exporter.IExporter;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DataExporter implements IDataExporter {

	/** */
	private Map<String, IExporter> registry;

	/**
	 * 
	 * @see br.com.maisha.wind.dataexporter.IDataExporter#export(java.util.Map,
	 *      java.io.InputStream,
	 *      br.com.maisha.wind.dataexporter.IDataExporter.ExporterType)
	 */
	public InputStream export(Map<String, Object> data, InputStream template, ExporterType type) {
		IExporter exporter = registry.get(type.getType());
		return exporter.export(data, template);
	}

	/** @see #registry */
	public void setRegistry(Map<String, IExporter> registry) {
		this.registry = registry;
	}

}
