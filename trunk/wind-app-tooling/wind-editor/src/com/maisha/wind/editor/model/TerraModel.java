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
		ATTRIBUTE_PROPERTY("Attribute property", "bullet_green.png"), OPERATION_PROPERTY("Operation property", "bullet_green.png"), DOMAIN_OBJECT_PROPERTY(
				"Domain Object property", "bullet_green.png"), KEYWORD("", null);

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

		/** */
		private ProposalType type;

		/**
		 * 
		 * @param text
		 * @param type
		 */
		public Proposal(String text, ProposalType type) {
			this.text = text;
			this.type = type;
		}

		public String getText() {
			return text;
		}

		public ProposalType getType() {
			return type;
		}
	}

	/**
	 * 
	 * @return
	 */
	public static final Proposal[] findAttributeProperties() {
		return new Proposal[] { new Proposal("x", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("y", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("colspan", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("rowspan", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("disabled", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("icon", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("width", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("height", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("tooltip", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("folder", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("parent_group", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("visibleInEdition", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("visibleInGrid", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("content", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("value", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("validValues", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("validation", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("required", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("max_length", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("min_length", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("range", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("mask", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("event", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("toString", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("onetomany", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("manytoone", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("transient", ProposalType.ATTRIBUTE_PROPERTY),
				new Proposal("presentation_type", ProposalType.ATTRIBUTE_PROPERTY) };
	}

	/**
	 * 
	 * @return
	 */
	public static final Proposal[] findDomainObjectProperties() {
		return new Proposal[] { new Proposal("open_filtering", ProposalType.DOMAIN_OBJECT_PROPERTY),
				new Proposal("event_handler", ProposalType.DOMAIN_OBJECT_PROPERTY) };
	}

	/**
	 * 
	 * @return
	 */
	public static final Proposal[] findOperationProperties() {
		return new Proposal[] { new Proposal("class", ProposalType.OPERATION_PROPERTY),
				new Proposal("file", ProposalType.OPERATION_PROPERTY),
				new Proposal("validWhen", ProposalType.OPERATION_PROPERTY),
				new Proposal("is_filter", ProposalType.OPERATION_PROPERTY),
				new Proposal("validate", ProposalType.OPERATION_PROPERTY),
				new Proposal("visible", ProposalType.OPERATION_PROPERTY) };
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
}
