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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[][] ventas = new double[5][4];  // 5 productos, 4 vendedores

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las ventas totales por vendedor y producto para el último mes.");
        for (int i = 0; i < 30; i++) {
            System.out.println("\nNota de venta #" + (i + 1) + ":");

            System.out.print("Número de vendedor (1-4): ");
            int vendedor = sc.nextInt() - 1;

            System.out.print("Número de producto (1-5): ");
            int producto = sc.nextInt() - 1;

            System.out.print("Valor total de la venta en euros: ");
            double valorVenta = sc.nextDouble();

            ventas[producto][vendedor] += valorVenta;
        }

        System.out.println("\nResumen de ventas:");
        System.out.println("Producto\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal Producto");

        double totalGeneral = 0;

        for (int i = 0; i < 5; i++) {
            double totalProducto = 0;
            System.out.print("Producto " + (i + 1) + "\t");

            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t\t", ventas[i][j]);
                totalProducto += ventas[i][j];
            }

            System.out.printf("%.2f\n", totalProducto);
            totalGeneral += totalProducto;
        }

        System.out.print("Total Vendedor\t");
        double totalVendedor;
        for (int j = 0; j < 4; j++) {
            totalVendedor = 0;
            for (int i = 0; i < 5; i++) {
                totalVendedor += ventas[i][j];
                System.out.printf("%.2f\t\t", totalVendedor);
            }
            System.out.printf("%.2f\n", totalGeneral);

        }
    }
}
