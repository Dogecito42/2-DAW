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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] rangos = new int[9];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de vendedores: ");
        int numeroVendedores = scanner.nextInt();

        for (int i = 0; i < numeroVendedores; i++) {
            System.out.print("Ingrese las ventas semanales del vendedor " + (i + 1) + ": ");
            double ventas = scanner.nextDouble();

            int salario = (int) (200 + 0.09 * ventas);

            if (salario >= 1000) {
                rangos[8]++;
            } else if (salario >= 900) {
                rangos[7]++;
            } else if (salario >= 800) {
                rangos[6]++;
            } else if (salario >= 700) {
                rangos[5]++;
            } else if (salario >= 600) {
                rangos[4]++;
            } else if (salario >= 500) {
                rangos[3]++;
            } else if (salario >= 400) {
                rangos[2]++;
            } else if (salario >= 300) {
                rangos[1]++;
            } else if (salario >= 200) {
                rangos[0]++;
            }
            System.out.println("\nDistribución de salarios:");
            System.out.println("Rango de salarios     | Número de vendedores");
            System.out.println("----------------------|----------------------");
            System.out.printf("200 - 299             | %d%n", rangos[0]);
            System.out.printf("300 - 399             | %d%n", rangos[1]);
            System.out.printf("400 - 499             | %d%n", rangos[2]);
            System.out.printf("500 - 599             | %d%n", rangos[3]);
            System.out.printf("600 - 699             | %d%n", rangos[4]);
            System.out.printf("700 - 799             | %d%n", rangos[5]);
            System.out.printf("800 - 899             | %d%n", rangos[6]);
            System.out.printf("900 - 999             | %d%n", rangos[7]);
            System.out.printf("1000 y más            | %d%n", rangos[8]);
            
            //Ponle la nota al colegaGPT
        }
    }

}
