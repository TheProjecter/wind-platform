package br.com.maisha.wind.faces.rcp;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RCPUtil {

	/**
	 * Retorna o id da perspectiva corrente.
	 * 
	 * @return id da perspectiva corrente.
	 */
	public static String getCurrentPerspective() {
		return getWorkbenchWindow().getActivePage().getPerspective().getId();
	}

	/**
	 * Retorna o workbench da plataforma RCP do Eclipse.
	 * 
	 * @return o workbench da plataforma RCP do Eclipse.
	 */
	public static IWorkbench getWorkbench() {
		return PlatformUI.getWorkbench();
	}

	/**
	 * Retorna a janela ativa do workbench da plataforma RCP do Eclipse.
	 * 
	 * @return janela ativa do workbench da plataforma RCP do Eclipse.
	 */
	public static IWorkbenchWindow getWorkbenchWindow() {
		return getWorkbench().getActiveWorkbenchWindow();
	}

	/**
	 * Retorna o gerenciador da barra de menus da janela dada.
	 * 
	 * @param window
	 *            janela da qual se quer o gerenciador.
	 * 
	 * @return gerenciador da barra de menus da janela dada.
	 */
	public static IMenuManager getWindowMenuManager(IWorkbenchWindow window) {
		return ((ApplicationWindow) window).getMenuBarManager();
	}

	/**
	 * Retorna o gerenciador da barra de ferramentas da janela dada.
	 * 
	 * @param window
	 *            janela da qual se quer o gerenciador.
	 * 
	 * @return gerenciador da barra de ferramentas da janela dada.
	 */
	public static IToolBarManager getWindowToolBarManager(
			IWorkbenchWindow window) {
		return ((ApplicationWindow) window).getToolBarManager();
	}

	/**
	 * Retorna o gerenciador da barra <i>cool</i> da janela dada.
	 * 
	 * @param window
	 *            janela da qual se quer o gerenciador.
	 * 
	 * @return gerenciador da barra <i>cool</i> da janela dada.
	 */
	public static ICoolBarManager getWindowCoolBarManager(
			IWorkbenchWindow window) {
		return ((ApplicationWindow) window).getCoolBarManager();
	}

}
