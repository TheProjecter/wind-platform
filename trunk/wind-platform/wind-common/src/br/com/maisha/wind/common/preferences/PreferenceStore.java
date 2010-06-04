package br.com.maisha.wind.common.preferences;

import org.apache.log4j.Logger;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

import br.com.maisha.wind.common.Activator;
import br.com.maisha.wind.common.exception.ExceptionHandler;

/**
 * 
 * @author paulo.freitas
 * 
 */
public class PreferenceStore implements IPreferenceStore {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(PreferenceStore.class);

	/** */
	private PreferencesService prefService;

	/**
	 * 
	 * @see br.com.maisha.wind.common.preferences.IPreferenceStore#put(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	public void put(String node, String key, String value) {
		try {
			Preferences preferences = prefService.getSystemPreferences().node(node);
			preferences.remove(key);
			preferences.put(key, value);
			preferences.flush();
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.common.preferences.IPreferenceStore#get(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	public String get(String node, String key, String defaultValue) {
		Preferences pref = prefService.getSystemPreferences().node(node);
		return pref.get(key, defaultValue);
	}

	/** @see #prefService */
	public PreferencesService getPrefService() {
		return prefService;
	}

	/** @see #prefService */
	public void setPrefService(PreferencesService prefService) {
		this.prefService = prefService;
	}

}
