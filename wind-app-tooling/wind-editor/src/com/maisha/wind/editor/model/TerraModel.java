package com.maisha.wind.editor.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.maisha.wind.editor.Activator;

public class TerraModel {

	/** Tipos. */
	public static enum ProposalType {
		ATTRIBUTE_PROPERTY("Attribute property", "bullet_green.png"), OPERATION_PROPERTY("Operation property",
				"bullet_green.png"), DOMAIN_OBJECT_PROPERTY("Domain Object property", "bullet_green.png"), KEYWORD("",
				null), PRESENTATION_TYPE("Presentation Type", "layout_co.gif");

		private String descricao;
		private String iconName;

		private ProposalType(String descricao, String icName) {
			this.descricao = descricao;
			this.iconName = icName;
		}

		public String getDescricao() {
			return descricao;
		}

		public ImageDescriptor getImageDescriptor() {
			if (iconName == null) {
				return null;
			}
			return Activator.getImageDescriptor("icons/" + iconName);
		}

		public Image createImage() {
			ImageDescriptor id = getImageDescriptor();
			if (id != null) {
				return id.createImage();
			}
			return null;
		}

		public String toString() {
			return getDescricao();
		}
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	public static class Proposal {
		/** */
		private String text;

		private String displayText;

		/** */
		private ProposalType type;

		/**
		 * 
		 * @param text
		 * @param type
		 */
		public Proposal(String text, String displayText, ProposalType type) {
			this.text = text;
			this.type = type;
			this.displayText = displayText;
		}

		/**
		 * 
		 * @param text
		 * @param type
		 */
		public Proposal(String text, ProposalType type) {
			this(text, text, type);
		}

		public String getText() {
			return text;
		}

		public ProposalType getType() {
			return type;
		}

		public String getDisplayText() {
			return displayText;
		}
	}

	/**
	 * 
	 * @return
	 */
	public static final Proposal[] findAttributeProperties() {
		return new Proposal[] { new Proposal("x", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("y:", "y", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("colspan:", "colspan", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("rowspan:", "rowspan", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("disabled:", "disabled", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("icon:", "icon", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("width:", "width", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("height:", "height", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("tooltip:", "tooltip", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("folder:", "folder", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("parent_group:", "parent_group", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("visibleInEdition:", "visibleInEdition", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("visibleInGrid:", "visibleInGrid", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("content:", "content", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("value:", "value", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("validValues:", "validValues", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("validation:", "validation", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("required:", "required", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("max_length:", "max_length", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("min_length:", "min_length", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("range:", "range", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("mask:", "mask", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("event:", "event", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("toString:", "toString", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("onetomany:", "onetomany", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("manytoone:", "manytoone", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("transient:", "transient", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("presentation_type:", "presentation_type", ProposalType.ATTRIBUTE_PROPERTY) };
	}

	public static final Proposal[] findPresentationTypes() {
		return new Proposal[] { new Proposal("text", "Text", ProposalType.PRESENTATION_TYPE),
				new Proposal("radio", "Radio", ProposalType.PRESENTATION_TYPE),
				new Proposal("checkbox", "Checkbox", ProposalType.PRESENTATION_TYPE),
				new Proposal("combo", "Combo",ProposalType.PRESENTATION_TYPE),
				new Proposal("list", "List",ProposalType.PRESENTATION_TYPE),
				new Proposal("textarea", "Textarea",ProposalType.PRESENTATION_TYPE),
				new Proposal("date", "Date",ProposalType.PRESENTATION_TYPE),
				new Proposal("related", "Related",ProposalType.PRESENTATION_TYPE),
				new Proposal("embedded_object", "Embedded Object",ProposalType.PRESENTATION_TYPE),
				new Proposal("group", "Group",ProposalType.PRESENTATION_TYPE) };
	}

	/**
	 * 
	 * @return
	 */
	public static final Proposal[] findDomainObjectProperties() {
		return new Proposal[] { new Proposal("open_filtering:", "open_filtering", ProposalType.DOMAIN_OBJECT_PROPERTY),
				new Proposal("event_handler:", "event_handler", ProposalType.DOMAIN_OBJECT_PROPERTY) };
	}

	/**
	 * 
	 * @return
	 */
	public static final Proposal[] findOperationProperties() {
		return new Proposal[] { new Proposal("class", ProposalType.OPERATION_PROPERTY),
				new Proposal("file:", "file", ProposalType.OPERATION_PROPERTY),
				new Proposal("validWhen:", "validWhen", ProposalType.OPERATION_PROPERTY),
				new Proposal("is_filter:", "is_filter", ProposalType.OPERATION_PROPERTY),
				new Proposal("validate:", "validate", ProposalType.OPERATION_PROPERTY),
				new Proposal("visible:", "visible", ProposalType.OPERATION_PROPERTY) };
	}

	public static final Proposal[] findAllKeywords() {
		List<Proposal> merged = new ArrayList<Proposal>();
		merged.addAll(Arrays.asList(findPreDomainObjectKeywords()));
		merged.addAll(Arrays.asList(findDomainObjectKeywords()));
		merged.addAll(Arrays.asList(findOperationTypes()));
		merged.add(new Proposal("using", ProposalType.KEYWORD));
		return merged.toArray(new Proposal[] {});
	}

	public static final Proposal[] findDomainObjectKeywords() {
		return new Proposal[] { new Proposal("validationRule", ProposalType.KEYWORD),
				new Proposal("operation", ProposalType.KEYWORD), new Proposal("attribute", ProposalType.KEYWORD) };
	}

	public static final Proposal[] findOperationTypes() {
		return new Proposal[] { new Proposal("java", ProposalType.KEYWORD),
				new Proposal("python", ProposalType.KEYWORD), new Proposal("groovy", ProposalType.KEYWORD) };
	}

	public static final Proposal[] findPreDomainObjectKeywords() {
		return new Proposal[] { new Proposal("domain_object", ProposalType.KEYWORD),
				new Proposal("package", ProposalType.KEYWORD), new Proposal("import", ProposalType.KEYWORD) };
	}

	/**
	 * 
	 * @param lastProperty
	 */
	public static Proposal[] findProposalsForProperty(String lastProperty) {
		Proposal[] proposals = new Proposal[] {};

		if ("presentation_type".equals(lastProperty)) {
			proposals = findPresentationTypes();
		}
		return proposals;
	}
}
