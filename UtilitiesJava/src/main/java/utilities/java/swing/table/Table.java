package utilities.java.swing.table;

import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Utilidad que completa un control JTable con un List.
 *
 * @author carlos
 * @param <E>
 */
public class Table<E> {

    /**
     * Este método completa un JTable con un List.
     *
     * @param tbl JTable a cargar.
     * @param list List lista con datos de ingreso.
     */
    public void cargar(JTable tbl, List<E> list) {
        if (tbl == null) {
            return;
        }
        DefaultTableModel dtm = new DefaultTableModel();
        tbl.setModel(dtm);
        if (list == null || list.isEmpty()) {
            return;
        }
        E e = list.get(0);
        Field[] campos = e.getClass().getDeclaredFields();
        for (Field f : campos) {
            dtm.addColumn(f.getName());
        }
        for (E x : list) {
            Object[] fila = new Object[campos.length];
            for (int a = 0; a < campos.length; a++) {
                Field f = campos[a];
                String method = "";
                if (f.getGenericType().getTypeName().equals("boolean")) {
                    method = "is";
                } else {
                    method = "get";
                }
                method += f.getName().substring(0, 1).toUpperCase()
                        + f.getName().substring(1);
                try {
                    fila[a] = e.getClass().getDeclaredMethod(method, null).invoke(x, null);
                } catch (Exception ex) {
                    System.out.println(e);
                }
            }
            dtm.addRow(fila);
        }
    }
}
