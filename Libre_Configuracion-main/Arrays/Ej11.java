/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           // a) Asignar cero a los 10 elementos del array cuentas de tipo entero
        int[] cuentas = new int[10];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
        }
        
        // b) Sumar uno a cada uno de los 15 elementos del array bono de tipo entero
        int[] bono = new int[15];
        for (int i = 0; i < bono.length; i++) {
            bono[i] += 1;
        }

        // c) Imprimir los cinco valores del array mejoresPuntuaciones de tipo entero en formato de columnas
        int[] mejoresPuntuaciones = {85, 90, 78, 92, 88};
        System.out.println("Mejores Puntuaciones:");
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.printf("%d\t", mejoresPuntuaciones[i]);
        }
        System.out.println();
    }
    
}
