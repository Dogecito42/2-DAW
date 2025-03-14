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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Leer los lados de los triángulos proporcionados y calcular la hipotenusa
        System.out.println("Cálculo de la hipotenusa para varios triángulos:");

        double[][] triangulos = {
            {0, 0},    // Triángulo 1
            {0, 12.0}, // Triángulo 2
            {8.0, 15.0} // Triángulo 3
        };

        for (int i = 0; i < triangulos.length; i++) {
            double lado1 = triangulos[i][0];
            double lado2 = triangulos[i][1];
            double resultado = hipotenusa(lado1, lado2);

            System.out.printf("Triángulo %d: Lado1 = %.2f, Lado2 = %.2f, Hipotenusa = %.2f\n", i + 1, lado1, lado2, resultado);
        }

        // Leer valores personalizados desde el usuario
        System.out.println("\nCálculo personalizado:");
        System.out.print("Ingrese la longitud del Lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del Lado 2: ");
        double lado2 = scanner.nextDouble();

        double hipotenusaCalculada = hipotenusa(lado1, lado2);
        System.out.printf("Para Lado1 = %.2f y Lado2 = %.2f, la hipotenusa es %.2f\n", lado1, lado2, hipotenusaCalculada);

        scanner.close();
    }

    /**
     * Método para calcular la hipotenusa de un triángulo rectángulo.
     * Utiliza el teorema de Pitágoras: hipotenusa = √(lado1² + lado2²)
     *
     * @param lado1 Longitud del primer lado.
     * @param lado2 Longitud del segundo lado.
     * @return La longitud de la hipotenusa.
     */
    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }
    
}
