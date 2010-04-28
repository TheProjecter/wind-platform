package br.com.maisha.wind.faces.view;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.ControlAnimator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class TitleArea {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(TitleArea.class);

	/**  */
	private Label messageArea;

	/**  */
	private ControlAnimator animator;

	/**  */
	private Composite contents;

	public TitleArea(Composite parent) {
		createContents(parent);
	}

	/**
	 * Cria o conteudo da area de titulo.
	 * 
	 * @param parent
	 *            componente grafico pai da area de titulo.
	 */
	private void createContents(Composite parent) {
		contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new FillLayout(SWT.HORIZONTAL));

	}

	/**
	 * Display the given error message. The currently displayed message is saved
	 * and will be redisplayed when the error message is set to
	 * <code>null</code>.
	 * 
	 * @param message
	 *            the newErrorMessage to display or <code>null</code>
	 * @param type
	 *            tipo da mensagem.
	 */
	public void setMessage(String message, int type) {
		if (message == null || message.trim().length() == 0) {
			log.debug("displaying message [" + message + "] on tile area...");
			// destroi message area
			if (messageArea != null && !messageArea.isDisposed()) {
				animator.setVisible(false);
			}
			animator = null;

			if (messageArea != null) {
				messageArea.dispose();
				messageArea = null;
			}

		} else {

			// cria message area
			if (messageArea == null) {

				messageArea = new Label(contents, SWT.NONE);
				animator = new ControlAnimator(messageArea);
				messageArea.setToolTipText(message);
				messageArea.setText(message);
				// messageArea.setImage(messageImageMap.get(type));
				animator.setVisible(true);
			}
		}
		contents.pack();

		if (messageArea != null) {
			Display.getCurrent().timerExec(3000, new Runnable() {
				public void run() {
					//setMessage(null, -1);
				}
			});
		}
	}
}
