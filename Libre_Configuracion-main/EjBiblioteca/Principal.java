package EjBiblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el ISBN del libro (10 o 13 caracteres):");
        String isbn = scanner.nextLine();

        try {
            // Intentar crear un libro con los datos proporcionados
            Libro libro = new Libro(titulo, autor, isbn);
            System.out.println("Libro creado correctamente.");
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getIsbn());
        } catch (IllegalArgumentException e) {
            // Capturar la excepción si el ISBN no es válido
            System.out.println("Error al crear el libro: " + e.getMessage());
        }

        scanner.close();
    }
}

