package br.com.maisha.wind.controller.storage;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;

public class PersistentStorage implements IStorage{

	/** */
	private static final Map<String, SessionFactory> sessionFactoryRegistry = new HashMap<String, SessionFactory>();

	/**
	 * 
	 * @param app
	 */
	public void configure(WindApplication app) {
		AnnotationConfiguration configuration = new AnnotationConfiguration().configure();

		for (DomainObject object : app.getDomainObjects()) {
			configuration.addAnnotatedClass(object.getObjectClass());
		}

		sessionFactoryRegistry.put(app.getAppId(), configuration.buildSessionFactory());
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
		} finally {
			sess.flush();
			sess.close();
		}
	}
}
