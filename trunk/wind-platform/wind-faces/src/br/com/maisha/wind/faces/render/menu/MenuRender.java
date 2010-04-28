package br.com.maisha.wind.faces.render.menu;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.rcp.RCPUtil;
import br.com.maisha.wind.faces.render.BaseRender;

/**
 * Creates the Application Menus for all registered Wind Applications.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MenuRender extends BaseRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(MenuRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType getModelLevel() {
		return LevelType.Application;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(Object model) {
		if (!(model instanceof WindApplication)) {
			log.error("This render is intended to recieve a "
					+ "WindApplication as model, but [" + model.getClass()
					+ "] was given... ");
			return;
		}

		WindApplication app = (WindApplication) model;
		IMenuManager menuManager = RCPUtil.getWindowMenuManager(RCPUtil
				.getWorkbenchWindow());

		log.debug(" 	Menu rendering started for " + app.getName() + " ["
				+ app.getAppId() + "]... ");

		// creates application menu...
		MenuManager appMm = new MenuManager(app.getName(), app.getAppId());

		// adds it's objects
		for (DomainObject object : app.getDomainObjects()) {
			appMm.add(createMenu(app.getAppId(), object));
		}

		// insert into the bar
		menuManager.insertAfter(IWorkbenchActionConstants.MB_ADDITIONS, appMm);
		menuManager.update(true);

		log.debug(" 	Menu rendering finished... ");
	}

	/**
	 * Create an Action for the given {@link DomainObject}.
	 * 
	 * @param appId
	 * @param object
	 *            Domain Object to be represented by the action.
	 * @return An action wrapped in an ActionContributionItem to be inserted in
	 *         a menu.
	 */
	private IContributionItem createMenu(String appId, DomainObject object) {
		final String objRef = object.getRef();
		final String applicationId = appId;
		IAction action = new Action(object.getLabel()) {
			public void run() {
				getPresentationProvider().processMenu(applicationId, objRef);
			}
		};
		action.setId(object.getRef());
		return new ActionContributionItem(action);
	}

}
