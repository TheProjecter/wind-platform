package br.com.maisha.terra.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO javadoc!
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 * @param <T>
 */
public class PropertyInfo<T> {

	/** Holds all PropertyInfo of the language. */
	private static Map<String, PropertyInfo<?>> pInfoMap = new HashMap<String, PropertyInfo<?>>();

	/** Descricao da propriedade "x". */
	public static final PropertyInfo<Integer> X = new PropertyInfo<Integer>(
			"x", null, Integer.class);

	/** Descricao da propriedade y */
	public static final PropertyInfo<Integer> Y = new PropertyInfo<Integer>(
			"y", null, Integer.class);

	/** Descricao da propriedade colspan */
	public static final PropertyInfo<Integer> COL_SPAN = new PropertyInfo<Integer>(
			"colspan", 0, Integer.class);

	/** Descricao da propriedade rowspan */
	public static final PropertyInfo<Integer> ROW_SPAN = new PropertyInfo<Integer>(
			"rowspan", 0, Integer.class);

	/** Descricao da propriedade "presentation_type". */
	public static final PropertyInfo<String> PRESENTATION_TYPE = new PropertyInfo<String>(
			"presentation_type", "", String.class);

	/** Descricao da propriedade validation */
	public static final PropertyInfo<String> VALIDATION = new PropertyInfo<String>(
			"validation", "", String.class);

	/** Descricao da propriedade required */
	public static final PropertyInfo<Boolean> REQUIRED = new PropertyInfo<Boolean>(
			"required", false, Boolean.class);

	/** Descricao da propriedade max_length */
	public static final PropertyInfo<Integer> MAX_LENGTH = new PropertyInfo<Integer>(
			"max_length", null, Integer.class);

	/** Descricao da propriedade min_length */
	public static final PropertyInfo<Integer> MIN_LENGTH = new PropertyInfo<Integer>(
			"min_length", null, Integer.class);

	/** Descricao da propriedade range */
	public static final PropertyInfo<String> RANGE = new PropertyInfo<String>(
			"range", "", String.class);

	/** Descricao da propriedade mask */
	public static final PropertyInfo<String> MASK = new PropertyInfo<String>(
			"mask", "", String.class);

	/** Descricao da propriedade disabled */
	public static final PropertyInfo<Boolean> DISABLED = new PropertyInfo<Boolean>(
			"disabled", false, Boolean.class);

	/** Descricao da propriedade visible */
	public static final PropertyInfo<Boolean> VISIBLE = new PropertyInfo<Boolean>(
			"visible", true, Boolean.class);

	/** Descricao da propriedade icon */
	public static final PropertyInfo<String> ICON = new PropertyInfo<String>(
			"icon", null, String.class);
	
	/** Descricao da propriedade width */
	public static final PropertyInfo<Integer> WIDTH = new PropertyInfo<Integer>(
			"width", null, Integer.class);
	
	/** Descricao da propriedade height */
	public static final PropertyInfo<Integer> HEIGHT = new PropertyInfo<Integer>(
			"height", null, Integer.class);
	
	/** Descricao da propriedade event */
	public static final PropertyInfo<String> EVENT = new PropertyInfo<String>(
			"event", null, String.class);
	
	/** Descricao da propriedade class */
	public static final PropertyInfo<String> CLASS = new PropertyInfo<String>(
			"class", null, String.class);
	
	/** Descricao da propriedade file */
	public static final PropertyInfo<String> FILE = new PropertyInfo<String>(
			"file", null, String.class);

	/** Nome da propriedade. */
	private String propName;

	/** Tipo do valor. */
	private Class<?> type;

	/** Valor default desta propriedade. */
	private T defaultValue;

	/**
	 * Construtor.
	 * 
	 * @param propName
	 *            Nome da propriedade.
	 */
	public PropertyInfo(String propName, T defaultValue, Class<?> type) {
		this.propName = propName;
		this.type = type;
		this.defaultValue = defaultValue;
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

	/** @see #type */
	public Class<?> getType() {
		return type;
	}

	/** @see #type */
	public void setType(Class<?> type) {
		this.type = type;
	}

	/** @see #defaultValue */
	public T getDefaultValue() {
		return defaultValue;
	}

	/** @see #defaultValue */
	public void setDefaultValue(T defaultValue) {
		this.defaultValue = defaultValue;
	}

}
