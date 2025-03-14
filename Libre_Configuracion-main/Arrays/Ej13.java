/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] ventas = new int[3][5];
        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                ventas[fila][col] = 0; 
                System.out.printf("ventas[%d][%d] establecido en cero.%n", fila, col);
            }
        }
    }

}
