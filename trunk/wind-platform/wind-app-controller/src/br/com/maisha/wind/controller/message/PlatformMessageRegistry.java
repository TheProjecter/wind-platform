package br.com.maisha.wind.controller.message;

import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ResourceBundleMessageSource;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.controller.rcp.Activator;

/**
 * TODO javadoc
 * 
 * @author Paulo Freitas(pfreitas1@gmail.com)
 */
public class PlatformMessageRegistry {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(PlatformMessageRegistry.class);

	/** */
	List<ResourceBundleMessageSource> messageBundles;

	/** */
	private static PlatformMessageRegistry instance = null;

	/** PreferencesService reference. */
	private PreferencesService preferences;

	/**
	 * 
	 * @return
	 */
	public static PlatformMessageRegistry getInstance() {
		return instance;
	}

	/**
	 * 
	 */
	public void init() {
		instance = this;
	}

	/**
	 * 
	 * @return
	 */
	private Locale getCurrentLocale() {
		Locale loc = Locale.getDefault();
		try {
			if (!preferences.getSystemPreferences().nodeExists("/general")) {
				return loc;
			}

			Preferences general = preferences.getSystemPreferences().node("/general");
			String strLocale = general.get("currentLocale", "pt_BR");

			String[] splitted = strLocale.split("_");
			loc = new Locale(splitted[0], splitted[1]);

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		return loc;
	}

	public String getMessage(String key, Object[] param) {
		return getMessage(key, param, getCurrentLocale());
	}

	/**
	 * 
	 * @param key
	 * @param param
	 * @return
	 */
	public String getMessage(String key, Object[] param, Locale locale) {
		String ret = "";

		if (StringUtils.isNotBlank(key)) {
			List<ResourceBundleMessageSource> rbs = PlatformMessageRegistry.getInstance().getMessageBundles();
			for (ResourceBundleMessageSource rb : rbs) {
				try {
					String msg = rb.getMessage(key, param, locale);

					ret = msg;
					break;

				} catch (NoSuchMessageException nsme) {
					// silently igonre
					continue;
				}
			}
		}

		return ret;
	}

	/** @see #messageBundles */
	public List<ResourceBundleMessageSource> getMessageBundles() {
		return messageBundles;
	}

	/** @see #messageBundles */
	public void setMessageBundles(List<ResourceBundleMessageSource> messageBundles) {
		this.messageBundles = messageBundles;
	}

	/** @see #preferences */
	public PreferencesService getPreferences() {
		return preferences;
	}

	/** @see #preferences */
	public void setPreferences(PreferencesService preferences) {
		this.preferences = preferences;
	}

}
