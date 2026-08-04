package dao;

import config.ConexionBD;
import modelo.Contacto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ==========================================================
 * Clase: ContactoDAO
 * Proyecto: Agenda de Contactos
 * Autor: Giovanny A. Tapiero C. :. . /  .
 * Java: 21
 * Base de Datos: MySQL 8
 * ==========================================================
 *
 * Responsabilidad:
 * Administrar las operaciones CRUD de la tabla contactos.
 */

public class ContactoDAO {

    /**
     * Guarda un contacto en la base de datos.
     *
     * @param contacto Contacto a guardar.
     */
    public void guardar(Contacto contacto) {
        String sql = "INSERT INTO contactos(nombre, telefono, correo) VALUES (?,?,?)";

        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = ConexionBD.obtenerConexion();
            ps = conexion.prepareStatement(sql);

            ps.setString(1, contacto.getNombre());
            ps.setString(2, contacto.getTelefono());
            ps.setString(3, contacto.getCorreo());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("\nContacto registrado correctamente!");
            } else {
                System.out.println("\nNo fue posible registrar el contacto.");
            }
        } catch (SQLException e) {
            System.out.println("error al guardar el contacto.");
            System.out.println(e.getMessage());

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     *  lista todos los contactos almacenados.
     */
    public void listar() {
        String sql = "SELECT * FROM contactos ORDER BY id";

        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conexion = ConexionBD.obtenerConexion();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            System.out.println();
            System.out.println("===============================================================");
            System.out.printf("%-5s %-20s %-15s %-30s%n",
                    "ID",
                    "NOMBRE",
                    "TELÉFONO",
                    "CORREO");
            System.out.println("===============================================================");

            while (rs.next()) {

                Contacto contacto = new Contacto();

                contacto.setId(rs.getInt("id"));
                contacto.setNombre(rs.getString("nombre"));
                contacto.setTelefono(rs.getString("telefono"));
                contacto.setCorreo(rs.getString("correo"));

                System.out.println(contacto);
            }

            System.out.println("===============================================================");

        } catch (SQLException e) {

            System.out.println("Error al consultar los contactos.");
            System.out.println(e.getMessage());

        } finally {
            try {
                if ( rs != null) {
                    rs.close();
                }

                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}   
