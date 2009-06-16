package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;

import br.com.maisha.wind.common.component.Component;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IApplicationManager extends Component {

	/**
	 * 
	 * @return
	 */
	void registerApplication(InputStream appCfg);

}
