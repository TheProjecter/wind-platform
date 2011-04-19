package br.com.maisha.wind.faces;

import java.util.List;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.render.editor.EditionView;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

import com.vaadin.Application;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.Reindeer;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class VaadiApplication extends Application {

	/**  */
	private static final long serialVersionUID = 1L;
	private VerticalLayout mainLayout;
	private Window mainWindow;
	private VerticalSplitPanel split;
	private Panel editorArea;
	private TabSheet views;

	/** Represents the menu bar on top of the screen. */
	private MenuBar menuBar;

	/** This */
	private static VaadiApplication instance;

	@Override
	public void init() {
		instance = this;

		// window
		mainWindow = new Window("Wind Platform");
		setTheme(Reindeer.THEME_NAME);
		setMainWindow(mainWindow);
		mainLayout = (VerticalLayout) mainWindow.getContent();
		mainLayout.setMargin(false);
		mainLayout.setStyleName("default");
		mainLayout.setSpacing(true);
		mainLayout.setSizeFull();

		// menu
		menuBar = getMenu();
		mainLayout.addComponent(menuBar);

		// header
		HorizontalLayout header = new HorizontalLayout();
		header.addComponent(getHeader());
		mainLayout.addComponent(header);

		// editor area
		editorArea = getEditorArea();

		// view
		views = getViews();

		CssLayout margin = new CssLayout();
		margin.setMargin(false, true, true, true);
		margin.setSizeFull();
		split = new VerticalSplitPanel();
		split.setSizeFull();
		split.addComponent(editorArea);
		split.addComponent(views);
		split.setSplitPosition(65);
		margin.addComponent(split);
		mainLayout.addComponent(margin);
		mainLayout.setExpandRatio(margin, 1);

		registerModelListener();
	}

	private void registerModelListener() {
		// retrive application metadata model...
		IApplicationRegistry appRegistry = ServiceProvider.getInstance().getService(IApplicationRegistry.class,
				Activator.getContext());
		List<WindApplication> applications = appRegistry.retrieve();

		// presentation provider to render...
		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getContext());
		for (WindApplication app : applications) {
			presProvider.render(app, LevelType.Application, ChangeType.Added);
		}

		// register app model listener to react to it's changes...
		IAppModelListenerRegistry modelListenerReg = ServiceProvider.getInstance().getService(
				IAppModelListenerRegistry.class, Activator.getContext());
		modelListenerReg.registerAppModelListener(new VaadinAppModelListener());
	}

	private Panel getEditorArea() {
//		Panel p = new Panel();
//		p.setSizeFull();
//		VerticalLayout mainVerticalLayout = (VerticalLayout) p.getContent();
//		mainVerticalLayout.setMargin(false);
//
//		CssLayout vl = new CssLayout();
//		vl.setStyleName(Reindeer.LAYOUT_BLUE);
//		vl.setMargin(false);
//		vl.setSizeFull();
//		vl.setHeight("45px");
//		p.addComponent(vl);
//
//		CssLayout objectNameLayout = new CssLayout();
//		objectNameLayout.setMargin(true);
//
//		Label objectName = new Label("Domain Object Label");
//		objectName.setStyleName(Reindeer.LABEL_H2);
//		objectNameLayout.addComponent(objectName);
//
//		vl.addComponent(objectNameLayout);
//
//		return p;
		return new EditionView();
	}

	private TabSheet getViews() {
		TabSheet sheet = new TabSheet();
		sheet.setSizeFull();

		sheet.addTab(new Panel(), "Grid", null);
		sheet.addTab(new Panel(), "Messages", null);
		sheet.addTab(new Panel(), "Log", null);

		return sheet;
	}

	private Layout getHeader() {
		HorizontalLayout header = new HorizontalLayout();
		header.setWidth("100%");
		header.setMargin(true);
		header.setSpacing(true);
		// header.setStyleName(Reindeer.LAYOUT_BLACK);

		CssLayout titleLayout = new CssLayout();
		Label title = new Label("Wind Platform");
		title.setStyleName(Reindeer.LABEL_H1);
		title.setSizeUndefined();
		titleLayout.addComponent(title);
		Label description = new Label("A platform for developing Enterprise Business Softwares");
		description.setStyleName(Reindeer.LABEL_SMALL);
		description.setSizeUndefined();
		titleLayout.addComponent(description);

		header.addComponent(titleLayout);

		return header;
	}

	private MenuBar getMenu() {
		MenuBar menubar = new MenuBar();

		menubar.setWidth("100%");
		MenuItem file = menubar.addItem("File", null);
		file.addItem("Open", null);
		file.addItem("Save", null);
		MenuItem recent = file.addItem("Recent", null);
		recent.addItem("../Doxo.html", null);
		recent.addItem("../Doxo.html1", null);

		MenuItem help = menubar.addItem("Help", null);
		help.addItem("About", null);

		return menubar;
	}

	/** @see #menuBar */
	public MenuBar getMenuBar() {
		return menuBar;
	}

	/** @see VaadiApplication#instance */
	public static VaadiApplication get() {
		return instance;
	}
}
