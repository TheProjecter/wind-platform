package com.maisha.wind.editor.contentassistant;

import org.eclipse.jface.internal.text.html.HTMLTextPresenter;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.swt.widgets.Shell;

public class TerraDocInformationControlCreator implements IInformationControlCreator {

	@Override
	public IInformationControl createInformationControl(Shell parent) {
		DefaultInformationControl informationControl = new DefaultInformationControl(parent, new HTMLTextPresenter());
		return informationControl;
	}

}
