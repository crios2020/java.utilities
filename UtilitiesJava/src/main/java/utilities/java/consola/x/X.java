package utilities.java.consola.x;
import java.util.Scanner;
/**
 * Consola X, se usa para simplificar el trábajo con la consola de sistema.
 * La consola de Netbeans Maven puede tener comportamiento distinto a la de
 * Netbeans Ant o a la del sistema operativo.
 * @author carlos
 */
public class X {
    private final static Scanner sc=new Scanner(System.in);
    /**
     * Imprime en consola y mantiene el cursor en la misma linea.
     * @param o Argumento a imprimir
     */
    public static void print(Object o) {
        System.out.print(o);
    }
    /**
     * Imprime en consola y mueve el cursor a una nueva linea. 
     * @param o Argumento a imprimir
     */
    public static void println(Object o) {
        System.out.println(o);
    }
    /**
     * Permite el ingreso de un valor String por consola.
     * @return Retorna el valor ingresado.
     */
    public static String input() {
        return sc.nextLine();
    }
    /**
     * Permite el ingreso de un valor String por consola.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static String input(String message) {
        print(message);
        return sc.nextLine();
    }
    /**
     * Permite el ingreso de un valor int por consola.
     * @return Retorna el valor ingresado.
     */
    public static int inputInt() {
        return Integer.parseInt(sc.nextLine());
    }
    /**
     * Permite el ingreso de un valor int por consola.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static int inputInt(String message) {
        print(message);
        return Integer.parseInt(sc.nextLine());   
    }
    /**
     * Permite el ingreso de un valor float por consola.
     * @return Retorna el valor ingresado.
     */
    public static float inputFloat() {
        return Float.parseFloat(sc.nextLine());
    }
    /**
     * Permite el ingreso de un valor float por consola.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static float inputFloat(String message) {
        print(message);
        return Float.parseFloat(sc.nextLine());
    }
    /**
     * Permite el ingreso de un valor double por consola.
     * @return Retorna el valor ingresado.
     */
    public static double inputDouble() {
        return Double.parseDouble(sc.nextLine());    
    }
    /**
     * Permite el ingreso de un valor double por consola.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static double inputDouble(String message) {
        print(message);
        return Double.parseDouble(sc.nextLine());
    }
}