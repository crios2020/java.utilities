package utilities.java.swing.panel;
import javax.swing.JOptionPane;
/**
 * Utilidad para simplificar el uso de cuadros de dialogos JOptionPane en swing
 * @author carlos
 */
public class Box {
    /**
     * Muestra un cuadro de dialogo con un mensaje.
     * @param o Mensage a mostrar
     */
    public static void msgBox(Object o) {
        JOptionPane.showMessageDialog(null, o);
    }
    /**
     * Permite el ingreso de un valor String desde un cuadro de dialogo.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static String input(String message) {
        return JOptionPane.showInputDialog(message);
    }
    /**
     * Permite el ingreso de un valor int desde un cuadro de dialogo.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static int inputInt(String message) {
        try { return Integer.parseInt(JOptionPane.showInputDialog(message));   
        } catch (Exception e) { return 0; }
    }
    /**
     * Permite el ingreso de un valor float desde un cuadro de dialogo.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static float inputFloat(String message) {
        try { return Float.parseFloat(JOptionPane.showInputDialog(message));
        } catch (Exception e) { return 0; }
    }
    /**
     * Permite el ingreso de un valor double desde un cuadro de dialogo.
     * @param message mensaje a mostrar en el ingreso de datos.
     * @return Retorna el valor ingresado.
     */
    public static double inputDouble(String message) {
        try { return Double.parseDouble(JOptionPane.showInputDialog(message));
        } catch (Exception e) { return 0; }
    }
    /**
     * Realiza una pregunta al usuario 
     * @param message Pregunta al usuario
     * @return respuesta del usuario true en caso de (S s Y y) o false en caso de (N n)
     */
    public static boolean request(String message){
        if(JOptionPane.showConfirmDialog(null, message)==JOptionPane.YES_OPTION) return true;
        else return false;
    }
}
