package com.maisha.wind.editor.hover;

import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Display;

import com.maisha.wind.editor.contentassistant.TerraDocInformationControlCreator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class TextHover extends DefaultTextHover implements ITextHoverExtension, ITextHoverExtension2{

	/**
	 * 
	 * @param sourceViewer
	 */
	public TextHover(ISourceViewer sourceViewer) {
		super(sourceViewer);
	}

	
	public Object getHoverInfo2(ITextViewer textViewer, IRegion hoverRegion) {
		return "<b>Param:</b><br/>bla bla bla";
	}


	@Override
	public IInformationControlCreator getHoverControlCreator() {
		return new TerraDocInformationControlCreator();
	}
}
