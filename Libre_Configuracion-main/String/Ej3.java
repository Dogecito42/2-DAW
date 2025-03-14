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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica un texto para compararlo con otro. El programa dirá si es mayor, menor o igual, que el segundo texto");
        String s1=sc.nextLine();
        System.out.println("Ahora indique el segundo texto");
        String s2=sc.nextLine();
        
        if (s1.length()>s2.length()){
            System.out.println(s1+" es posee más carácteres que "+s2);
        }else if (s1.length()<s2.length()){
            System.out.println(s1+" es posee menos carácteres que "+s2);

        }else{
            
        }
    }
    
}
