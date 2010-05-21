package br.com.maisha.wind.controller.message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * 
 * @author Paulo Freitas(pfreitas1@gmail.com)
 * 
 */
public class PlatformMessageRegistry {

	/** */
	private List<ResourceBundleMessageSource> messageBundles = new ArrayList<ResourceBundleMessageSource>();

	/** @see #messageBundles */
	public List<ResourceBundleMessageSource> getMessageBundles() {
		return messageBundles;
	}

	/** @see #messageBundles */
	public void setMessageBundles(List<ResourceBundleMessageSource> messageBundles) {
		this.messageBundles = messageBundles;
	}

}
