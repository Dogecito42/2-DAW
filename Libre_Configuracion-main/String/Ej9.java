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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cod;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un codigo ascii para imprimir su caracter");

        cod=sc.nextInt();
        
        System.out.println((char)cod);
    }
    
}
