package br.com.maisha.wind.common.converter;

import org.apache.log4j.Logger;

/**
 * Convert from Double to these other types:
 * <ul>
 * <li>{@link Integer}</li>
 * </ul>
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DoubleConverter implements IConverter {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(DoubleConverter.class);

	/**
	 * Convert the given {@link String} to {@link Integer}
	 * 
	 * @param value
	 *            Value to be converted.
	 * @return Converted value.
	 */
	@Converter(fromType = Double.class, toType = Integer.class)
	public Integer toInteger(Double value) {
		try {
			return new Integer(value.intValue());
		} catch (Exception e) {
			log.error("Error while converting [" + value + "] to Integer", e);
			return 0;
		}
	}

}
