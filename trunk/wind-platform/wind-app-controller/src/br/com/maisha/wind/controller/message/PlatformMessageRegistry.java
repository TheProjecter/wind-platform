package br.com.maisha.wind.controller.message;

import java.util.List;

import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * 
 * @author Paulo Freitas(pfreitas1@gmail.com)
 * 
 */
public class PlatformMessageRegistry {

	/** */
	List<ResourceBundleMessageSource> messageBundles;

	private static PlatformMessageRegistry instance = null;

	public static PlatformMessageRegistry getInstance() {
		return instance;
	}

	public void init() {
		instance = this;
	}

	public List<ResourceBundleMessageSource> getMessageBundles() {
		return messageBundles;
	}

	public void setMessageBundles(List<ResourceBundleMessageSource> messageBundles) {
		this.messageBundles = messageBundles;
	}

}
