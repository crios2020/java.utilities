package utilities.java.text.validator;

/**
 * Clase para testear la utilidad Validator.
 *
 * @author carlos
 */
public class TestValidator {

    public static void main(String[] args) {
        System.out.println(new TextValidator("Hola").length(2, 20));
        System.out.println(new TextValidator("<Hola").length(2, 20));
        System.out.println(new TextValidator("a").length(2, 20));
        System.out.println(new TextValidator("a").isInteger(10, 100));
        System.out.println(new TextValidator("5").isInteger(10, 100));
        System.out.println(new TextValidator("50").isInteger(10, 100));
        System.out.println(new TextValidator("500").isInteger(10, 100));
        System.out.println(new TextValidator("50x").isInteger(10, 100));
        System.out.println(new TextValidator("50x").isEmail());
        System.out.println(new TextValidator("50<").isEmail());
        System.out.println(new TextValidator("carlos.rios@gmail.com").isEmail());
        System.out.println(new TextValidator("carlosrios@gmailcom").isEmail());
        System.out.println(new TextValidator("carlos.riosgmail.com").isEmail());
    }
}
