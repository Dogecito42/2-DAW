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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                char[] letras = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', ':', ';', ' '
        };

        String[] morseCodigo = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", 
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
            ".-.-.-", "--..--", "---...", "-.-.-.", "   " 
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir texto a Morse");
        System.out.println("2. Convertir Morse a texto");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {

            System.out.print("Ingrese el texto en español: ");
            String texto = sc.nextLine().toUpperCase();
            StringBuilder morse = new StringBuilder();

            for (char c : texto.toCharArray()) {
                boolean encontrado = false;
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] == c) {
                        morse.append(morseCodigo[i]).append(" ");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Carácter no reconocido: " + c);
                }
            }
            System.out.println("Texto en Morse: " + morse.toString().trim());

        } else if (opcion == 2) {
            System.out.print("Ingrese el texto en Morse: ");
            String morseTexto = sc.nextLine();
            StringBuilder texto = new StringBuilder();

            String[] palabrasMorse = morseTexto.split(" {3}"); 

            for (String palabraMorse : palabrasMorse) {
                String[] letrasMorse = palabraMorse.split(" "); 
                for (String letraMorse : letrasMorse) {
                    boolean encontrado = false;
                    for (int i = 0; i < morseCodigo.length; i++) {
                        if (morseCodigo[i].equals(letraMorse)) {
                            texto.append(letras[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Código Morse no reconocido: " + letraMorse);
                    }
                }
                texto.append(" "); 
            }
            System.out.println("Texto en español: " + texto.toString().trim());

        } else {
            System.out.println("Opción no válida.");
        }
    }
    
}
