package br.com.maisha.wind.storage.hibernate;

import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

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

	/** Holds a session factory for each wind app. */
	private static final Map<String, SessionFactory> sessionFactoryRegistry = new HashMap<String, SessionFactory>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.storage.IStorage#configure(br.com.maisha.terra.lang .WindApplication)
	 */
	public void configure(WindApplication app) {

		URL cfgFile = app.getBundleContext().getBundle().getResource("hibernate.cfg.xml");
		if (cfgFile == null) {
			return;
		}

		AnnotationConfiguration cfg = new AnnotationConfiguration().configure(cfgFile);
		for (DomainObject dObj : app.getDomainObjects()) {
			cfg.addAnnotatedClass(dObj.getObjectClass());
		}

		sessionFactoryRegistry.put(app.getAppId(), cfg.buildSessionFactory());
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.storage.IStorage#save(br.com.maisha.terra.lang. ModelReference)
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
//						List<ModelReference> refLst = (List<ModelReference>) result;
//						Map<String, Object> context = new HashMap<String, Object>();
//						context.put("appRegistry", appRegistry);
//						
//						for(ModelReference ref : refLst){
//							context.put("ref", ref);
//							appCtrl.runScript("${ref.setMeta(appRegistry.getObject(ref.getAppId(), ref.getObjId()))}", context);
//						}
//						return refLst;
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

}
