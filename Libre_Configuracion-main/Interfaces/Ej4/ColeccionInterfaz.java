/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej4;

/**
 *
 * @author Usuario
 */

public interface ColeccionInterfaz {
    boolean estaVacia();       // Devuelve true si la colección está vacía
    Object extraer();          // Devuelve y elimina el primer elemento
    Object primero();          // Devuelve el primer elemento sin eliminarlo
    boolean añadir(Object objeto); // Añade un objeto a la colección
}

