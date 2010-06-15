package br.com.maisha.wind.controller.message;

import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ResourceBundleMessageSource;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.preferences.IPreferenceStore;
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
	private List<ResourceBundleMessageSource> messageBundles;

	/** */
	private IPreferenceStore prefStore;

	/** */
	private static PlatformMessageRegistry instance = null;

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
	public Locale getCurrentLocale() {
		Locale loc = Locale.getDefault();
		try {
			String strLocale = prefStore.get("general", "currentLocale", "pt_BR");
			String[] split = strLocale.split("_");
			loc = new Locale(split[0], split[1]);
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
		return loc;
	}

	/**
	 * 
	 * @param key
	 * @param def
	 * @return
	 */
	public String getPreference(String key, String def) {
		return prefStore.get("general", key, def);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public String getMessage(String key) {
		return getMessage(key, null, getCurrentLocale());
	}

	/**
	 * 
	 * @param key
	 * @param param
	 * @return
	 */
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

	/** @see #prefStore */
	public IPreferenceStore getPrefStore() {
		return prefStore;
	}

	/** @see #prefStore */
	public void setPrefStore(IPreferenceStore prefStore) {
		this.prefStore = prefStore;
	}

}
