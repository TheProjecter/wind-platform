package br.com.maisha.wind.controller.storage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;

public class PersistentStorage implements IStorage {

	/** Referencia para LOG. */
	private static final Logger log = Logger.getLogger(PersistentStorage.class);

	/** */
	private static final Map<String, SessionFactory> sessionFactoryRegistry = new HashMap<String, SessionFactory>();

	/**
	 * 
	 * @return
	 */
	public ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	/**
	 * 
	 * @param app
	 */
	public Configuration configure(WindApplication app) {
		AnnotationConfiguration configuration = new AnnotationConfiguration().configure(app.getHibernateConfig());

		for (DomainObject object : app.getDomainObjects()) {
			log.debug("@@@ Adding [" + object.getRef() + "] to hibernate");

			configuration.addAnnotatedClass(object.getObjectClass());
		}

		sessionFactoryRegistry.put(app.getAppId(), configuration.buildSessionFactory());
		return configuration;
	}

	/**
	 * 
	 * @param appId
	 * @return
	 */
	public SessionFactory getSessionFactory(String appId) {
		SessionFactory sessionFactory = sessionFactoryRegistry.get(appId);

		if (sessionFactory == null) {
			log.error("There is no SessionFactory for " + appId);
			return null;
		}
		
		return sessionFactory;
	}

	/**
	 * 
	 * @param ref
	 */
	public void save(String appId, ModelReference ref) {
		SessionFactory sessionFactory = getSessionFactory(appId);
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		try {
			sess.saveOrUpdate(ref);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
		}
	}

	/**
	 * 
	 * @param appId
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object getById(String appId, Class<?> clazz, Serializable id) {
		Object ret = null;

		SessionFactory sessionFactory = getSessionFactory(appId);
		Session sess = sessionFactory.openSession();
		try {
			ret = sess.get(clazz, id);
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
	public void update(String appId, ModelReference ref) {
		SessionFactory sessionFactory = getSessionFactory(appId);
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		try {
			sess.merge(ref);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
		}
	}
	
	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	public void delete(String appId, ModelReference ref) {
		SessionFactory sessionFactory = getSessionFactory(appId);
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		try {
			sess.delete(ref);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
		}
	}	
	
	/**
	 * 
	 * @param appId
	 * @param ref
	 * @return
	 */
	public List<?> getAll(String appId, DomainObject dObj) {
		SessionFactory sessionFactory = getSessionFactory(appId);
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		try {

			Criteria crt = sess.createCriteria(dObj.getObjectClass());
			return crt.list();

		} catch (Exception e) {
			transaction.rollback();
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
		}
		return null;
	}
	
	/**
	 * 
	 * @param appId
	 * @param d
	 * @return
	 */
	public List<?> filter(String appId, ModelReference d, String query, Object ... param){
		SessionFactory sessionFactory = getSessionFactory(appId);
		
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		
		DomainObject dObj = d.getMeta();
		
		try {
			if(StringUtils.isNotBlank(query)){
				Query q = sess.createQuery(query);
				q.setProperties(d);
				return q.list();
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
		

}
