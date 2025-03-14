package String;

import java.util.Scanner;
import java.util.Arrays;

public class Ej13 {

    public static void main(String[] args) {
        
        String frase;
        int lon = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique una frase:");
        frase = sc.nextLine();
        
        String[] array = frase.split(" ");
        
        System.out.println("Array of words: " + Arrays.toString(array));
        
        for (String palabra : array) {
            if (palabra.length() > lon) {
                lon = palabra.length();
            }
        }
        
        int[] pos = new int[lon + 1];
        
        for (String palabra : array) {
            if (palabra.length() > 0) {  
                pos[palabra.length()]++;
            }
        }
        
       
        System.out.println("Longitud de palabra\tOcurrencias");
        for (int i = 1; i <= lon; i++) {
            System.out.println(i + "\t\t\t" + pos[i]);
        }
        
    }
}

