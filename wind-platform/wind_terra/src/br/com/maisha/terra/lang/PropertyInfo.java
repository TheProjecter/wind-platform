package br.com.maisha.terra.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO javadoc!
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 * @param <T>
 */
public class PropertyInfo<T> {

	/** Holds all PropertyInfo of the language. */
	private static Map<String, PropertyInfo<?>> pInfoMap = new HashMap<String, PropertyInfo<?>>();

	/** Descricao da propriedade "x". */
	public static final PropertyInfo<Integer> X = new PropertyInfo<Integer>(
			"x", Integer.class);

	/** Descricao da propriedade y */
	public static final PropertyInfo<Integer> Y = new PropertyInfo<Integer>(
			"y", Integer.class);

	/** Descricao da propriedade colspan */
	public static final PropertyInfo<Integer> COL_SPAN = new PropertyInfo<Integer>(
			"colspan", Integer.class);

	/** Descricao da propriedade rowspan */
	public static final PropertyInfo<Integer> ROW_SPAN = new PropertyInfo<Integer>(
			"rowspan", Integer.class);

	/** Descricao da propriedade "presentation_type". */
	public static final PropertyInfo<String> PRESENTATION_TYPE = new PropertyInfo<String>(
			"presentation_type", String.class);

	/** Descricao da propriedade validation */
	public static final PropertyInfo<String> VALIDATION = new PropertyInfo<String>(
			"validation", String.class);

	/** Descricao da propriedade required */
	public static final PropertyInfo<Boolean> REQUIRED = new PropertyInfo<Boolean>(
			"required", Boolean.class);

	/** Descricao da propriedade max_length */
	public static final PropertyInfo<Integer> MAX_LENGTH = new PropertyInfo<Integer>(
			"max_length", Integer.class);

	/** Descricao da propriedade min_length */
	public static final PropertyInfo<Integer> MIN_LENGTH = new PropertyInfo<Integer>(
			"min_length", Integer.class);

	/** Descricao da propriedade range */
	public static final PropertyInfo<String> RANGE = new PropertyInfo<String>(
			"range", String.class);

	/** Descricao da propriedade mask */
	public static final PropertyInfo<String> MASK = new PropertyInfo<String>(
			"mask", String.class);

	/** Descricao da propriedade disabled */
	public static final PropertyInfo<Boolean> DISABLED = new PropertyInfo<Boolean>(
			"disabled", Boolean.class);

	/** Descricao da propriedade visible */
	public static final PropertyInfo<Boolean> VISIBLE = new PropertyInfo<Boolean>(
			"visible", Boolean.class);

	/** Descricao da propriedade icon */
	public static final PropertyInfo<String> ICON = new PropertyInfo<String>(
			"icon", String.class);

	/** Nome da propriedade. */
	private String propName;

	/** Tipo do valor. */
	private Class<?> type;

	/**
	 * Construtor.
	 * 
	 * @param propName
	 *            Nome da propriedade.
	 */
	public PropertyInfo(String propName, Class<?> type) {
		this.propName = propName;
		this.type = type;
		if (PropertyInfo.pInfoMap == null) {
			PropertyInfo.pInfoMap = new HashMap<String, PropertyInfo<?>>();
		}
		PropertyInfo.pInfoMap.put(propName, this);
	}

	/**
	 * Obtem a meta informacao da propriedade correspondente ao nome dado.
	 * 
	 * @param propName
	 *            Nome da propriedade.
	 * @return PropertyInfo correspondente.
	 */
	public static PropertyInfo<?> getPropertyInfo(String propName) {
		return pInfoMap.get(propName);
	}

	/** @see #propName */
	public String getPropName() {
		return propName;
	}

	/** @see #propName */
	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

}
