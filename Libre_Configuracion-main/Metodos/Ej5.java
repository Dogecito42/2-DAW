/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio de la esfera
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        // Calcular el volumen llamando al método volumenEsfera
        double volumen = volumenEsfera(radio);

        // Mostrar el resultado
        System.out.printf("El volumen de la esfera con radio %.2f es: %.2f\n", radio, volumen);

        scanner.close();
    }

    /**
     * Método para calcular el volumen de una esfera.
     *
     * @param radio el radio de la esfera
     * @return el volumen de la esfera
     */
    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}
