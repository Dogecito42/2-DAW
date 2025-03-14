/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej5;

public class PruebaCola {

    // Método para rellenar la cola con los números del 1 al 5
    public static void rellenar(ColeccionInterfaz coleccion) {
        for (int i = 1; i <= 5; i++) {
            coleccion.añadir(i);  // Añade los números del 1 al 5
        }
    }

    // Método para imprimir y vaciar la cola
    public static void imprimirYVaciar(ColeccionInterfaz coleccion) {
        while (!coleccion.estaVacia()) {
            System.out.println(coleccion.extraer());  // Extrae e imprime el primer elemento
        }
    }

    public static void main(String[] args) {
        // Crear una cola
        Cola cola = new Cola();

        // Rellenar la cola con los números del 1 al 5
        rellenar(cola);

        // Imprimir y vaciar la cola
        System.out.println("Imprimiendo y vaciando la cola:");
        imprimirYVaciar(cola);
    }
}

