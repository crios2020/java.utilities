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
    public static void print(Object o) {
        System.out.print(o);
    }
    public static void println(Object o) {
        System.out.println(o);
    }
    public static String input() {
        return sc.nextLine();
    }
    public static String input(String message) {
        print(message);
        return sc.nextLine();
    }
    public static int inputInt() {
        return Integer.parseInt(sc.nextLine());
    }
    public static int inputInt(String message) {
        print(message);
        return Integer.parseInt(sc.nextLine());   
    }
    public static float inputFloat() {
        return Float.parseFloat(sc.nextLine());
    }
    public static float inputFloat(String message) {
        print(message);
        return Float.parseFloat(sc.nextLine());
    }
    public static double inputDouble() {
        return Double.parseDouble(sc.nextLine());    
    }
    public static double inputDouble(String message) {
        print(message);
        return Double.parseDouble(sc.nextLine());
    }
}