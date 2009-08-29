package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo
 * 
 */
public class Property extends TerraClass {

	/** */
	public static enum PresentationType {
		TEXT("text"), RADIO("radio"), CHECKBOX("checkbox"), COMBO("combo"), LIST(
				"list"), TEXTAREA("textarea");

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

	public Property(String propName, Object value) {
		super();
		this.propName = propName;
		this.value = value;
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
