package br.com.maisha.wind.storage.hibernate;

import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.EntityMode;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.type.Type;

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
	 * @param clazz
	 * @param id
	 * @return
	 */
	public ModelReference loadFullEntity(DomainObject dObj, Serializable id) {
		ModelReference ret = null;

		String appId = dObj.getApplication().getAppId();
		Class<?> clazz = dObj.getObjectClass();

		SessionFactory sessionFactory = getSessionFactory(appId);
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
	@SuppressWarnings("unchecked")
	public List<ModelReference> getAll(DomainObject dObj) {
		String appId = dObj.getApplication().getAppId();

		SessionFactory sessionFactory = getSessionFactory(appId);
		Session sess = sessionFactory.openSession();
		Transaction transaction = sess.beginTransaction();
		try {

			Criteria crt = sess.createCriteria(dObj.getObjectClass());
			List<ModelReference> result = crt.list();
			if (result != null) {
				for (ModelReference m : result) {
					m.setMeta(dObj);
				}
			}
			return result;

		} catch (Exception e) {
			transaction.rollback();
			log.error(e.getMessage(), e);
		} finally {
			sess.flush();
			sess.close();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.storage.IStorage#filter(br.com.maisha.terra.lang.ModelReference, java.lang.String, java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	public List<ModelReference> filter(ModelReference model, String query, Object... param) {
		String appId = model.getMeta().getApplication().getAppId();

		SessionFactory sessionFactory = getSessionFactory(appId);

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

}
