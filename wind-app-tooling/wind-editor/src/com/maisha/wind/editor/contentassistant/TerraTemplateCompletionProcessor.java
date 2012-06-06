package com.maisha.wind.editor.contentassistant;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.DocumentTemplateContext;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.swt.graphics.Image;

import com.maisha.wind.editor.Activator;

/**
 * 
 * @author Anybody
 * 
 */
public class TerraTemplateCompletionProcessor extends TemplateCompletionProcessor {

	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		ITextSelection selection = (ITextSelection) viewer.getSelectionProvider().getSelection();

		// adjust offset to end of normalized selection
		if (selection.getOffset() == offset) {
			offset = selection.getOffset() + selection.getLength();
		}

		String prefix = extractPrefix(viewer, offset);

		Region region = new Region(offset - prefix.length(), prefix.length());
		TemplateContext context = createContext(viewer, region);
		if (context == null) {
			return new ICompletionProposal[0];
		}

		context.setVariable("label", "label");
		context.setVariable("ref", "ref");
		context.setVariable("type", "type");
		context.setVariable("lang", "lang");

		Template[] templates = getTemplates(null);
		List<ICompletionProposal> matches = new ArrayList<ICompletionProposal>();

		for (int i = 0; i < templates.length; i++) {
			Template template = templates[i];
			try {
				context.getContextType().validate(template.getPattern());
			} catch (TemplateException e) {
				continue;
			}

			if (prefix.equals("") || (template.getName().startsWith(prefix))) {
				matches.add(createProposal(template, context, (IRegion) region, getRelevance(template, prefix)));
			}
		}
		return matches.toArray(new ICompletionProposal[matches.size()]);
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateCompletionProcessor#createContext(org.eclipse.jface.text.ITextViewer,
	 *      org.eclipse.jface.text.IRegion)
	 */
	protected TemplateContext createContext(ITextViewer viewer, IRegion region) {
		return new DocumentTemplateContext(getContextType(viewer, region), viewer.getDocument(), new Position(
				region.getOffset(), region.getLength()));
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateCompletionProcessor#getTemplates(java.lang.String)
	 */
	protected Template[] getTemplates(String contextTypeId) {
		return new Template[] {
				new Template("attribute", "Inserts Attribute declaration", "DMO_ATTRIBUTE",
						"attribute ${type} ${ref} \"${label}\" {\n${cursor}\n}", false),
				new Template("operation", "Inserts Operation declaration", "DMO_OPERATION",
						"operation ${lang} ${ref} \"${label}\" {\n${cursor}\n}", false),
				new Template("validationRule", "Inserts Validation Rule declaration", "DMO_VALIDATION_RULE",
						"validationRule ${ref} {\n${cursor}\n}", false) };
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateCompletionProcessor#getContextType(org.eclipse.jface.text.ITextViewer,
	 *      org.eclipse.jface.text.IRegion)
	 */
	protected TemplateContextType getContextType(ITextViewer viewer, IRegion region) {
		return new TerraTemplateContextTypes();
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateCompletionProcessor#getImage(org.eclipse.jface.text.templates.Template)
	 */
	protected Image getImage(Template template) {
		return Activator.getImageDescriptor("icons/template_obj.gif").createImage();
	}
}