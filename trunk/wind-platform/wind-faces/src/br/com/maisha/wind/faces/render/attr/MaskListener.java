package br.com.maisha.wind.faces.render.attr;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * Implementa o suporte de mascara para os campos textos.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class MaskListener implements Listener {
    
    /** Caracter da mascara que casa com um numero ou uma letra. */
    public static final char ALPHA = 'A';

    /** Caracter da mascara que casa com uma letra. */
    public static final char LETTER = 'L';
    
    /** Caracter da mascara que casa com um numero. */
    public static final char NUMBER = 'N';
    
    /** Codigo da tecla delete. */
    private static final int DELETE_KEY = 8;

    /** Codigo da tecla backspace. */
    private static final int BACKSPACE_KEY = 127;
    
    /** Mascara do listener. */
    private String mask;
    
    /** Flag que indica se processa o evento ou nao. */
    private boolean ignore;
    
    /** Caracters da mascara que nao sao escape de mascara. */
    private String notMask;
    
    /**
     * Contrutor.
     * 
     * @param mask mascara a ser aplcicada.
     * @param date flag que indica se a mascara e uma data.
     */
    public MaskListener(String mask, boolean date) {
        ignore = false;
        setMask(mask, date);
    }
    
    /**
     * @see org.eclipse.swt.widgets.Listener#handleEvent(
     * org.eclipse.swt.widgets.Event)
     */
    public void handleEvent(Event event) {

        // verifica se esta processando
        if (ignore) {
            return;
        }
        
        try {
            
            // inicia processamento
            ignore = true;
            
            // verifica delete e backspace
            if (event.keyCode != DELETE_KEY && event.keyCode != BACKSPACE_KEY) {
                Text text = (Text) event.widget;
                
                // se tem mascara
                if (mask != null && mask.trim().length() > 0) {
                    String value = getValue(text, event);
                    
                    // nao tem caracter
                    if (value.length() == 0) {
                        return;
                    }
                    
                    String newValue = processMask(value, mask);
                    if (!value.equals(newValue)) {
                        text.setText(newValue);

                        text.setSelection(newValue.length());
                        event.doit = false;
                    }
                }
            }
        } finally {
            
            // finaliza processamento
            ignore = false;
        }
    }
    
    /**
     * Recupera o valor para processar.
     * 
     * @param text campo texto.
     * @param event evento de verificacao.
     * 
     * @return o valor do campo texto para processar.
     */
    private String getValue(Text text, Event event) {
        StringBuffer sb = new StringBuffer(text.getText());
        String aux = event.text;
      
        sb.replace(event.start, event.end, aux);
        return sb.toString();
    }
    
    /**
     * Configura a mascara do listener.
     * 
     * @param mask mascara a ser aplcicada.
     * @param date flag que indica se a mascara e uma data.
     */
    private void setMask(String mask, boolean date) {
        String aux = mask;
        
        // converte as marcas de dia, mes e ano para numero
        if (date) {
            char[] dateMask = {'d', 'M', 'y'};
            for (int i = 0; i < dateMask.length; i++) {
                aux = aux.replace(dateMask[i], NUMBER);
            }
        }
        this.mask = aux;

        setNotMaskChars();
    }
    
    /**
     * Configura os caracteres que nao fazem parte dos escape de mascara.
     * <p />
     * Os escapes de mascara sao:
     * <ul>
     *   <li>{@link #ALPHA}</li>
     *   <li>{@link #LETTER}</li>
     *   <li>{@link #NUMBER}</li>
     * </ul>
     */
    private void setNotMaskChars() {
        String aux = "";
        for (int i = 0; i < mask.length(); i++) {
            char c = mask.charAt(i);
            if (!isMask(c)) {
                if (aux.indexOf(c) == -1) {
                    aux += c;
                }
            }
        }
        notMask = aux;
    }
    
    /**
     * Processa mascara de texto.
     * 
     * @param value valor digitado
     * @param mask mascara a ser aplcicada.
     * 
     * @return novo valor com a aplicacao da mascara.
     */
    private String processMask(String value, String mask) {

        // retira os caracteres nao escape de mascara
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (notMask.indexOf(c) == -1) {
                sb.append(c);
            } 
        }

        StringBuffer maskBuffer = new StringBuffer(mask);
        maskBuffer.reverse();
        sb.reverse();
        // aplica mascara
        StringBuffer newValue = new StringBuffer();
       
        int valueNotSet = 0;
        for (int i = 0; i < maskBuffer.length(); i++) {
            if ((i - valueNotSet) < sb.length()) {
                char valueChar = sb.charAt(i - valueNotSet);
                char maskChar = maskBuffer.charAt(i);
                if (isMask(maskChar)) {
                    if (verify(maskChar, valueChar)) {
                        newValue.append(valueChar);
                    } else {                        
                        valueNotSet++;
                    }
                } else {
                	if(!String.valueOf(valueChar).equals("-"))
                		newValue.append(maskChar);
                	valueNotSet++;
                }
            }
        }       
        newValue.reverse();
        return newValue.toString();
    }
    
    /**
     * Verifica se o caracter dado e um caracter de mascara.
     * <p />
     * Os caracteres de mascara sao:
     * <ul>
     *   <li>{@link #ALPHA}</li>
     *   <li>{@link #LETTER}</li>
     *   <li>{@link #NUMBER}</li>
     * </ul>
     *  
     * @param c caracter a ser verificado.
     * 
     * @return <code>true</code> se o caracter dado e um caracter de mascara;
     * <code>false</code> caso contrario.
     */
    private boolean isMask(char c) {
        return c == ALPHA || c == NUMBER || c == LETTER;
    }

    /**
     * Verifica se o valor dado casa com a mascara.
     * 
     * @param mask caracter da mascara.
     * @param value caracter do valor.
     * 
     * @return <code>true</code> caso o valor dado case com a mascara dada;
     * <code>false</code> caso contrario.
     */
    private boolean verify(char mask, char value) {
        boolean ret = false;
        
        switch (mask) {
        case ALPHA:
            ret = isLetter(value) || isNumber(value);
            break;
        case LETTER:
            ret = isLetter(value);
            break;
        case NUMBER:
            ret = isNumber(value);
            break;
        default:
            ret = mask == value;
        }
        
        return ret;
    }
    
    /**
     * Verifica se o caracter dado e uma letra.
     * 
     * @param value caracter a ser verificado.
     * 
     * @return <code>true</code> caso o caracter dado seja uma letra; 
     * <code>false</code> caso contrario.
     */
    private boolean isLetter(char value) {
        return Character.isLetter(value);
    }
    
    /**
     * Verifica se o caracter dado e um numero.
     * 
     * @param value caracter a ser verificado.
     * 
     * @return <code>true</code> caso o caracter dado seja um numero; 
     * <code>false</code> caso contrario.
     */
    private boolean isNumber(char value) {
    	return Character.isDigit(value) || String.valueOf(value).equals("-");
    }
}
