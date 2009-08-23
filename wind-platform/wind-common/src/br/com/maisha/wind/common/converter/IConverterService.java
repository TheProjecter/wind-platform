package br.com.maisha.wind.common.converter;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IConverterService {

	/**
	 * 
	 * @param <T>
	 * @param type
	 * @param value
	 * @return
	 */
	<T extends Object> T convert(Class<T> type, Object value);

	/**
	 * 
	 * @param converter
	 */
	void registerConverter(IConverter converter);

	/**
	 * 
	 * @param converter
	 */
	void removeConverter(IConverter converter);
}
