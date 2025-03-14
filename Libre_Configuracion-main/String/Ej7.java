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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        String[] palabras=new String[99];
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto. El programa leera toda palabra que empiece por b");
        frase=sc.nextLine();
        
        palabras=frase.split(" ");
        
        for (String palabra: palabras){
        if (palabra.startsWith("b")|| palabra.startsWith("B")){
            System.out.println(palabra);
        }
    }
    }
    
}
