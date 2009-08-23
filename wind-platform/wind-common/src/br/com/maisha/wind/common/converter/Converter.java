package br.com.maisha.wind.common.converter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Converter {

	Class<?> fromType();

	Class<?> toType();

}
