package br.com.maisha.wind.common.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import br.com.maisha.wind.common.component.Component;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class SpringBeanFactory implements ApplicationContextAware {

	/** */
	private static SpringBeanFactory instance;

	/** */
	private Map<Class<? extends Component>, Component> componentRegistry = new HashMap<Class<? extends Component>, Component>();

	/**
	 * 
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@SuppressWarnings("unchecked")
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		instance = this;
		Map<String, Component> components = ctx.getBeansOfType(Component.class);
		for (Component cpt : components.values()) {
			registerComponent(cpt);
		}
	}

	/**
	 * 
	 * @param cpt
	 */
	@SuppressWarnings("unchecked")
	private void registerComponent(Component cpt) {
		Class<?> componentClass = cpt.getClass();
		Class<?>[] serviceItfs = componentClass.getInterfaces();
		for (Class<?> componentItf : serviceItfs) {
			if (Component.class.isAssignableFrom(componentItf)
					&& Component.class != componentItf) {
				componentRegistry.put(
						(Class<? extends Component>) componentItf, cpt);
			}
		}
	}

	/**
	 * 
	 * @param <T>
	 * @param itf
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends Component> T getService(Class<T> itf) {
		return (T) componentRegistry.get(itf);

	}

	/** @see #instance */
	public static SpringBeanFactory getInstance() {
		return instance;
	}

}
