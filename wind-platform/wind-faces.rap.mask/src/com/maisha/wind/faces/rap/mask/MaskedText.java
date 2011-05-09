package com.maisha.wind.faces.rap.mask;




import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * This widget adds Mask functionality to standard Text Widget provided by RAP.
 * 
 * @author paulo.freitas
 * 
 */
public class MaskedText extends Composite {

	/** Mask to apply. */
	private String mask;

	/** Text field. */
	private Text text;
	
	/**
	 * Constructor.
	 * 
	 * @param parent
	 * @param style
	 */
	public MaskedText(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		setSize(350, 20);
		text = new Text(this, SWT.BORDER | SWT.SINGLE);
	}
	
	/** @see #text */
	public Text getText() {
		return text;
	}
	
	/** @see #text */
	public void setText(Text text) {
		this.text = text;
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
