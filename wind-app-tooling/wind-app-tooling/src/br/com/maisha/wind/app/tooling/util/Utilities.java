package br.com.maisha.wind.app.tooling.util;

/**
 * Basic Utilities.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public final class Utilities {

	/**
	 * Verifica se a String dada nao esta em branco.
	 * 
	 * @param text
	 *            String a verificar
	 * @return True caso a String NAO esteja em branco, false caso contrario.
	 */
	public static boolean isNotBlank(String text) {
		return text != null && text.trim().length() > 0;
	}

}
