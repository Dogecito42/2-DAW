/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

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
        int limite = 100;
        boolean[] esPrimo = new boolean[limite + 1]; 
        for (int i = 2; i <= limite; i++) {
            esPrimo[i] = true; 
        }

        for (int i = 2; i * i <= limite; i++) {
            if (esPrimo[i]) {
              
                for (int j = i * i; j <= limite; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        System.out.println("Números primos hasta " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }
    }
    
}
