package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Property extends TerraClass {

	/** */
	public static enum PresentationType {
		TEXT("text"), RADIO("radio"), CHECKBOX("checkbox"), COMBO("combo"), LIST("list"), TEXTAREA("textarea"), DATE("date"), RELATED(
				"RELATED"), EMBEDDEDOBJECT("embedded_object"), GROUP("group");

		private String value;

		private PresentationType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	private String propName;

	private Object value;

	private String expression;

	private List<ValidValue> validValues = new ArrayList<ValidValue>();

	public Property(String propName, Object value) {
		this.propName = propName;
		this.value = value;

		// verify if the given value is a String with "
		if (value instanceof String) {
			String str = (String) value;
			if (StringUtils.isNotBlank(str) && str.charAt(0) == '"') {
				this.value = str.substring(1, str.length() - 1);
			}
		}
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
		changeSupport.firePropertyChange("value", null, value);
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void addValidValue(ValidValue vv) {
		if (validValues != null) {
			validValues.add(vv);
			changeSupport.firePropertyChange("validValues", null, validValues);
		}
	}

	public List<ValidValue> getValidValues() {
		return validValues;
	}

	public void setValidValues(List<ValidValue> validValues) {
		this.validValues = validValues;
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getPropName()).append(": ").append(getValue());
		return sb.toString();
	}

}
