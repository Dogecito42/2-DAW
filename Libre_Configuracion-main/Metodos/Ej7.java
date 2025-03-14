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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar al usuario un número
            System.out.print("Ingrese un número de tipo double (o -1 para salir): ");
            double numero = scanner.nextDouble();

            // Finalizar el programa si el usuario ingresa -1
            if (numero == -1) {
                break;
            }

            // Redondear el número usando Math.floor
            double redondeado = Math.floor(numero + 0.5);

            // Mostrar el número original y el redondeado
            System.out.printf("Número original: %.2f, Número redondeado: %.0f\n", numero, redondeado);
        }

        System.out.println("Programa finalizado.");
        scanner.close();    }
    
}
