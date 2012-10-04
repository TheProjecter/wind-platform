/**
 * 
 */
package br.com.maisha.wind.storage.hibernate.criteria;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import br.com.maisha.wind.common.search.Condition;

/**
 * Transforms a {@link Condition} into a Hibernates`s criteria.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class CriteriaTransformer {

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public static Criterion toCriterion(Condition condition) {
		Criterion crt = null;

		switch (condition.getOperator()) {
		case EQ:
			crt = Restrictions.eq(condition.getField(), condition.getValue());
			break;
		case NE:
			Restrictions.ne(condition.getField(), condition.getValue());
			break;
		case GE:
			Restrictions.ge(condition.getField(), condition.getValue());
			break;
		case GT:
			Restrictions.gt(condition.getField(), condition.getValue());
			break;
		case LE:
			Restrictions.le(condition.getField(), condition.getValue());
			break;
		case LT:
			Restrictions.lt(condition.getField(), condition.getValue());
			break;

		default:
			crt = Restrictions.eq(condition.getField(), condition.getValue());
			break;
		}

		return crt;
	}

}
