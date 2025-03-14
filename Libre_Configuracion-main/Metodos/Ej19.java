/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author Usuario
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Mostrar los números perfectos entre 1 y 1000
        System.out.println("Números perfectos entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (perfecto(i)) {
                System.out.println("Número perfecto encontrado: " + i);
                System.out.print("Factores: ");
                mostrarFactores(i);
                System.out.println(); // Línea en blanco para separar
            }
        }
    }

    // Método para determinar si un número es perfecto
    public static boolean perfecto(int numero) {
        int sumaDeFactores = 0;

        // Calcular la suma de los factores de numero (excluyendo el número mismo)
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) { // Si i es un divisor de numero
                sumaDeFactores += i;
            }
        }

        // Verificar si la suma de los factores es igual al número
        return sumaDeFactores == numero;
    }

    // Método para mostrar los factores de un número
    public static void mostrarFactores(int numero) {
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
    }
    
    }
}
