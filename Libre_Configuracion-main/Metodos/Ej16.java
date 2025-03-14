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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Parte (a) y (b): Solicitar los números a y b
        System.out.print("Ingrese el valor de a (entero): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el valor de b (entero): ");
        int b = scanner.nextInt();

        // Parte (a): Calcular la parte entera del cociente
        int cociente = calcularCociente(a, b);
        System.out.println("Parte entera del cociente de " + a + " dividido entre " + b + ": " + cociente);

        // Parte (b): Calcular el residuo
        int residuo = calcularResiduo(a, b);
        System.out.println("Residuo de " + a + " dividido entre " + b + ": " + residuo);

        // Parte (c) y (d): Solicitar un número para mostrar sus dígitos
        System.out.print("Ingrese un número entre 1 y 99999 para mostrar sus dígitos: ");
        int numero = scanner.nextInt();

        // Llamar al método mostrarDigitos para mostrar el número con el formato adecuado
        mostrarDigitos(numero);

        scanner.close();
    }

    // Método para calcular la parte entera del cociente
    public static int calcularCociente(int a, int b) {
        return a / b; // La división entera da la parte entera del cociente
    }

    // Método para calcular el residuo
    public static int calcularResiduo(int a, int b) {
        return a % b; // El operador % devuelve el residuo de la división
    }

    // Método que muestra los dígitos de un número separándolos por dos espacios
    public static void mostrarDigitos(int numero) {
        // Validar que el número esté en el rango correcto
        if (numero < 1 || numero > 99999) {
            System.out.println("Por favor, ingrese un número entre 1 y 99999.");
            return;
        }

        // Convertir el número a una cadena para acceder a cada dígito
        String numStr = Integer.toString(numero);

        // Imprimir cada dígito con dos espacios entre ellos
        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i)); // Imprime el dígito
            if (i < numStr.length() - 1) {
                System.out.print("  "); // Añadir dos espacios si no es el último dígito
            }
        }
        System.out.println(); // Salto de línea al final
    }
    
}
