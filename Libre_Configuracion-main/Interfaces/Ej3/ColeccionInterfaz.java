/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej3;

public interface ColeccionInterfaz {
    boolean estaVacia();      // Devuelve true si la colección está vacía, false en caso contrario.
    Object extraer();         // Devuelve y elimina el primer elemento de la colección.
    Object primero();         // Devuelve el primer elemento de la colección.
    boolean añadir(Object obj);  // Añade un objeto a la colección, devuelve true si se añadió correctamente.
}

