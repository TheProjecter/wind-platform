package br.com.maisha.terra;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.exception.MakeClassException;
import br.com.maisha.wind.common.exception.WindException;

/**
 * TODO didn't like this name !! =D
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IClassMaker {

	/**
	 * 
	 * @param dObj
	 * @return
	 * @throws WindException
	 */
	Class<?> make(DomainObject dObj) throws MakeClassException;

}
