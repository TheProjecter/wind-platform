package br.com.maisha.wind.storage.hibernate;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.EntityMode;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.type.Type;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.storage.IStorage;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class HibernateStorage implements IStorage {

	/** LOG ref. */
	private static final Logger log = Logger.getLogger(HibernateStorage.class);

	/** Hibernate's Session Factory */
	private SessionFactory sessionFactory;

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
		getHibernateTemplate().save(ref);
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
	public ModelReference loadFullEntity(DomainObject dObj, Serializable id) {
		ModelReference ret = null;

		Class<?> clazz = dObj.getObjectClass();

		Session sess = sessionFactory.openSession();
		try {
			ret = (ModelReference) sess.get(clazz, id);

			// initialize collections
			if (ret != null) {
				ClassMetadata meta = sess.getSessionFactory().getClassMetadata(clazz);
				for (String propertyName : meta.getPropertyNames()) {
					Type type = meta.getPropertyType(propertyName);
					if (type.isCollectionType()) {
						Hibernate.initialize(meta.getPropertyValue(ret, propertyName, EntityMode.POJO));
					}
				}

				ret.setMeta(dObj);
			}

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
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

		List<ModelReference> result = getHibernateTemplate().loadAll(dObj.getObjectClass());
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
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();

		try {
			if (StringUtils.isNotBlank(query)) {
				Query q = sess.createQuery(query);

				if (param != null) {
					int x = 0;
					for (Object p : param) {
						q.setParameter(x, p);
						x++;
					}
				}

				List<ModelReference> result = q.list();
				if (result != null) {
					for (ModelReference m : result) {
						m.setMeta(model.getMeta());
					}
				}
				return result;
			}
		} catch (Exception e) {
			transaction.rollback();
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
		}
		return null;
	}

	/** @see HibernateStorage#hibernateTemplate */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/** Hibernate session factory */
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

}
