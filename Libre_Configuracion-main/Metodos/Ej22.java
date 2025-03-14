/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int cara = 0;  // Contador para caras
        int cruz = 0;  // Contador para cruces
        boolean continuar = true;
        
        while (continuar) {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Lanzar moneda");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Lanzar moneda y contar el resultado
                    if (tirar(random)) {
                        cruz++;  // Si tira "true", es cruz
                        System.out.println("Resultado: Cruz");
                    } else {
                        cara++;  // Si tira "false", es cara
                        System.out.println("Resultado: Cara");
                    }
                    break;
                case 2:
                    continuar = false;  // Salir del programa
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            
            // Mostrar los resultados actuales
            System.out.println("Resultados actuales:");
            System.out.println("Cara: " + cara);
            System.out.println("Cruz: " + cruz);
        }
        
        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }

    // Método que simula el lanzamiento de la moneda
    public static boolean tirar(Random random) {
        // Generar un número aleatorio entre 0 y 1
        // Si el número es 1, es cruz (true), si es 0 es cara (false)
        return random.nextInt(2) == 1;
    }
    
}
