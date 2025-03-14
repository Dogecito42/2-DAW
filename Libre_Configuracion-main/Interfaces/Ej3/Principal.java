/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ej3;

public class Principal {
    public static void main(String[] args) {
        // Crear una pila con capacidad para 5 elementos
        Pila pila = new Pila(5);

        // Añadir elementos a la pila
        pila.añadir("Elemento 1");
        pila.añadir("Elemento 2");
        pila.añadir("Elemento 3");

        // Mostrar el primer elemento (último añadido en la pila)
        System.out.println("Primer elemento (último añadido): " + pila.primero());

        // Extraer un elemento de la pila
        System.out.println("Extraído: " + pila.extraer());

        // Comprobar si la pila está vacía
        System.out.println("¿Está la pila vacía? " + pila.estaVacia());

        // Mostrar el primer elemento después de la extracción
        System.out.println("Primer elemento después de extraer: " + pila.primero());

        // Añadir más elementos
        pila.añadir("Elemento 4");
        pila.añadir("Elemento 5");

        // Comprobar si la pila está vacía después de añadir más elementos
        System.out.println("¿Está la pila vacía? " + pila.estaVacia());

        // Intentar añadir un elemento cuando la pila está llena
        boolean resultado = pila.añadir("Elemento 6");
        System.out.println("¿Se añadió el Elemento 6? " + resultado);
    }
}
