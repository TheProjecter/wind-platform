/**
 * 
 */
package br.com.maisha.wind.common.search;

/**
 * Represents a condition which is intended to be applied in order to granulate
 * a query.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Condition {

	public static enum Operator {
		EQ, NE, GE, GT, LE, LT, LIKE
	}

	/** Field Id. */
	private String field;

	/** Logic Operator. */
	private Operator operator;

	/** Value. */
	private Object value;

	/**
	 * @param field
	 * @param operator
	 * @param value
	 */
	public Condition(String field, Operator operator, Object value) {
		this.field = field;
		this.operator = operator;
		this.value = value;
	}

	/** @see Condition#field */
	public String getField() {
		return field;
	}

	/** @see Condition#field */
	public void setField(String field) {
		this.field = field;
	}

	/** @see Condition#operator */
	public Operator getOperator() {
		return operator;
	}

	/** @see Condition#operator */
	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	/** @see Condition#value */
	public Object getValue() {
		return value;
	}

	/** @see Condition#value */
	public void setValue(Object value) {
		this.value = value;
	}

}
