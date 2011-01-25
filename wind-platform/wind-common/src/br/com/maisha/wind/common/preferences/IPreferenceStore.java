package br.com.maisha.wind.common.preferences;

import org.osgi.service.prefs.Preferences;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IPreferenceStore {

	/**
	 * 
	 * @param node
	 * @param key
	 * @param value
	 */
	void put(String node, String key, String value);

	/**
	 * 
	 * @param node
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	String get(String node, String key, String defaultValue);
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	Preferences getNode(String node);
	
}
