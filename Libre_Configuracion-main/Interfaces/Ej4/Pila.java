/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej4;

public class Pila implements ColeccionInterfaz {
    private Object[] pila;  // Array para almacenar los elementos de la pila
    private int contador;   // Contador para llevar la cuenta de los elementos

    // Constructor que recibe el tamaño máximo de la pila
    public Pila(int capacidad) {
        pila = new Object[capacidad];
        contador = 0;
    }

    // Método para comprobar si la pila está vacía
    @Override
    public boolean estaVacia() {
        return contador == 0;
    }

    // Método para extraer un elemento de la pila
    @Override
    public Object extraer() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        Object elemento = pila[contador - 1];
        pila[contador - 1] = null;  // Elimina el objeto extraído
        contador--;
        return elemento;
    }

    // Método para devolver el primer elemento de la pila sin eliminarlo
    @Override
    public Object primero() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return pila[contador - 1];
    }

    // Método para añadir un objeto a la pila
    @Override
    public boolean añadir(Object objeto) {
        if (contador < pila.length) {
            pila[contador] = objeto;
            contador++;
            return true;
        }
        System.out.println("La pila está llena.");
        return false;
    }
}
