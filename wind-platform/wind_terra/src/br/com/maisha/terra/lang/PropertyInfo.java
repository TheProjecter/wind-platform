package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 * @param <T>
 */
public class PropertyInfo<T> {

	/** Descricao da propriedade "x". */
	public static final PropertyInfo<Integer> X = new PropertyInfo<Integer>("x");

	/** Descricao da propriedade "presentation_type". */
	public static final PropertyInfo<String> PRESENTATION_TYPE = new PropertyInfo<String>(
			"presentation_type");

	/** Nome da propriedade. */
	private String propName;

	/**
	 * Construtor.
	 * 
	 * @param propName
	 *            Nome da propriedade.
	 */
	public PropertyInfo(String propName) {
		this.propName = propName;
	}

	/** @see #propName */
	public String getPropName() {
		return propName;
	}

	/** @see #propName */
	public void setPropName(String propName) {
		this.propName = propName;
	}

}
