package br.com.maisha.wind.faces.view;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
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

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		IPresentationProvider presProvider = ServiceProvider.getInstance()
				.getService(IPresentationProvider.class,
						Activator.getDefault().getBundle().getBundleContext());
		presProvider.registerRender(this);

		tableViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		TableViewerColumn iconCol = new TableViewerColumn(tableViewer, SWT.NONE);
		iconCol.getColumn().setText("");
		iconCol.getColumn().setWidth(25);
		iconCol.getColumn().setResizable(false);
		iconCol.getColumn().setMoveable(false);

		TableViewerColumn msgCol = new TableViewerColumn(tableViewer, SWT.NONE);
		msgCol.getColumn().setText("Message");
		msgCol.getColumn().setWidth(250);
		msgCol.getColumn().setResizable(true);
		msgCol.getColumn().setMoveable(false);

		tableViewer.setContentProvider(new MessageViewContentProvider());
		tableViewer.setLabelProvider(new MessageViewLabelProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);

		List<UserMessage> msgs = new ArrayList<UserMessage>();
		UserMessage msg = new UserMessage();
		msg.setI18nMessage("doxo");
		msg.setKind(MessageKind.ERROR);
		msgs.add(msg);

		msg = new UserMessage();
		msg.setI18nMessage("doxo");
		msg.setKind(MessageKind.WARNING);
		msgs.add(msg);

		msg = new UserMessage();
		msg.setI18nMessage("doxo");
		msg.setKind(MessageKind.INFO);
		msgs.add(msg);
		tableViewer.setInput(msgs);

	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {

	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType getModelLevel() {
		return LevelType.Message;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(Object model) {
		log.debug("Messages changed...");
		if (model instanceof List<?>) {
			List<UserMessage> msg = (List<UserMessage>) model;
			List<UserMessage> curr = (List<UserMessage>) tableViewer.getInput();

			curr.addAll(msg);
			
			tableViewer.setInput(curr);
		}

	}

}
