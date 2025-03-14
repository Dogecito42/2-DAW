/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej2;

public class Principal {
    public static void main(String[] args) {
        // Arrays de ejemplo
        int[] enteros = {3, 5, 7, 2, 8};
        double[] reales = {3.5, 5.1, 7.2, 2.8, 8.9};
        
        // Crear objeto de la clase Math3
        Math3 math3 = new Math3();
        
        // Encontrar y mostrar el valor mínimo y máximo de un array de enteros
        System.out.println("Mínimo de enteros: " + math3.min(enteros));
        System.out.println("Máximo de enteros: " + math3.max(enteros));
        
        // Encontrar y mostrar el valor mínimo y máximo de un array de doubles
        System.out.println("Mínimo de reales: " + math3.min(reales));
        System.out.println("Máximo de reales: " + math3.max(reales));
    }
}

