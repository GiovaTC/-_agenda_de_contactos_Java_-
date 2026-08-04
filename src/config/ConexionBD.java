package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ==========================================================
 * Clase: ConexionBD
 * Proyecto: Agenda de Contactos
 * Autor: Giovanny A. Tapiero C. :. . /  .
 * Java: 21
 * Base de Datos: MySQL 8
 * ==========================================================
 *
 * Responsabilidad:
 * Administrar la conexión con la base de datos MySQL.
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/agenda_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "Tapiero123";

    /**
     *  obtiene una conexion a la base de datos.
     *  @return connection
     */

    public static Connection obtenerConexion() {

        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("conexion establecida correctamente. ");

        } catch (SQLException e) {

            System.out.println("Error al conectar con la base de datos. ");
            System.out.println(e.getMessage());
        }

        return conexion;
    }

    /**
     * cierra la conexion si esta abierta.
     * @param conexion conexion a cerrar.
     */
    public static void cerrarConexion(Connection conexion) {

        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("conexion cerrada correctamente! ");

            } catch (SQLException e) {

                System.out.println("error al cerrar la conexion! ");
            }
        }
    }
}
