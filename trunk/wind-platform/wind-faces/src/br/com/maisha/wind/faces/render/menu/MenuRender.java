package br.com.maisha.wind.faces.render.menu;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.osgi.framework.Bundle;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Menu;
import br.com.maisha.terra.lang.MenuGroup;
import br.com.maisha.terra.lang.MenuItem;
import br.com.maisha.terra.lang.MenuItem.MenuType;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
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
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.Application };
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(LevelType level, ChangeType ct, Object model) {
		if (!(model instanceof WindApplication)) {
			log.error("This render is intended to recieve a " + "WindApplication as model, but [" + model.getClass() + "] was given... ");
			return;
		}

		WindApplication app = (WindApplication) model;
		IMenuManager menuManager = RCPUtil.getWindowMenuManager(RCPUtil.getWorkbenchWindow());

		log.debug(" 	Menu rendering started for " + app.getName() + " [" + app.getAppId() + "]... ");

		Collections.sort(app.getMenuGroup());
		Collections.reverse(app.getMenuGroup());

		createMenuTree(app.getMenuGroup(), app, menuManager, true);

		menuManager.update(true);

		log.debug(" 	Menu rendering finished... ");
	}

	/**
	 * 
	 * @param groups
	 * @param appId
	 * @param parent
	 * @param isRoot
	 * @return
	 */
	private IMenuManager createMenuTree(List<MenuGroup> groups, WindApplication app, IMenuManager parent, boolean isRoot) {
		MenuManager appMm = null;
		for (MenuGroup mg : groups) {
			// creates menu for groups
			String menuGroupId = app.getAppId() + "/" + mg.getLabel();
			parent.remove(menuGroupId);
			appMm = new MenuManager(mg.getLabel(), menuGroupId);

			if (isRoot) {
				parent.insertAfter(IWorkbenchActionConstants.MB_ADDITIONS, appMm);
			} else {
				parent.add(appMm);
			}

			List<Menu> child = new ArrayList<Menu>();
			child.addAll(mg.getItems());
			child.addAll(mg.getGroups());
			Collections.sort(child);

			for (Menu m : child) {
				if (!m.getVisible()) {
					continue;
				}

				if (m instanceof MenuItem) {
					appMm.add(createMenu(app, (MenuItem) m));
				} else if (m instanceof MenuGroup) {
					createMenuTree(mg.getGroups(), app, appMm, false);
				}
			}
		}
		return appMm;
	}

	/**
	 * Create an Action for the given {@link DomainObject}.
	 * 
	 * @param appId
	 * @param object
	 *            Domain Object to be represented by the action.
	 * @return An action wrapped in an ActionContributionItem to be inserted in a menu.
	 */
	private IContributionItem createMenu(WindApplication app, MenuItem mi) {

		if (MenuType.SEPARATOR.equals(mi.getType())) {
			return new Separator();
		} else {

			final String objRef = mi.getDomainObject();
			final String applicationId = app.getAppId();
			IAction action = new Action(mi.getLabel()) {
				public void run() {
					getPresentationProvider().processMenu(applicationId, objRef);
				}
			};
			action.setId(objRef);

			if (StringUtils.isNotBlank(mi.getIcon())) {
				action.setImageDescriptor(getImageDescriptor(app, mi.getIcon()));
			}

			ActionContributionItem item = new ActionContributionItem(action);

			item.setId(objRef);

			return item;
		}
	}

	/**
	 * 
	 * @param app
	 * @param iconPath
	 * @return
	 */
	private ImageDescriptor getImageDescriptor(WindApplication app, String iconPath) {
		ImageDescriptor imgDsc = null;
		if (iconPath != null) {
			Bundle bundle = Platform.getBundle(app.getBundleContext().getBundle().getSymbolicName());
			URL imgUrl = bundle.getEntry(iconPath);
			if (imgUrl != null) {
				imgDsc = ImageDescriptor.createFromURL(imgUrl);
			}
		}
		return imgDsc;
	}

}
