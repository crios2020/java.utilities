package utilities.java.swing.table;

import java.util.List;

/**
 * repositorio de Ejemplo para testear la utilidad Table.
 *
 * @author carlos
 */
public class PersonaEntitie {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean socio;

    public PersonaEntitie(String nombre, String apellido, int edad, boolean socio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.socio = socio;
    }

    public static List<PersonaEntitie> getList() {
        return List.of(
                new PersonaEntitie("Matias", "Mendez", 23, true),
                new PersonaEntitie("Laura", "Copas", 56, false),
                new PersonaEntitie("Luis", "Jielo", 45, true),
                new PersonaEntitie("Marina", "Losa", 23, false),
                new PersonaEntitie("Tati", "Perez", 43, true),
                new PersonaEntitie("Pedro", "Soto", 33, true)
        );
    }

    @Override
    public String toString() {
        return "PersonaEntitie{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", socio=" + socio + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

}
