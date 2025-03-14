/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int b[]=new int[10];
        
        for (int i=0; i<=b.length /*-1*/;i++){ //La longitud devuelve el numero de posiciones cuando se declara, pero un array solo se puede recorrer de
                                        //0 a b.length-1. Se sobrepasa el array y el programa se rompe
            b[i]=1;
            
            
            int a[][]= {{1,2},{3,4}};
            
            /*a[1,1]=5; ->*/ a[1][1]=5; //Así no se acceden a las posiciones del array, corregido
        }
    }
    
}
