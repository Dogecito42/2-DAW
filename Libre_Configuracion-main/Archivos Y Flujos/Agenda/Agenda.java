/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Agenda {

    private static Contacto contactoActivo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contactoActivo = new Contacto("", "", ""); // Inicializamos con valores vacíos

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    introducirDatos(scanner);
                    break;
                case 2:
                    consultarDatos(scanner);
                    break;
                case 4:
                    escribirContactoEnFichero(scanner);
                    break;
                case 3:
                    leerContactoDesdeFichero(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("Elige una opción:");
        System.out.println("1.- Introducir datos del contacto");
        System.out.println("2.- Consultar datos del contacto");
        System.out.println("3.- Leer un contacto desde fichero (fichero de texto)");
        System.out.println("4.- Escribir un contacto en fichero (fichero de texto)");
        System.out.println("0.- Salir");
    }

    private static void introducirDatos(Scanner scanner) {
        System.out.println("¿Qué datos quieres cambiar?");
        System.out.println("1.- Nombre");
        System.out.println("2.- Teléfono");
        System.out.println("3.- Dirección");
        System.out.println("4.- Los tres datos");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.println("Introduce el nombre:");
                contactoActivo.setNombre(scanner.nextLine());
                break;
            case 2:
                System.out.println("Introduce el teléfono:");
                contactoActivo.setTelefono(scanner.nextLine());
                break;
            case 3:
                System.out.println("Introduce la dirección:");
                contactoActivo.setDireccion(scanner.nextLine());
                break;
            case 4:
                System.out.println("Introduce el nombre:");
                contactoActivo.setNombre(scanner.nextLine());
                System.out.println("Introduce el teléfono:");
                contactoActivo.setTelefono(scanner.nextLine());
                System.out.println("Introduce la dirección:");
                contactoActivo.setDireccion(scanner.nextLine());
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void consultarDatos(Scanner scanner) {
        System.out.println("¿Qué datos quieres consultar?");
        System.out.println("1.- Nombre");
        System.out.println("2.- Teléfono");
        System.out.println("3.- Dirección");
        System.out.println("4.- Todos los datos");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.println("Nombre: " + contactoActivo.getNombre());
                break;
            case 2:
                System.out.println("Teléfono: " + contactoActivo.getTelefono());
                break;
            case 3:
                System.out.println("Dirección: " + contactoActivo.getDireccion());
                break;
            case 4:
                System.out.println(contactoActivo);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void escribirContactoEnFichero(Scanner scanner) {
        System.out.println("¿Quieres añadir el contacto al final (1) o sobrescribir (2)?");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        try (FileWriter fw = new FileWriter("agenda.txt", opcion == 1); PrintWriter pw = new PrintWriter(fw)) {
            pw.println(contactoActivo.getNombre() + "," + contactoActivo.getTelefono() + "," + contactoActivo.getDireccion());
            System.out.println("Contacto guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el contacto: " + e.getMessage());
        }
    }

    private static void leerContactoDesdeFichero(Scanner scanner) {
        System.out.println("Introduce el índice del contacto (comienza desde 0):");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        try (BufferedReader br = new BufferedReader(new FileReader("agenda.txt"))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                if (contador == indice) {
                    String[] datos = linea.split(",");
                    contactoActivo.setNombre(datos[0]);
                    contactoActivo.setTelefono(datos[1]);
                    contactoActivo.setDireccion(datos[2]);
                    System.out.println("Contacto leído: " + contactoActivo);
                    return;
                }
                contador++;
            }
            System.out.println("Contacto no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el contacto: " + e.getMessage());
        }
    }
}
