package Metodos;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del lado del cuadrado
        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        int lado = scanner.nextInt();

        // Llamar al método para mostrar el cuadrado de asteriscos
        cuadradoDeAsteriscos(lado);

        scanner.close();
    }

    /**
     * Método que imprime un cuadrado de asteriscos con el tamaño especificado por el parámetro lado.
     * @param lado El tamaño del lado del cuadrado (número de filas y columnas).
     */
    public static void cuadradoDeAsteriscos(int lado) {
        // Bucle exterior para las filas
        for (int i = 0; i < lado; i++) {
            // Bucle interior para las columnas
            for (int j = 0; j < lado; j++) {
                System.out.print("*"); // Imprime un asterisco sin salto de línea
            }
            System.out.println(); // Salto de línea al finalizar cada fila
        }
    }
}

