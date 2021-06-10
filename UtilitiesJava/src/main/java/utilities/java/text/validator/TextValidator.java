package utilities.java.text.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Validador de Texto
 *
 * @author carlos
 */
public class TextValidator {

    private String text;

    /**
     * Lista de caracteres no seguros. Esta lista se usa para filtrar caracteres
     * que pueden producir alguna vulnerabilidad.
     */
    private List<Character> list = new ArrayList();

    /**
     * Constructor
     *
     * @param text Texto a validar
     */
    public TextValidator(String text) {
        this.text = text;
        list.add('<');
        list.add('>');
        list.add(';');
    }

    /**
     * Usar este método para agregar una lista de caracteres no seguros.
     *
     * @param list
     */
    public void setList(List<Character> list) {
        this.list = list;
    }

    /**
     * Usar este método para agregar un caracter no seguro.
     *
     * @param car
     */
    public void addCharacter(char car) {
        list.add(car);
    }

    /**
     * Valida si text contiene un texto entre longitud min y max.
     *
     * @param min Longitud mínima.
     * @param max Longitud máxima.
     * @return
     */
    public boolean length(int min, int max) {
        if (!isTextSecure()) {
            return false;
        }
        if (text.length() >= min && text.length() <= max) {
            return true;
        }
        return false;
    }

    /**
     * Verifica si text contiene un entero.
     *
     * @return
     */
    public boolean isInteger() {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Verifica si el text contiene un entero entre min y max.
     *
     * @param min Valor mínimo permitido.
     * @param max Valor máximo permitido.
     * @return
     */
    public boolean isInteger(int min, int max) {
        if (!isInteger()) {
            return false;
        }
        int valor = Integer.parseInt(text);
        if (valor >= min && valor <= max) {
            return true;
        }
        return false;
    }

    /**
     * Este método verifica si text contiene texto seguro. El atributo list
     * contiene la lista de caracteres no seguros.
     *
     * @return
     */
    public boolean isTextSecure() {
        for (int a = 0; a < text.length(); a++) {
            if (list.contains(text.charAt(a))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Este método verifica si text tiene formato de Email
     *
     * @return
     */
    public boolean isEmail() {
        if (!isTextSecure()) {
            return false;
        }
        if (text.contains("@") && text.contains(".")) {
            return true;
        }
        return false;
    }
}
