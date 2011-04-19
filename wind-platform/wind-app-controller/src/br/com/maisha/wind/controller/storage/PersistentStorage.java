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
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

public class PersistentStorage implements IStorage {

	/** Referencia para LOG. */
	private static final Logger log = Logger.getLogger(PersistentStorage.class);

	/** */
	private static final Map<String, SessionFactory> sessionFactoryRegistry = new HashMap<String, SessionFactory>();

	/** Reference to {@link IApplicationController} */
	private IApplicationController appCtrl;

	/** Reference to {@link IApplicationRegistry} */
	private IApplicationRegistry appRegistry;

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
		AnnotationConfiguration configuration = new AnnotationConfiguration()
				.configure(app.getHibernateConfig());

		for (DomainObject object : app.getDomainObjects()) {
			log.debug("@@@ Adding [" + object.getRef() + "] to hibernate");

			configuration.addAnnotatedClass(object.getObjectClass());
		}

		sessionFactoryRegistry.put(app.getAppId(),
				configuration.buildSessionFactory());
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
	public void save(ModelReference ref) {
		String appId = ref.getMeta().getApplication().getAppId();

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
	public void update(ModelReference ref) {
		String appId = ref.getMeta().getApplication().getAppId();

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
	public void delete(ModelReference ref) {
		String appId = ref.getMeta().getApplication().getAppId();

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
	public List<?> getAll(DomainObject dObj) {
		String appId = dObj.getApplication().getAppId();

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
	public List<?> filter(DomainObject d, String query, Object... param) {
		String appId = d.getApplication().getAppId();

		SessionFactory sessionFactory = getSessionFactory(appId);

		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();

		try {
			if (StringUtils.isNotBlank(query)) {
				Query q = sess.createQuery(query);

				if(param != null){
					int x = 0;
					for (Object p : param) {
						q.setParameter(x, p);
						x++;
					}
				}

				List<?> result = q.list();
				if (result != null && result.size() > 0) {
					if (ModelReference.class.isAssignableFrom(result.get(0)
							.getClass())) {
						
						// sets a reference to it's Domain Object (meta)
						List<ModelReference> refLst = (List<ModelReference>) result;
						Map<String, Object> context = new HashMap<String, Object>();
						context.put("appRegistry", appRegistry);
						
						for(ModelReference ref : refLst){
							context.put("ref", ref);
							appCtrl.runScript("${ref.setMeta(appRegistry.getObject(ref.getAppId(), ref.getObjId()))}", context);
						}
						return refLst;
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

	/** @see #appCtrl */
	public void setAppCtrl(IApplicationController appCtrl) {
		this.appCtrl = appCtrl;
	}

	/** @see #appCtrl */
	public IApplicationController getAppCtrl() {
		return appCtrl;
	}

	/** @see #appRegistry */
	public void setAppRegistry(IApplicationRegistry appRegistry) {
		this.appRegistry = appRegistry;
	}

	/** @see #appRegistry */
	public IApplicationRegistry getAppRegistry() {
		return appRegistry;
	}
}
