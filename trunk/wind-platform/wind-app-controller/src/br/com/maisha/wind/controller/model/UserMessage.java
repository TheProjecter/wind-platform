package br.com.maisha.wind.controller.model;

import java.io.Serializable;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
@SuppressWarnings("serial")
public class UserMessage implements Serializable {

	/** Messages kinds. */
	public static enum MessageKind {
		WARNING, ERROR, INFO, SUCCESS
	};

	/** Kind of message. */
	private MessageKind kind;

	/** Message key to an international message bundle. */
	private String i18nMessage;

	/**
	 * Default constructor.
	 */
	public UserMessage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor configures kind and message key.
	 * 
	 * @param kind
	 *            Message Kind.
	 * @param i18nMessage
	 *            Message Key.
	 */
	public UserMessage(MessageKind kind, String i18nMessage) {
		super();
		this.kind = kind;
		this.i18nMessage = i18nMessage;
	}

	/**
	 * @see #kind
	 * @return Message Kind.
	 */
	public MessageKind getKind() {
		return kind;
	}

	/**
	 * @see #kind
	 * @param kind
	 *            Message Kind.
	 */
	public void setKind(MessageKind kind) {
		this.kind = kind;
	}

	/**
	 * @see #i18nMessage
	 * @return Message Key.
	 */
	public String getI18nMessage() {
		return i18nMessage;
	}

	/**
	 * @see #i18nMessage
	 * @param i18nMessage
	 *            Message Key.
	 */
	public void setI18nMessage(String i18nMessage) {
		this.i18nMessage = i18nMessage;
	}

}
