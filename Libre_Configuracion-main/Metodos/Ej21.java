/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        Scanner scanner = new Scanner(System.in);
        
        // Leer un número entero del usuario
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Llamar al método para invertir los dígitos de forma iterativa
        int resultado = invertirNumeroIterativo(numero);
        
        // Mostrar el número invertido
        System.out.println("Número invertido (iterativo): " + resultado);
        
        // Llamar al método recursivo para invertir los dígitos
        resultado = invertirNumeroRecursivo(numero);
        
        // Mostrar el número invertido recursivamente
        System.out.println("Número invertido (recursivo): " + resultado);
        
        scanner.close();
    }

    // Método iterativo para invertir los dígitos de un número
    public static int invertirNumeroIterativo(int numero) {
        int invertido = 0;
        
        while (numero != 0) {
            // Extraer el último dígito
            int digito = numero % 10;
            // Agregarlo al número invertido
            invertido = invertido * 10 + digito;
            // Eliminar el último dígito del número original
            numero /= 10;
        }
        
        return invertido;
    }

    // Método recursivo para invertir los dígitos de un número
    public static int invertirNumeroRecursivo(int numero) {
        return invertirNumeroRecursivoHelper(numero, 0);
    }

    // Método auxiliar recursivo
    private static int invertirNumeroRecursivoHelper(int numero, int invertido) {
        if (numero == 0) {
            return invertido;
        }
        
        // Extraer el último dígito y agregarlo al número invertido
        int digito = numero % 10;
        invertido = invertido * 10 + digito;
        
        // Llamada recursiva con el número reducido
        return invertirNumeroRecursivoHelper(numero / 10, invertido);
    }
    
}
