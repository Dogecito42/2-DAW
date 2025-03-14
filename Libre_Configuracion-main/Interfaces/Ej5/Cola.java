/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej5;

import java.util.LinkedList;

public class Cola implements ColeccionInterfaz {
    private LinkedList<Object> cola; // Lista enlazada para almacenar los elementos

    // Constructor que inicializa la cola
    public Cola() {
        cola = new LinkedList<>();
    }

    // Método para comprobar si la cola está vacía
    @Override
    public boolean estaVacia() {
        return cola.isEmpty();
    }

    // Método para extraer y devolver el primer elemento de la cola
    @Override
    public Object extraer() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        return cola.removeFirst(); // Elimina y devuelve el primer elemento
    }

    // Método para devolver el primer elemento de la cola sin eliminarlo
    @Override
    public Object primero() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        return cola.getFirst(); // Devuelve el primer elemento sin eliminarlo
    }

    // Método para añadir un objeto a la cola
    @Override
    public boolean añadir(Object objeto) {
        return cola.add(objeto); // Añade el objeto al final de la cola
    }
}

