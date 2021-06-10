package utilities.java.swing.validator;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Utilidad para validar formularios Swing.
 *
 * @author carlos
 */
public class Validator {

    private JTextField txt;

    /**
     * Lista de caracteres no seguros. Esta lista se usa para filtrar caracteres
     * que pueden producir alguna vulnerabilidad.
     */
    private List<Character> list = new ArrayList();

    /**
     * Constructor Validator.
     *
     * @param txt Caja de texto a validar.
     */
    public Validator(JTextField txt) {
        this.txt = txt;

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

    private boolean error(String msj) {
        txt.requestFocus();
        JOptionPane.showMessageDialog(txt, msj, "error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    /**
     * Valida si el textField contiene un texto entre longitud min y max.
     *
     * @param min Longitud mínima.
     * @param max Longitud máxima.
     * @return
     */
    public boolean length(int min, int max) {
        if (!isTextSecure()) {
            return false;
        }
        if (txt.getText().length() >= min && txt.getText().length() <= max) {
            return true;
        }
        return error("El texto debe tener entre " + min + " y " + max + "caracteres!");
    }

    /**
     * Verifica si el textField contiene un entero.
     *
     * @return
     */
    public boolean isInteger() {
        try {
            Integer.parseInt(txt.getText());
            return true;
        } catch (Exception e) {
            return error("El valor debe ser un número entero!");
        }
    }

    /**
     * Verifica si el textField contiene un entero entre min y max.
     *
     * @param min Valor mínimo permitido.
     * @param max Valor máximo permitido.
     * @return
     */
    public boolean isInteger(int min, int max) {
        if (!isInteger()) {
            return false;
        }
        int valor = Integer.parseInt(txt.getText());
        if (valor >= min && valor <= max) {
            return true;
        }
        return error("El valor debe ser entre " + min + " y " + max);
    }

    /**
     * Este método verifica si el textField contiene texto seguro. El atributo
     * list contiene la lista de caracteres no seguros.
     *
     * @return
     */
    public boolean isTextSecure() {
        String text = txt.getText();
        for (int a = 0; a < text.length(); a++) {
            if (list.contains(text.charAt(a))) {
                return error("El texto contiene caracteres invalidos.");
            }
        }
        return true;
    }

    /**
     * Este método verifica si el textField tiene formato de Email
     *
     * @return
     */
    public boolean isEmail() {
        if (!isTextSecure()) {
            return false;
        }
        String email = txt.getText();
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return error("El texto no tiene formato de Email.");
    }
}
