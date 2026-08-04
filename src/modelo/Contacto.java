package modelo;

/**
 * ==========================================================
 * Clase: Contacto
 * Proyecto: Agenda de Contactos
 * Autor: Giovanny A. Tapiero C. :. . / .
 * Java: 21
 * ==========================================================
 *
 * Modelo que representa un contacto de la agenda .
 */
public class Contacto {

    private int id;
    private String nombre;
    private  String telefono;
    private String correo;

    /**
     *  constructor vacio .
     */
    public Contacto() {

    }

    /**
     * Constructor sin ID.
     *
     * @param nombre   Nombre del contacto.
     * @param telefono Teléfono del contacto.
     * @param correo   Correo electrónico del contacto.
     */
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * Constructor con todos los atributos.
     *
     * @param id       Identificador del contacto.
     * @param nombre   Nombre del contacto.
     * @param telefono Teléfono del contacto.
     * @param correo   Correo electrónico del contacto.
     */
    public Contacto(int id, String nombre, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // getters y setters.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *  muestra la informacion del contacto.
     */
    @Override
    public String toString() {
        return String.format(
                "%-5d %-20s %-15s %-30s",
                id,
                nombre,
                telefono,
                correo
        );
    }
}   