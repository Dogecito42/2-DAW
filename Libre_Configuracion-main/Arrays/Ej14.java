/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] frecuenciaSumas = new int[13]; 

        System.out.print("Ingrese el número de tiradas de dados: ");
        int numeroTiradas = sc.nextInt();

        for (int i = 0; i < numeroTiradas; i++) {
            int dado1 = random.nextInt(6) + 1; 
            int dado2 = random.nextInt(6) + 1; 
            int suma = dado1 + dado2;          

            frecuenciaSumas[suma]++;

            System.out.printf("Tiro %d: Dado 1 = %d, Dado 2 = %d, Suma = %d%n", i + 1, dado1, dado2, suma);
        }

        System.out.println("\nFrecuencia de cada suma obtenida:");
        for (int suma = 2; suma <= 12; suma++) {
            System.out.printf("Suma %d: %d veces%n", suma, frecuenciaSumas[suma]);
            
            //este echale las culpas al gpt q no hace lo q pide
        }
    }
    
}
