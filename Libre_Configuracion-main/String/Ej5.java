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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1;
        char c1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce un texto y luego un caracter para buscar su posición");
        s1=sc.nextLine();
        
        System.out.println("Ahora introduce un caracter");
        c1=sc.next().charAt(0);
        
        if(s1.indexOf(c1)==-1){
            System.out.println("El caracter no está en la cadena");
        }else{
            System.out.println("El caracter "+c1+ " se encuentra en la posicion "+s1.indexOf(c1));

        }
    }
    
}
