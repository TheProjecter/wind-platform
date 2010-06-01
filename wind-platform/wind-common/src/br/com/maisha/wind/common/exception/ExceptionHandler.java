package br.com.maisha.wind.common.exception;

import java.util.Date;

import org.apache.log4j.Logger;

import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ExceptionHandler {

	/** */
	private IAppModelListenerRegistry modelListener;

	/** */
	private static ExceptionHandler instance = null;

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
	public static ExceptionHandler getInstance() {
		return instance;
	}

	/**
	 * Handle an Throwable by logging it into Log4J and firing an event of a
	 * model changed at Exception level.
	 * 
	 * @param symbolicName
	 * @param t
	 * @param log
	 */
	public void handle(final String symbolicName, final Throwable t, final Logger log) {
		log.error(t.getMessage(), t);

		ErrorLog error = new ErrorLog();
		error.setCreationDate(new Date());
		error.setBundleId(symbolicName);
		error.setThrowable(t);

		modelListener.fireEvent(null, error, LevelType.Exception, ChangeType.Added);
	}

	/** @see #modelListener */
	public IAppModelListenerRegistry getModelListener() {
		return modelListener;
	}

	/** @see #modelListener */
	public void setModelListener(IAppModelListenerRegistry modelListener) {
		this.modelListener = modelListener;
	}

}
