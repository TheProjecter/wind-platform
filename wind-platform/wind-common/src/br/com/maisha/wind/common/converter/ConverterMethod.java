package br.com.maisha.wind.common.converter;

import java.lang.reflect.Method;

public class ConverterMethod {

	private ConverterKey key;

	private Object ref;

	private Method method;

	public ConverterKey getKey() {
		return key;
	}

	public void setKey(ConverterKey key) {
		this.key = key;
	}

	public Object getRef() {
		return ref;
	}

	public void setRef(Object ref) {
		this.ref = ref;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

}
