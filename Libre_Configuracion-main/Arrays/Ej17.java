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
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
        
        // Crear el array de 20x20 (piso inicializado en 0)
        int[][] piso = new int[20][20];
        
        // Variables para la tortuga
        int x = 0, y = 0;  // Posición de la tortuga
        int direccion = 0;  // Dirección de la tortuga (0 = Norte, 1 = Este, 2 = Sur, 3 = Oeste)
        boolean plumaAbajo = false;  // Estado de la pluma (false = arriba, true = abajo)

        // Comandos hasta que el usuario ingrese 9
        while (true) {
            System.out.print("Ingrese un comando: ");
            int comando = sc.nextInt();
            
            if (comando == 1) {
                plumaAbajo = false;  // Pluma arriba
            } else if (comando == 2) {
                plumaAbajo = true;   // Pluma abajo
            } else if (comando == 3) {
                direccion = (direccion + 1) % 4;  // Girar a la derecha
            } else if (comando == 4) {
                direccion = (direccion + 3) % 4;  // Girar a la izquierda
            } else if (comando == 5) {
                System.out.print("¿Cuántos espacios desea avanzar? ");
                int espacios = sc.nextInt();
                for (int i = 0; i < espacios; i++) {
                    // Mover la tortuga
                    if (direccion == 0) {
                        y = Math.max(0, y - 1);  // Norte
                    } else if (direccion == 1) {
                        x = Math.min(19, x + 1);  // Este
                    } else if (direccion == 2) {
                        y = Math.min(19, y + 1);  // Sur
                    } else if (direccion == 3) {
                        x = Math.max(0, x - 1);  // Oeste
                    }

                    // Si la pluma está abajo, marcar el piso
                    if (plumaAbajo) {
                        piso[y][x] = 1;
                    }
                }
            } else if (comando == 6) {
                // Imprimir el array de 20x20
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (piso[i][j] == 1) {
                            System.out.print("*");  // Trazo de la tortuga
                        } else {
                            System.out.print(" ");  // Espacio vacío
                        }
                    }
                    System.out.println();
                }
            } else if (comando == 9) {
                // Fin del programa
                System.out.println("Programa terminado.");
                break;
            } else {
                System.out.println("Comando no reconocido.");
            }
        }

    }
    
}
