/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej1;

public class Principal {
    public static void main(String[] args) {
        double[] datos = {2.5, 3.1, 7.8, 1.4, 9.0};

        ArrayReales arrayReales = new ArrayReales(datos);

        System.out.println("Valor mínimo: " + arrayReales.minimo());
        System.out.println("Valor máximo: " + arrayReales.maximo());
        System.out.println("Sumatorio: " + arrayReales.sumatorio());
    }
}

