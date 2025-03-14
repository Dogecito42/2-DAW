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
public class Ej28 {

   
    public static double distancia(double x1, double y1, double x2, double y2) {
        // Aplicamos la fórmula de la distancia Euclidiana
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
          // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar las coordenadas de los dos puntos
        System.out.print("Introduce las coordenadas del primer punto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Introduce las coordenadas del segundo punto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Llamar al método distancia para calcular la distancia entre los puntos
        double distancia = distancia(x1, y1, x2, y2);

        // Mostrar el resultado
        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);

    }
    
}
