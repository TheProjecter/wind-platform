package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo
 * 
 */
public class Property extends TerraClass {

	/** */
	public static final String X_PROP_NAME = "x";

	/** */
	public static final String Y_PROP_NAME = "y";

	/** */
	public static final String PRESENTATION_TYPE_PROP_NAME = "presentation_type";

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

	private String value;

	public Property(String propName, String value) {
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
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
