/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean[] asientos = new boolean[10]; 

        while (true) { 
            System.out.println("Por favor escriba 1 para Primera Clase o 2 para Económico:");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
               
                if (!asignarAsiento(asientos, 0, 4)) {
                   
                    System.out.println("Primera clase está llena. ¿Desea ser colocado en clase económica? (1 = Sí, 2 = No):");
                    int respuesta = scanner.nextInt();
                    if (respuesta == 1) {
                        if (!asignarAsiento(asientos, 5, 9)) {
                            System.out.println("Económico también está lleno. El próximo vuelo sale en 3 horas.");
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                    }
                }
            } else if (opcion == 2) {
               
                if (!asignarAsiento(asientos, 5, 9)) {
                   
                    System.out.println("Económico está lleno. ¿Desea ser colocado en primera clase? (1 = Sí, 2 = No):");
                    int respuesta = scanner.nextInt();
                    if (respuesta == 1) {
                        if (!asignarAsiento(asientos, 0, 4)) {
                            System.out.println("Primera clase también está llena. El próximo vuelo sale en 3 horas.");
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                    }
                }
            } else {
                System.out.println("Opción inválida. Por favor escriba 1 para Primera Clase o 2 para Económico.");
            }
        }
    }

   
    private static boolean asignarAsiento(boolean[] asientos, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (!asientos[i]) { 
                asientos[i] = true; 
                String clase = (inicio == 0) ? "Primera Clase" : "Clase Económica";
                System.out.printf("Su asiento es el #%d en %s.%n", i + 1, clase);
                return true;
            }
        }
        return false; 
    }
    
}
