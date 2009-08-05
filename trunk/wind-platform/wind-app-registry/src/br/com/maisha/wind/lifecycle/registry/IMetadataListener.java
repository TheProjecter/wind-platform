package br.com.maisha.wind.lifecycle.registry;

import br.com.maisha.wind.lifecycle.model.WindApplication;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public interface IMetadataListener {

	/**
	 * 
	 * @param app
	 */
	void metadataChanged(WindApplication app);
	
}
