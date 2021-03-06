package br.com.maisha.wind.faces.view;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.faces.view.message.MessageViewContentProvider;
import br.com.maisha.wind.faces.view.message.MessageViewLabelProvider;

/**
 * View part to show messages from the platform to the user.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MessageView extends ViewPart implements IRender {

	/** View Part ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.messageView";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(MessageView.class);

	/** */
	private TableViewer tableViewer;

	/** Action for clear message view. */
	private IAction clearAllAction;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	public void dispose() {
		super.dispose();
		IPresentationProvider presentation = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presentation.unRegisterRender(this);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		setPartName(PlatformMessageRegistry.getInstance().getMessage("wind_faces.messageView.title"));

		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presProvider.registerRender(this);

		tableViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		TableViewerColumn iconCol = new TableViewerColumn(tableViewer, SWT.NONE);
		iconCol.getColumn().setText("");
		iconCol.getColumn().setWidth(25);
		iconCol.getColumn().setResizable(false);
		iconCol.getColumn().setMoveable(false);

		TableViewerColumn sourceCol = new TableViewerColumn(tableViewer, SWT.NONE);
		sourceCol.getColumn().setText(PlatformMessageRegistry.getInstance().getMessage("wind_faces.messageview.source"));
		sourceCol.getColumn().setWidth(100);
		sourceCol.getColumn().setResizable(true);
		sourceCol.getColumn().setMoveable(false);

		TableViewerColumn msgCol = new TableViewerColumn(tableViewer, SWT.NONE);
		msgCol.getColumn().setText(PlatformMessageRegistry.getInstance().getMessage("wind_faces.messageview.message"));
		msgCol.getColumn().setWidth(350);
		msgCol.getColumn().setResizable(true);
		msgCol.getColumn().setMoveable(false);

		tableViewer.setContentProvider(new MessageViewContentProvider());
		tableViewer.setLabelProvider(new MessageViewLabelProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);

		tableViewer.setInput(new ArrayList<UserMessage>());

		createActions();
		IToolBarManager tbManager = getViewSite().getActionBars().getToolBarManager();
		tbManager.add(clearAllAction);
	}

	public void createActions() {
		clearAllAction = new Action(PlatformMessageRegistry.getInstance().getMessage("wind_faces.messageview.clear")) {

			public void run() {
				tableViewer.setInput(new ArrayList<UserMessage>());
			}
		};
		clearAllAction.setImageDescriptor(Activator.getImageDescriptor("icons/clear.gif"));
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages()[0].showView(MessageView.ID, null, IWorkbenchPage.VIEW_ACTIVATE);

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.Message };
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public void render(LevelType level, ChangeType ct, Object model) {
		log.debug("Messages changed...");
		if (model instanceof List<?>) {
			List<UserMessage> msg = (List<UserMessage>) model;
			List<UserMessage> curr = (List<UserMessage>) tableViewer.getInput();

			curr.addAll(msg);

			tableViewer.setInput(curr);
			this.setFocus();
		}

	}

}
