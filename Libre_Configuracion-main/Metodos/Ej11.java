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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determinar si el segundo número es múltiplo del primero.");
        System.out.println("Ingrese una serie de pares de enteros (para terminar, ingrese 0 como primer número).");

        while (true) {
            // Solicitar el primer número
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            // Si el primer número es 0, salir del bucle
            if (num1 == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Solicitar el segundo número
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            // Determinar si el segundo número es múltiplo del primero
            boolean esMultiplo = multiplo(num1, num2);

            // Mostrar resultado
            if (esMultiplo) {
                System.out.printf("%d es múltiplo de %d.\n", num2, num1);
            } else {
                System.out.printf("%d no es múltiplo de %d.\n", num2, num1);
            }
        }

        scanner.close();
    }

    /**
     * Método que determina si el segundo número es múltiplo del primero.
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return true si num2 es múltiplo de num1, false en caso contrario.
     */
    public static boolean multiplo(int num1, int num2) {
        // Un número es múltiplo si el residuo de la división es 0
        return num2 % num1 == 0;
        
    }
    
}
