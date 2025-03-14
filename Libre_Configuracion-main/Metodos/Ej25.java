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
public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Variables para contar respuestas correctas e incorrectas
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        int totalRespuestas = 0;

        // Llamada inicial al método para generar la primera pregunta
        hacerPregunta(scanner, random, respuestasCorrectas, respuestasIncorrectas, totalRespuestas);
        
        scanner.close();
    }
    
    // Método para generar y hacer una pregunta de multiplicación
    public static void hacerPregunta(Scanner scanner, Random random, int respuestasCorrectas, int respuestasIncorrectas, int totalRespuestas) {
        // Generar dos números aleatorios entre 0 y 9
        int num1 = random.nextInt(9) + 1;  // Números de 1 a 9
        int num2 = random.nextInt(9) + 1;  // Números de 1 a 9
        
        int respuestaCorrecta = num1 * num2;
        int respuestaEstudiante;
        
        // Hacer la pregunta al estudiante
        System.out.printf("¿Cuánto es %d por %d? ", num1, num2);
        
        // Leer la respuesta del estudiante
        while (true) {
            respuestaEstudiante = scanner.nextInt();
            
            // Verificar si la respuesta es correcta
            if (respuestaEstudiante == respuestaCorrecta) {
                // Respuesta correcta, elige aleatoriamente un comentario
                int numeroAleatorio = random.nextInt(4) + 1; // Generar un número entre 1 y 4
                
                // Usar un switch para elegir la respuesta adecuada
                switch (numeroAleatorio) {
                    case 1:
                        System.out.println("¡Muy bien!");
                        break;
                    case 2:
                        System.out.println("¡Excelente!");
                        break;
                    case 3:
                        System.out.println("¡Buen trabajo!");
                        break;
                    case 4:
                        System.out.println("¡Sigue así!");
                        break;
                }
                
                // Aumentamos el contador de respuestas correctas
                respuestasCorrectas++;
            } else {
                // Respuesta incorrecta, elige aleatoriamente un comentario
                int numeroAleatorio = random.nextInt(4) + 1; // Generar un número entre 1 y 4
                
                // Usar un switch para elegir la respuesta adecuada
                switch (numeroAleatorio) {
                    case 1:
                        System.out.println("No. Por favor, intenta de nuevo.");
                        break;
                    case 2:
                        System.out.println("Incorrecto. Intenta una vez más.");
                        break;
                    case 3:
                        System.out.println("No te rindas!");
                        break;
                    case 4:
                        System.out.println("No. Sigue intentando.");
                        break;
                }
                
                // Aumentamos el contador de respuestas incorrectas
                respuestasIncorrectas++;
            }
            
            // Aumentar el total de respuestas
            totalRespuestas++;
            
            // Si hemos hecho 10 preguntas, calculamos el porcentaje y mostramos el resultado
            if (totalRespuestas == 10) {
                double porcentajeCorrectas = (double) respuestasCorrectas / totalRespuestas * 100;
                System.out.printf("Porcentaje de respuestas correctas: %.2f%%\n", porcentajeCorrectas);
                
                if (porcentajeCorrectas < 75) {
                    System.out.println("Por favor, pida ayuda adicional a su instructor.");
                    System.out.println("Reiniciando el programa...");
                    main(new String[0]); // Reiniciar el programa para otro estudiante
                } else {
                    System.out.println("¡Excelente trabajo!");
                }
                break;  // Terminar el programa después de 10 preguntas
            }
        }
        
        // Después de una respuesta correcta, hacer otra pregunta
        hacerPregunta(scanner, random, respuestasCorrectas, respuestasIncorrectas, totalRespuestas);
    }
    
}
