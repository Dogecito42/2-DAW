/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] numerosUnicos = new int[5]; // Array para almacenar valores únicos (máximo 5)
        int cantidadUnicos = 0; // Contador para la cantidad de números únicos ingresados

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entre 10 y 100: ");
            int numero = scanner.nextInt();

            // Validar si el número está en el rango requerido
            if (numero < 10 || numero > 100) {
                System.out.println("Número fuera de rango. Intente nuevamente.");
                i--; // Decrementar i para repetir la entrada
                continue;
            }

            // Verificar si el número es duplicado
            boolean esDuplicado = false;
            for (int j = 0; j < cantidadUnicos; j++) {
                if (numerosUnicos[j] == numero) {
                    esDuplicado = true;
                    break;
                }
            }

            // Agregar el número si no es duplicado
            if (!esDuplicado) {
                numerosUnicos[cantidadUnicos] = numero;
                cantidadUnicos++;
                System.out.println("Número único ingresado: " + numero);
            } else {
                System.out.println("Número duplicado, no se agregará.");
            }

            // Mostrar el conjunto de valores únicos ingresados hasta el momento
            System.out.print("Valores únicos ingresados: ");
            for (int j = 0; j < cantidadUnicos; j++) {
                System.out.print(numerosUnicos[j] + " ");
            }
            System.out.println();
        }

    }
}
