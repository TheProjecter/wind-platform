package br.com.maisha.wind.common.exception;

import java.util.Date;

/**
 * Encapsulates the information of a Throwable.
 * 
 * @author Paulo Freitas (pfreitas1@gmal.com)
 * 
 */
public class ErrorLog {

	/** */
	private Throwable throwable;

	/** */
	private String bundleId;

	/** */
	private Date creationDate;

	/** @see #throwable */
	public Throwable getThrowable() {
		return throwable;
	}

	/** @see #throwable */
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	/** @see #bundleId */
	public String getBundleId() {
		return bundleId;
	}

	/** @see #bundleId */
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	/** @see #creationDate */
	public Date getCreationDate() {
		return creationDate;
	}

	/** @see #creationDate */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
