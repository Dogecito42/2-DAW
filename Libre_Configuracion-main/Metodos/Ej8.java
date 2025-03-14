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
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar un número al usuario
            System.out.print("Ingrese un número de tipo double (o -1 para salir): ");
            double numero = scanner.nextDouble();

            // Finalizar el programa si el usuario ingresa -1
            if (numero == -1) {
                break;
            }

            // Mostrar los resultados de los redondeos
            System.out.printf("Número original: %.6f\n", numero);
            System.out.printf("Redondeado al entero más cercano: %.0f\n", redondearAInteger(numero));
            System.out.printf("Redondeado a la décima más cercana: %.1f\n", redondearADecimas(numero));
            System.out.printf("Redondeado a la centésima más cercana: %.2f\n", redondearACentesimas(numero));
            System.out.printf("Redondeado a la milésima más cercana: %.3f\n", redondearAMilesimas(numero));
            System.out.println();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    // Método para redondear al entero más cercano
    public static double redondearAInteger(double numero) {
        return Math.floor(numero + 0.5);
    }

    // Método para redondear a la décima más cercana
    public static double redondearADecimas(double numero) {
        return Math.floor(numero * 10 + 0.5) / 10;
    }

    // Método para redondear a la centésima más cercana
    public static double redondearACentesimas(double numero) {
        return Math.floor(numero * 100 + 0.5) / 100;
    }

    // Método para redondear a la milésima más cercana
    public static double redondearAMilesimas(double numero) {
        return Math.floor(numero * 1000 + 0.5) / 1000;
    }
    
}
