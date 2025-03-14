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
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los tres números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        // Llamar al método minimo3 para obtener el valor mínimo
        double minimo = minimo3(num1, num2, num3);

        // Mostrar el resultado
        System.out.println("El menor de los tres números es: " + minimo);

        scanner.close();
    }

    // Método que devuelve el menor de tres números de punto flotante
    public static double minimo3(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
    
}
