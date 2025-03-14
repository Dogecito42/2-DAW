/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int TAMANIO_ARRAY=10;
        double[] array=new double[TAMANIO_ARRAY];
        
        System.out.println(array[3]);
        
        array[8]=1.667;
        array[5]=3.333;
        
        for (int x=0; x<TAMANIO_ARRAY; x++){
            array[0]=array[x]+array[0];
        }
    }
    
}
