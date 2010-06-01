package br.com.maisha.wind.controller.storage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
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
		return sessionFactoryRegistry.get(appId);
	}

	/**
	 * 
	 * @param ref
	 */
	public void save(String appId, ModelReference ref) {
		SessionFactory sessionFactory = sessionFactoryRegistry.get(appId);
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		try {
			sess.save(ref);
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
		SessionFactory sessionFactory = sessionFactoryRegistry.get(appId);

		if (sessionFactory == null) {
			log.error("There is no SessionFactory for " + appId);
			return null;
		}

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

}
