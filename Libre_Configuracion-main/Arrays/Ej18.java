/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NR = 8;
        int[][] tablero = new int[NR][NR];;
        String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H"};

        System.out.print("   ");

        for (int i = 0; i < NR; i++) {
            System.out.print(" " + letras[i] + "     ");
        }

        System.out.print("\n");

        for (int i = 0; i < NR; i++) {

            System.out.print((i + 1));

            for (int j = 0; j < NR; j++) {
                System.out.print("   " + tablero[i][j] + "   ");
            }

            System.out.print("\n\n");
        }
    }

}
