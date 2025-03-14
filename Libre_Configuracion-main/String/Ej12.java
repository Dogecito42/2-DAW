/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique una frase y mostrar");
        frase=sc.nextLine();
        char[] abecedario = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        int[] oc=new int[abecedario.length];
        for (int i=0; i<frase.length(); i++){
            for (int j=0; j<abecedario.length; j++){
                if (abecedario[j]==frase.charAt(i)){
                    oc[j]++;
                }
            }
        }
        
        for (int i=0; i<oc.length; i++){
            System.out.println("Letra "+abecedario[i]+": "+oc[i]+" ocurrencias");
        }
    }
    
}
