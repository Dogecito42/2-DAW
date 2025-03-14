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
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugarDeNuevo = true;
        
        // Bucle para permitir jugar varias veces
        while (jugarDeNuevo) {
            // Generar el número aleatorio entre 1 y 1000
            int numeroSecreto = random.nextInt(1000) + 1;
            int intento;
            boolean adivinado = false;
            
            System.out.println("¡Bienvenido al juego de Adivina el número!");
            System.out.println("Adivina un número entre 1 y 1000.");
            
            // Bucle para adivinar el número
            while (!adivinado) {
                System.out.print("Introduce tu intento: ");
                intento = scanner.nextInt();
                
                // Comparar el intento con el número secreto
                if (intento < numeroSecreto) {
                    System.out.println("Demasiado bajo. Intente de nuevo.");
                } else if (intento > numeroSecreto) {
                    System.out.println("Demasiado alto. Intente de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Adivinó el número.");
                    adivinado = true; // El número fue adivinado
                }
            }
            
            // Preguntar si el jugador quiere jugar otra vez
            System.out.print("¿Quieres jugar otra vez? (sí/no): ");
            String respuesta = scanner.next();
            
            if (respuesta.equalsIgnoreCase("no")) {
                jugarDeNuevo = false; // Si la respuesta es "no", se termina el juego
                System.out.println("¡Gracias por jugar! Hasta luego.");
            }
        }
        
    }
    
}
