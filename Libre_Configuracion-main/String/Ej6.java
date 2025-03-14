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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int pos=0, cont=0;
        String s1,s2="";
        char c1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Indique una cadena y luego el caracter que quiere ver el numero de ocurrencias");
        s1=sc.nextLine();
        System.out.println("Ahora el caracter");
        c1=sc.next().charAt(0);
        
        do{
            if(s1.indexOf(c1,pos)!=-1){
                pos=s1.indexOf(c1,pos-1);
                cont++;
                s2=s2+s1.charAt(pos);
                System.out.println(pos);
            }
            
        }while(s1.indexOf(c1, pos-1 )==-1);
        
        System.out.println(s2+" "+c1);
    }
    
}
