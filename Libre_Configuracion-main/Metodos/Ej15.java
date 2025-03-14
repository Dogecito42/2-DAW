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
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular e imprimir el área del círculo utilizando el método circuloArea
        double area = circuloArea(radio);
        System.out.printf("El área del círculo con radio %.2f es: %.2f\n", radio, area);

        scanner.close();
    }

    /**
     * Método que calcula el área de un círculo dado su radio.
     * @param radio El radio del círculo.
     * @return El área del círculo.
     */
    public static double circuloArea(double radio) {
        // Fórmula para el área de un círculo: área = π * radio^2
        return Math.PI * Math.pow(radio, 2);
    }
    
}
