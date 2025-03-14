/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej3;

public class Pila implements ColeccionInterfaz {
    private Object[] elementos;  // Array para almacenar los elementos de la pila.
    private int contador;        // Contador para llevar el registro de la cantidad de elementos en la pila.

    // Constructor: Inicializa la pila con un tamaño determinado
    public Pila(int capacidad) {
        elementos = new Object[capacidad];
        contador = 0;
    }

    // Implementación del método estaVacia()
    @Override
    public boolean estaVacia() {
        return contador == 0;
    }

    // Implementación del método extraer()
    @Override
    public Object extraer() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No se puede extraer.");
            return null;
        }
        Object elemento = elementos[contador - 1];  // Tomamos el último elemento de la pila.
        elementos[contador - 1] = null;  // Lo eliminamos de la pila.
        contador--;  // Decrementamos el contador.
        return elemento;
    }

    // Implementación del método primero()
    @Override
    public Object primero() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No hay un primer elemento.");
            return null;
        }
        return elementos[contador - 1];  // Devuelve el último elemento añadido (en una pila, el primero es el último añadido).
    }

    // Implementación del método añadir()
    @Override
    public boolean añadir(Object obj) {
        if (contador >= elementos.length) {
            System.out.println("La pila está llena. No se puede añadir el elemento.");
            return false;
        }
        elementos[contador] = obj;  // Añadimos el nuevo elemento al final de la pila.
        contador++;  // Incrementamos el contador.
        return true;
    }
}
