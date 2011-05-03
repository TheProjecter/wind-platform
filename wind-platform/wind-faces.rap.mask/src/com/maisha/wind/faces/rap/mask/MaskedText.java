package com.maisha.wind.faces.rap.mask;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * This widget adds Mask functionality to standard Text Widget provided by RAP.
 * 
 * @author paulo.freitas
 * 
 */
public class MaskedText extends Text {

	/** Mask to apply. */
	private String mask;

	/**
	 * Constructor.
	 * 
	 * @param parent
	 * @param style
	 */
	public MaskedText(Composite parent, int style) {
		super(parent, style);
	}

	/** @see #mask */
	public String getMask() {
		return mask;
	}

	/** @see #mask */
	public void setMask(String mask) {
		this.mask = mask;
	}

}
