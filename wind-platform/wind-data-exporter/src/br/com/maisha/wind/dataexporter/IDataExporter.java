package br.com.maisha.wind.dataexporter;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IDataExporter {

	public static enum ExporterType {

		TEXT("text"), PDF("pdf"), XLS("xls"), CHART("chart");

		private String type;

		private ExporterType(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}

	InputStream export(Map<String, Object> data, File template, ExporterType type);

}
