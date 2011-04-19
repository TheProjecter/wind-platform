package br.com.maisha.wind.faces.render;

import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.VaadiApplication;

import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MenuRender extends BaseRender implements IRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(MenuRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType,
	 *      java.lang.Object)
	 */
	public void render(LevelType leve, ChangeType ct, Object model) {
		if (!(model instanceof WindApplication)) {
			log.error("This render is intended to recieve a " + "WindApplication as model, but [" + model.getClass()
					+ "] was given... ");
			return;
		}

		WindApplication app = (WindApplication) model;
		MenuBar menuBar = VaadiApplication.get().getMenuBar();

		if (app.getDomainObjects() != null && !app.getDomainObjects().isEmpty()) {
			MenuItem appRoot = menuBar.addItem(app.getName(), null);
			for (DomainObject dObj : app.getDomainObjects()) {
				appRoot.addItem(dObj.getLabel(), new DefaultMenuCommand(dObj));
			}
		}

	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.Application };
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class DefaultMenuCommand implements Command {

		/** */
		private static final long serialVersionUID = 1L;

		/** */
		private DomainObject dObj;

		/**
		 * 
		 * @param dObj
		 */
		public DefaultMenuCommand(DomainObject dObj) {
			this.dObj = dObj;
		}

		/**
		 * 
		 * @see com.vaadin.ui.MenuBar.Command#menuSelected(com.vaadin.ui.MenuBar.MenuItem)
		 */
		public void menuSelected(MenuItem selectedItem) {
			getPresentationProvider().processMenu(dObj.getApplication().getAppId(), dObj.getRef());
		}

	}

}
