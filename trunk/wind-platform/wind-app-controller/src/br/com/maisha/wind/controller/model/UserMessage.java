package br.com.maisha.wind.controller.model;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ResourceBundleMessageSource;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;

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

	/** Timestamp indicating when this message was created. */
	private Date created;

	/** A identifier of the object that fired this message. */
	private DomainObject source;

	/** Params to place at the message. */
	private List<Object> param;

	/** i18n converted and formatted with the params. */
	private String formattedMessage;

	/**
	 * Default constructor.
	 */
	public UserMessage() {
	}

	/**
	 * Constructor configures kind, message key, source and params.
	 * 
	 * @param kind
	 *            Message Kind.
	 * @param i18nMessage
	 *            Message Key.
	 */
	public UserMessage(MessageKind kind, String i18nMessage, DomainObject source) {
		this.kind = kind;
		this.i18nMessage = i18nMessage;
		this.source = source;
		this.created = new Date();
		this.param = new ArrayList<Object>();

	}

	/**
	 * Constructor configures kind, message key, source and params.
	 * 
	 * @param kind
	 *            Message Kind.
	 * @param i18nMessage
	 *            Message Key.
	 */
	public UserMessage(MessageKind kind, String i18nMessage, DomainObject source, Object... params) {
		this.kind = kind;
		this.i18nMessage = i18nMessage;
		this.source = source;
		this.created = new Date();
		this.param = new ArrayList<Object>();
		if (params != null) {
			for (Object o : params) {
				param.add(o);
			}
		}
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

	/** @see #created */
	public Date getCreated() {
		return created;
	}

	/** @see #created */
	public void setCreated(Date created) {
		this.created = created;
	}

	/** @see #source */
	public DomainObject getSource() {
		return source;
	}

	/** @see #source */
	public void setSource(DomainObject source) {
		this.source = source;
	}

	/** @see #param */
	public List<Object> getParam() {
		return param;
	}

	/** @see #param */
	public void setParam(List<Object> param) {
		this.param = param;
	}

	/** @see #formattedMessage */
	public String getFormattedMessage() {
		// resolve msg somente na primeira vez
		if (formattedMessage == null) {
			List<ResourceBundle> rbs = this.source.getApplication().getResouceBundle();
			if (rbs != null) {
				for (ResourceBundle rb : rbs) {
					try {
						String msg = rb.getString(i18nMessage);
						if (msg != null) {
							formattedMessage = MessageFormat.format(msg, param);
							break;
						}
					} catch (MissingResourceException mre) {
						// silently igonre
						continue;
					}
				}
			}
		}

		// verifica msgs da platforma
		if (StringUtils.isBlank(formattedMessage)) {
			List<ResourceBundleMessageSource> rbs = PlatformMessageRegistry.getInstance().getMessageBundles();
			for (ResourceBundleMessageSource rb : rbs) {
				try {
					String msg = rb.getMessage(i18nMessage, param.toArray(new Object[] {}), source.getApplication()
							.getCurrentLocale());

					formattedMessage = msg;
					break;

				} catch (NoSuchMessageException nsme) {
					// silently igonre
					continue;
				}
			}
		}

		if (StringUtils.isBlank(formattedMessage)) {
			formattedMessage = i18nMessage;
		}

		return formattedMessage;
	}

	/** @see #formattedMessage */
	public void setFormattedMessage(String formattedMessage) {
		this.formattedMessage = formattedMessage;
	}

}
