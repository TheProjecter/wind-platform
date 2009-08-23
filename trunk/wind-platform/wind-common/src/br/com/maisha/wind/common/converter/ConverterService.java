package br.com.maisha.wind.common.converter;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * TODO javadoc!
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ConverterService implements IConverterService {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ConverterService.class);

	/** Registered converters on the service. */
	private List<IConverter> converters = new ArrayList<IConverter>();

	/** Registro contendo os metodos que realizam a conversao de tipos. */
	private Map<ConverterKey, ConverterMethod> convertersRegistry = new HashMap<ConverterKey, ConverterMethod>();

	/**
	 * 
	 * @see br.com.maisha.wind.common.converter.IConverterService#convert(java.lang.Class,
	 *      java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public <T> T convert(Class<T> type, Object value) {
		Class<?> fromType = value.getClass();

		try {
			ConverterKey key = new ConverterKey();
			key.setFrom(fromType);
			key.setTo(type);

			ConverterMethod method = convertersRegistry.get(key);
			if (method == null) {
				log.error("Dont know how to convert [" + fromType + "] to ["
						+ type + "]");
				return null;
			}

			Method m = method.getMethod();
			Object ref = method.getRef();

			return (T) m.invoke(ref, value);
		} catch (Exception e) {
			// TODO handle
			log.error(e.getMessage(), e);
		}

		return null;
	}

	/**
	 * TODO javadoc
	 */
	private void setupConverters() {
		for (IConverter conv : converters) {
			for (Method m : conv.getClass().getMethods()) {
				if (m.isAnnotationPresent(Converter.class)) {
					Converter cInfo = m.getAnnotation(Converter.class);
					Class<?> fromType = cInfo.fromType();
					Class<?> toType = cInfo.toType();

					ConverterKey key = new ConverterKey();
					key.setFrom(fromType);
					key.setTo(toType);

					ConverterMethod method = new ConverterMethod();
					method.setKey(key);
					method.setMethod(m);
					method.setRef(conv);

					convertersRegistry.put(key, method);
				}
			}
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.common.converter.IConverterService#registerConverter(br.com.maisha.wind.common.converter.IConverter)
	 */
	public void registerConverter(IConverter converter) {
		if (!converters.contains(converter)) {
			converters.add(converter);
		} else {
			log.warn("Converter [" + converter + "] already registered");
		}

	}

	/**
	 * 
	 * @see br.com.maisha.wind.common.converter.IConverterService#removeConverter(br.com.maisha.wind.common.converter.IConverter)
	 */
	public void removeConverter(IConverter converter) {
		converters.remove(converter);
	}

	/** @see ConverterService#converters */
	public void setConverters(List<IConverter> converters) {
		this.converters = converters;
	}

}
