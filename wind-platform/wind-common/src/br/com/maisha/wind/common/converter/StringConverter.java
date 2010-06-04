package br.com.maisha.wind.common.converter;

import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Convert from String to these other types:
 * <ul>
 * <li>{@link Integer}</li>
 * <li>{@link Double}</li>
 * <li>{@link Date}</li>
 * </ul>
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class StringConverter implements IConverter {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(StringConverter.class);

	/**
	 * Convert the given {@link String} to {@link Integer}
	 * 
	 * @param value
	 *            Value to be converted.
	 * @return Converted value.
	 */
	@Converter(fromType = String.class, toType = Integer.class)
	public Integer toInteger(String value) {
		try {
			return new Integer(value);
		} catch (Exception e) {
			log.error("Error while converting [" + value + "] to Integer", e);
			return 0;
		}
	}

	/**
	 * Convert the given {@link String} to {@link Double}
	 * 
	 * @param value
	 *            Value to be converted.
	 * @return Converted value.
	 */
	@Converter(fromType = String.class, toType = Double.class)
	public Double toDouble(String value) {
		try {
			return new Double(value);
		} catch (Exception e) {
			log.error("Error while converting [" + value + "] to Double", e);
			return .0; 
		}
	}

	@Converter(fromType = String.class, toType = Boolean.class)
	public Boolean toBool(String value) {
		try {
			return new Boolean(value);
		} catch (Exception e) {
			log.error("Error while converting [" + value + "] to Boolean", e);
			return false; 
		}

	}

}
