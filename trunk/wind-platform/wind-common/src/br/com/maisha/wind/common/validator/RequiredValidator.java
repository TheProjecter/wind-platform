package br.com.maisha.wind.common.validator;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RequiredValidator implements IValidator {

	/** */
	private String attributeLabel;

	/**
	 * 
	 * @param label
	 */
	public RequiredValidator(String label) {
		this.attributeLabel = label;
	}

	/**
	 * 
	 * @see org.eclipse.core.databinding.validation.IValidator#validate(java.lang.Object)
	 */
	public IStatus validate(Object value) {
		IStatus status = ValidationStatus.ok();
		if (value == null) {
			// TODO load from message bundle
			status = ValidationStatus.error(this.attributeLabel + " is required!");
		}
		return status;
	}

}
