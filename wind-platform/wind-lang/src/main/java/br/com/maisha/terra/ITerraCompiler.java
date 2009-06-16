package br.com.maisha.terra;

import java.io.File;
import java.io.InputStream;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.component.Component;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface ITerraCompiler extends Component {

	/**
	 * 
	 * @param f
	 * @return
	 */
	DomainObject compile(File f) throws Exception;

	/**
	 * 
	 * @param is
	 * @return
	 */
	DomainObject compile(InputStream is) throws Exception;

}
