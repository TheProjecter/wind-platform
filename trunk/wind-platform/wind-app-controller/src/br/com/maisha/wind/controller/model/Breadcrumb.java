/**
 * 
 */
package br.com.maisha.wind.controller.model;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Breadcrumb {

	/** Previous element in the navigation trail. */
	private Breadcrumb previous;

	/** Object Instance originating this navigation. */
	private ModelReference originatingModelRef;
	
	/** Attribute used to "link" a navigation. */
	private Attribute originatingAttribute;

	/** Next element in the navigation trail (null in most cases). */
	private Breadcrumb next;

	/**
	 * @param previous
	 * @param originatingModelRef
	 * @param attr
	 */
	public Breadcrumb(Breadcrumb previous, Attribute attr, ModelReference originatingModelRef) {
		this.previous = previous;
		this.originatingModelRef = originatingModelRef;
		this.originatingAttribute = attr;
	}

	/** @see Breadcrumb#previous */
	public Breadcrumb getPrevious() {
		return previous;
	}

	/** @see Breadcrumb#previous */
	public void setPrevious(Breadcrumb previous) {
		this.previous = previous;
	}

	/** @see Breadcrumb#originatingModelRef */
	public ModelReference getOriginatingModelRef() {
		return originatingModelRef;
	}

	/** @see Breadcrumb#originatingModelRef */
	public void setOriginatingModelRef(ModelReference originatingModelRef) {
		this.originatingModelRef = originatingModelRef;
	}

	/** @see Breadcrumb#next */
	public Breadcrumb getNext() {
		return next;
	}

	/** @see Breadcrumb#next */
	public void setNext(Breadcrumb next) {
		this.next = next;
	}

	/** @see Breadcrumb#originatingAttribute */
	public Attribute getOriginatingAttribute() {
		return originatingAttribute;
	}

	/** @see Breadcrumb#originatingAttribute */
	public void setOriginatingAttribute(Attribute originatingAttribute) {
		this.originatingAttribute = originatingAttribute;
	}

	
}
