/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej6;

public class Biblioteca {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("L001", "Java para principiantes", 2020);
        Libro libro2 = new Libro("L002", "La programación avanzada", 2019);

        // Crear revistas
        Revista revista1 = new Revista("R001", "Revista de tecnología", 2023, 15);
        Revista revista2 = new Revista("R002", "Revista de ciencia", 2022, 30);

        // Mostrar la información inicial
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(revista1);
        System.out.println(revista2);

        // Prestar un libro
        libro1.prestar();
        System.out.println("\nDespués de prestar el libro 1:");
        System.out.println(libro1);

        // Devolver el libro
        libro1.devolver();
        System.out.println("\nDespués de devolver el libro 1:");
        System.out.println(libro1);
    }
}

