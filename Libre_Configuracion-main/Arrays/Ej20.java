/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Random;

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
        int tortugaPos = 1;
        int liebrePos = 1;

        Random rand = new Random();

        System.out.println("PUM!!! Y ARRANCAN!!!");

        while (tortugaPos < 70 && liebrePos < 70) {
            int movimientoTortuga = rand.nextInt(10) + 1;
            if (movimientoTortuga <= 5) {
                tortugaPos += 3;
            } else if (movimientoTortuga <= 7) {
                tortugaPos -= 6;
            } else {
                tortugaPos += 1;
            }

            int movimientoLiebre = rand.nextInt(10) + 1;
            if (movimientoLiebre <= 2) {
            } else if (movimientoLiebre <= 4) {
                liebrePos += 9;
            } else if (movimientoLiebre == 5) {
                liebrePos -= 12;
            } else if (movimientoLiebre <= 7) {
                liebrePos += 1;
            } else {
                liebrePos -= 2;
            }

            if (tortugaPos < 1) {
                tortugaPos = 1;
            }
            if (liebrePos < 1) {
                liebrePos = 1;
            }

            StringBuilder pista = new StringBuilder("------------------------------------------------------------");
            char[] pistaArray = pista.toString().toCharArray();
            if (tortugaPos == liebrePos) {
                pistaArray[tortugaPos - 1] = 'O';
                System.out.println(pistaArray);
                System.out.println("OUCH!!!");
                break;
            } else {
                pistaArray[tortugaPos - 1] = 'T';
                pistaArray[liebrePos - 1] = 'H';
            }

            if (tortugaPos >= 70) {
                System.out.println("Gana el fari");
                break;
            } else if (liebrePos >= 70) {
                System.out.println("Gana madero");
                break;
            }
        }
    }
}
