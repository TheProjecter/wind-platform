package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class ValidationRule extends TerraClass{

	private String messageKey;
	
	private String expression;

	
	
	public ValidationRule(String messageKey, String expression) {
		if (!messageKey.trim().isEmpty()) {
			this.messageKey = messageKey.substring(1, messageKey.length() - 1);
		}
		this.expression = expression;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	
	
	
}
