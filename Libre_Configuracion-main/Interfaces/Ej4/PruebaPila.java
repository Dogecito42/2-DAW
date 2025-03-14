/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej4;

import Interfaces.Ej3.ColeccionInterfaz;
import Interfaces.Ej3.Pila;

public class PruebaPila {

    // Método rellenar: Añade los números del 1 al 10 a la colección
    public static void rellenar(ColeccionInterfaz coleccion) {
        for (int i = 1; i <= 10; i++) {
            coleccion.añadir(i);  // Añade los números del 1 al 10
        }
    }

    // Método imprimirYVaciar: Extrae e imprime los elementos hasta que la colección esté vacía
    public static void imprimirYVaciar(ColeccionInterfaz coleccion) {
        while (!coleccion.estaVacia()) {
            System.out.println(coleccion.extraer());  // Extrae e imprime el primer elemento
        }
    }

    public static void main(String[] args) {
        // Crear una pila con capacidad para 10 elementos
        Pila pila = new Pila(10);

        // Rellenar la pila con los números del 1 al 10
        rellenar(pila);

        // Imprimir y vaciar la pila
        System.out.println("Imprimiendo y vaciando la pila:");
        imprimirYVaciar(pila);
    }
}
