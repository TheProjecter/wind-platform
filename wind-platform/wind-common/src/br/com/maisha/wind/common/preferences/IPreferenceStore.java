package br.com.maisha.wind.common.preferences;

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
	
}
