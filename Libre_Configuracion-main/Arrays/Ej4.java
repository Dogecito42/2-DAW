package Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int TAMANIO_ARRAY=3;
        
        int[][] array=new int[TAMANIO_ARRAY][TAMANIO_ARRAY]; //Contiene TAMANIO_ARRAY*TAMANIO_ARRAY
        
        for (int x=0; x<TAMANIO_ARRAY; x++){
            for (int e=0; e<TAMANIO_ARRAY; e++){
                array[x][e]=69;
            }
        }
    }
    
}
