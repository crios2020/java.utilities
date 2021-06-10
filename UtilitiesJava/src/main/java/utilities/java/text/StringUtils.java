package utilities.java.text;

/**
 * Utilidad para manejo de String. La clase String de java es muy completa, pero
 * carece de alguna utilidades. Esta clase complementa al manejo de Strings en
 * java.
 *
 * @author carlos
 */
public class StringUtils {

    /**
     * Este método convierte la primer letra de un String en mayúsculas. No
     * modifica el resto del String.
     *
     * @param text String a convertir.
     * @return String convertido.
     */
    public static String upperCaseFirst(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    /**
     * Este método convierte la primer letra de un String en mayúsculas. Si el
     * boolean toLower es true, convierte el resto del String en minúsculas.
     *
     * @param text String a convertir.
     * @param toLower Setear en true para forzar al resto de String en
     * minúsculas.
     * @return String convertido.
     */
    public static String upperCaseFirst(String text, boolean toLower) {
        if (toLower) {
            return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        } else {
            return upperCaseFirst(text);
        }
    }

    /**
     * Este método convierte la primer letra de cada palabra de un String en
     * mayúsculas. No modifica el resto del String.
     *
     * @param text String a convertir.
     * @return String convertido.
     */
    public static String upperCaseAllFirstLetter(String text) {
        char[] array = text.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }

    /**
     * Este método convierte la primer letra de cada palabra de un String en
     * mayúsculas. Si el boolean toLower es true, convierte el resto del String
     * en minúsculas.
     *
     * @param text String a convertir.
     * @param toLower Setear en true para forzar al resto de String en
     * minúsculas.
     * @return String convertido.
     */
    public static String upperCaseAllFirstLetter(String text, boolean toLower) {
        if (toLower) {
            char[] array = text.toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (Character.isWhitespace(array[i - 1])) {
                    array[i] = Character.toUpperCase(array[i]);
                }
            }
            return new String(array);
        } else {
            return upperCaseAllFirstLetter(text);
        }
    }

    /**
     * Este método que revierte un String.
     *
     * @param text String a revertir.
     * @return String revertido.
     */
    public static String revert(String text) {
        char[] chars = text.toCharArray();
        String rev = "";
        for (int a = chars.length - 1; a >= 0; a--) {
            rev += chars[a];
        }
        return rev;
    }

    /**
     * Este método devuelve true en caso de tener un palindromo. Un palíndromo,
     * también llamado palíndromo, palíndroma o palindroma, es una palabra o
     * frase que se lee igual en un sentido que en otro. Si se trata de números
     * en lugar de letras, se llama capicúa. Habitualmente, las frases
     * palindrómicas se resienten en su significado cuanto más largas son.
     *
     * @param text Posible palindromo.
     * @return true en caso de tener un palindromo.
     */
    public static boolean isPalindrome(String text) {
        return text.equals(revert(text));
    }
}
