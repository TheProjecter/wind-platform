package com.maisha.wind.editor.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerraModel {

	/**
	 * 
	 * @return
	 */
	public static final String[] findAttributeProperties() {
		return new String[] { "x", "y", "colspan", "rowspan", "disabled", "icon", "width", "height", "tooltip",
				"folder", "parent_group", "visibleInEdition", "visibleInGrid", "content", "value", "validValues",
				"validation", "required", "max_length", "min_length", "range", "mask", "event", "toString",
				"onetomany", "manytoone", "transient", "presentation_type" };
	}

	/**
	 * 
	 * @return
	 */
	public static final String[] findDomainObjectProperties() {
		return new String[] { "open_filtering", "event_handler" };
	}

	/**
	 * 
	 * @return
	 */
	public static final String[] findOperationProperties() {
		return new String[] { "x", "y", "colspan", "rowspan", "disabled", "icon", "width", "height", "tooltip",
				"class", "file", "validWhen", "is_filter", "validate", "visible" };
	}

	public static final String[] findAllKeywords() {
		List<String> merged = new ArrayList<String>();
		merged.addAll(Arrays.asList(findPreDomainObjectKeywords()));
		merged.addAll(Arrays.asList(findDomainObjectKeywords()));
		return merged.toArray(new String[] {});
	}

	public static final String[] findDomainObjectKeywords() {
		return new String[] { "validationRule", "operation", "java", "python", "groovy", "using", "attribute" };
	}

	public static final String[] findPreDomainObjectKeywords() {
		return new String[] { "domain_object", "package", "import" };
	}
}
