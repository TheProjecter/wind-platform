package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.component.Component;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IAppCfgReader extends Component {

	/**
	 * 
	 * @param is
	 * @return
	 * @throws Exception
	 */
	WindApplication read(InputStream is) throws Exception;

}
