/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario elegir la opción
        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir de Fahrenheit a Centígrados");
        System.out.println("2. Convertir de Centígrados a Fahrenheit");
        int opcion = scanner.nextInt();

        // Procesar según la opción elegida
        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double centigrados = fahrenheitACentigrados(fahrenheit);
            System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + centigrados + " grados Centígrados.");
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Centígrados: ");
            double centigrados = scanner.nextDouble();
            double fahrenheit = centigradosAFahrenheit(centigrados);
            System.out.println(centigrados + " grados Centígrados equivalen a " + fahrenheit + " grados Fahrenheit.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    // Método para convertir de Fahrenheit a Centígrados
    public static double fahrenheitACentigrados(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Método para convertir de Centígrados a Fahrenheit
    public static double centigradosAFahrenheit(double centigrados) {
        return 9.0 / 5.0 * centigrados + 32;
    }
    }
