/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author Usuario
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Mostrar los números primos menores que 10,000
        System.out.println("Números primos menores que 10,000:");
        for (int i = 2; i < 10000; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
        
        // Cuántos números tiene que probar para encontrar todos los números primos
        System.out.println("\nTotal de números a probar para encontrar todos los primos hasta 10,000: " + contarPrimosHasta(10000));
    }

    // Método para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true; // 2 es el único número par primo
        }
        // Verificar divisores desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por i, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }

    // Método para contar cuántos números primos hay hasta un cierto límite
    public static int contarPrimosHasta(int limite) {
        int contador = 0;
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
    
}
