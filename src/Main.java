import dao.ContactoDAO;
import modelo.Contacto;

import java.util.Scanner;

/**
 * ==========================================================
 * Clase: Main
 * Proyecto: Agenda de Contactos
 * Autor: Giovanny A. Tapiero C. :. . /  .
 * Java: 21
 * Base de Datos: MySQL 8
 * ==========================================================
 *
 * Programa principal.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContactoDAO contactoDAO = new ContactoDAO();

        int opcion;

        do {
            System.out.println();
            System.out.println("=================================");
            System.out.println("      AGENDA DE CONTACTOS");
            System.out.println("=================================");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println();
                    System.out.println("----- NUEVO CONTACTO -----");

                    System.out.print("Nombre   : ");
                    String nombre = scanner.nextLine();

                    System.out.print("Teléfono : ");
                    String telefono = scanner.nextLine();

                    System.out.print("Correo   : ");
                    String correo = scanner.nextLine();

                    Contacto contacto = new Contacto(nombre, telefono, correo);

                    contactoDAO.guardar(contacto);

                    break;
                case 2:

                    contactoDAO.listar();

                    break;

                case 3:
                    System.out.println();
                    System.out.println("Gracias por utilizar la Agenda de Contactos.");
                    System.out.println("Programa finalizado.");

                    break;
                default:

                    System.out.println();
                    System.out.println("Opción no válida .");
            }
        } while (opcion != 3);

        scanner.close();
    }
}   