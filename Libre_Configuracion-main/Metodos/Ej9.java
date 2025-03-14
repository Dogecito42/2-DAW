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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores de base y exponente al usuario
        System.out.print("Ingrese la base (entero): ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        // Validar que el exponente sea positivo
        if (exponente <= 0) {
            System.out.println("El exponente debe ser un entero positivo.");
        } else {
            // Cálculo usando el método iterativo
            int resultadoIterativo = enteroPotencia(base, exponente);
            System.out.printf("Resultado (iterativo): %d^%d = %d\n", base, exponente, resultadoIterativo);

            // Cálculo usando el método recursivo
            int resultadoRecursivo = enteroPotenciaRecursivo(base, exponente);
            System.out.printf("Resultado (recursivo): %d^%d = %d\n", base, exponente, resultadoRecursivo);
        }

        scanner.close();
    }

    /**
     * Método iterativo para calcular la potencia de un número.
     * @param base La base de la potencia.
     * @param exponente El exponente (entero positivo).
     * @return El resultado de base elevado a exponente.
     */
    public static int enteroPotencia(int base, int exponente) {
        int resultado = 1;

        // Multiplicar base por sí misma exponente veces
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    /**
     * Método recursivo para calcular la potencia de un número.
     * @param base La base de la potencia.
     * @param exponente El exponente (entero positivo).
     * @return El resultado de base elevado a exponente.
     */
    public static int enteroPotenciaRecursivo(int base, int exponente) {
        // Caso base: cualquier número elevado a 1 es sí mismo
        if (exponente == 1) {
            return base;
        }

        // Caso general: base * (base^(exponente - 1))
        return base * enteroPotenciaRecursivo(base, exponente - 1);
    }
    
}
