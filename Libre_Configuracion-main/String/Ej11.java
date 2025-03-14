/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author usuario
 */

import java.util.*;
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique una frase");
        String frase=sc.nextLine();
        
        System.out.println("Ahora un caracter");
        char car=sc.next().charAt(0);
        
        System.out.println("Indexof: "+indexof(frase, car));
        System.out.println("Last Indexof: "+lastindexof(frase, car));

    }
    
   public static int indexof(String frase, char car){
       
       int pos=0;
       char[] array=frase.toCharArray();
       
       for (int i=0; i<frase.length(); i++){
           if (car==array[i] && pos==0){
               pos=i;
           }
       }
       return pos++;
   }
   public static int lastindexof(String frase, char car){
       int pos=0;
       char[] array=frase.toCharArray();
        for (int i=frase.length()-1; i>=0; i--){
           if (car==array[i] && pos==0){
               pos=i;
           }
       }
       return pos++;
}
}
