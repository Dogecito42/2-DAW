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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Determinar si un número es par o impar.");
        System.out.println("Ingrese una secuencia de enteros (para terminar, ingrese 0).");

        while (true) {
            // Solicitar un número entero
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            // Si el número es 0, salir del bucle
            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Verificar si el número es par o impar
            boolean esPar = esPar(numero);

            // Mostrar el resultado
            if (esPar) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        }

        scanner.close();
    }

    /**
     * Método que determina si un número es par.
     * @param numero El número a verificar.
     * @return true si el número es par, false en caso contrario.
     */
    public static boolean esPar(int numero) {
        // Un número es par si el residuo de dividirlo entre 2 es 0
        return numero % 2 == 0;
    }
    
}
