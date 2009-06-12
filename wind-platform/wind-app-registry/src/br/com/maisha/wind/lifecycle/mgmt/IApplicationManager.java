package br.com.maisha.wind.lifecycle.mgmt;

import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.lifecycle.model.WindApplication;

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
	WindApplication loadApplication();

}
