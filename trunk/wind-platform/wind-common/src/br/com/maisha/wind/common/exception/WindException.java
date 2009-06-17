package br.com.maisha.wind.common.exception;

/**
 * Basic exception, should be specialized.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
@SuppressWarnings("serial")
public abstract class WindException extends Exception {

	/**
	 * 
	 */
	public WindException() {
	}
	
	/**
	 * 
	 * @param msg
	 */
	public WindException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param t
	 */
	public WindException(Throwable t) {
		super(t);
	}

}
