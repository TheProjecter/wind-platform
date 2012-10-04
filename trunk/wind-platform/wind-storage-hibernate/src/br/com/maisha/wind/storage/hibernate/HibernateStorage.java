package br.com.maisha.wind.storage.hibernate;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.EntityMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.search.Condition;
import br.com.maisha.wind.storage.IStorage;
import br.com.maisha.wind.storage.hibernate.criteria.CriteriaTransformer;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class HibernateStorage implements IStorage {

	/** LOG ref. */
	private static final Logger log = Logger.getLogger(HibernateStorage.class);

	/** Spring`s hibernate template. */
	private HibernateTemplate hibernateTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.storage.IStorage#configure(br.com.maisha.terra.lang
	 * .WindApplication)
	 */
	public void configure(WindApplication app) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.storage.IStorage#save(br.com.maisha.terra.lang.
	 * ModelReference)
	 */
	public void save(ModelReference ref) {
		getHibernateTemplate().saveOrUpdate(ref);
	}

	/**
	 * 
	 * @param appId
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object getById(String appId, Class<?> clazz, Serializable id) {
		Object ret = getHibernateTemplate().get(clazz, id);
		return ret;
	}

	/**
	 * 
	 * @param appId
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object getById(Class<?> clazz, Serializable id) {
		return getById(null, clazz, id);
	}

	/**
	 * 
	 * @param appId
	 * @param clazz
	 * @param id
	 * @return
	 */
	public ModelReference loadFullEntity(final DomainObject dObj, final Serializable id) {
		ModelReference ret = null;
		final Class<?> clazz = dObj.getObjectClass();
		try {

			// load entity initializing collections
			ret =  getHibernateTemplate().execute(new HibernateCallback<ModelReference>() {
				public ModelReference doInHibernate(Session sess) throws HibernateException, SQLException {

					ModelReference r = (ModelReference) sess.get(clazz, id);

					SessionFactory sessionFactory = sess.getSessionFactory();
					ClassMetadata meta = sessionFactory.getClassMetadata(clazz);
					for (String propertyName : meta.getPropertyNames()) {
						if (meta.getPropertyType(propertyName).isCollectionType()) {
							getHibernateTemplate().initialize(meta.getPropertyValue(r, propertyName, EntityMode.POJO));
						}
					}

					return r;
				}
			});
			getHibernateTemplate().evict(ret);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ret;
	}

	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	public void update(ModelReference ref) {
		getHibernateTemplate().update(ref);
	}

	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	public void delete(ModelReference ref) {
		getHibernateTemplate().delete(ref);
	}

	/**
	 * 
	 * @param appId
	 * @param ref
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ModelReference> getAll(DomainObject dObj) {

		List<ModelReference> result = (List<ModelReference>) getHibernateTemplate().loadAll(dObj.getObjectClass());
		if (result != null) {
			for (ModelReference m : result) {
				m.setMeta(dObj);
			}
		}
		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.storage.IStorage#filter(br.com.maisha.terra.lang.
	 * ModelReference, java.lang.String, java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	public List<ModelReference> filter(ModelReference model, String query, Object... param) {
		try {
			if (StringUtils.isNotBlank(query)) {
				List<ModelReference> result = hibernateTemplate.find(query, param);
				if (result != null) {
					for (ModelReference m : result) {
						m.setMeta(model.getMeta());
					}
				}
				return result;
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * @see br.com.maisha.wind.storage.IStorage#search(br.com.maisha.terra.lang.DomainObject,
	 *      java.util.List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ModelReference> search(final DomainObject dObj, final List<Condition> conditions) {

		List<ModelReference> ret = hibernateTemplate.execute(new HibernateCallback<List<ModelReference>>() {

			public List<ModelReference> doInHibernate(Session sess) throws HibernateException, SQLException {
				Criteria crt = sess.createCriteria(dObj.getObjectClass());

				if (conditions != null && !conditions.isEmpty()) {
					for (Condition condition : conditions) {
						crt.add(CriteriaTransformer.toCriterion(condition));
					}
				}
				return crt.list();
			}
		});

		return ret;
	}

	/** @see HibernateStorage#hibernateTemplate */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/** Hibernate session factory */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

}
