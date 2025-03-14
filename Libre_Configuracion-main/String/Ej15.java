/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String cheque="";
        System.out.print("Ingrese la cantidad del cheque: ");
        double cantidad = sc.nextDouble();
        
        DecimalFormat formatoCheque = new DecimalFormat("#0.00");
        String cantidadFormateada = formatoCheque.format(cantidad);
        
        int totalEspacios = 9;
        int longitudCantidad = cantidadFormateada.length();
        
        int asteriscosNecesarios = totalEspacios - longitudCantidad;
        
        for (int i = 0; i < asteriscosNecesarios; i++) {
            cheque=cheque+"*";
        }
        cheque=cheque+cantidadFormateada;

        System.out.println("Cantidad en el cheque: " + cheque);
        
        sc.close();
        
    }
    
}
