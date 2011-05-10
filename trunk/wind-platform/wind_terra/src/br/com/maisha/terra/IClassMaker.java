package br.com.maisha.terra;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.exception.MakeClassException;

/**
 * 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IClassMaker {

	/**
	 * 
	 * @param cLoader
	 * @param app
	 * @throws MakeClassException
	 */
	void makeClasses(ClassLoader cLoader, WindApplication app) throws MakeClassException;

	/**
	 * 
	 * @param app
	 * @throws MakeClassException
	 */
	void detachClasses(WindApplication app) throws MakeClassException;
}
