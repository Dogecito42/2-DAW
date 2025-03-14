/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inidca un texto para que el programa lo imprima completamente en mayusculas y minisculas");
        s1=sc.nextLine();
        
        System.out.println(s1.toUpperCase()+"\n"+s1.toLowerCase());
   
    }
    
}
