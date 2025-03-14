/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej7;

public class Biblioteca2 {

    // Método cuentaPrestados
    public static int cuentaPrestados(Publicacion[] publicaciones) {
        int prestados = 0;
        for (Publicacion p : publicaciones) {
            if (p instanceof Prestable) {
                Prestable prestable = (Prestable) p;
                if (prestable.prestado()) {
                    prestados++;
                }
            }
        }
        return prestados;
    }

    // Método publicacionesAnterioresA
    public static int publicacionesAnterioresA(Publicacion[] publicaciones, int año) {
        int anteriores = 0;
        for (Publicacion p : publicaciones) {
            if (p.getAnio() < año) {
                anteriores++;
            }
        }
        return anteriores;
    }

    public static void main(String[] args) {
        // Crear libros y revistas
        Libro libro1 = new Libro("L001", "Java para principiantes", 2020);
        Libro libro2 = new Libro("L002", "La programación avanzada", 1985);
        Revista revista1 = new Revista("R001", "Revista de tecnología", 2023, 15);
        Revista revista2 = new Revista("R002", "Revista de ciencia", 1988, 30);

        // Crear un array de publicaciones
        Publicacion[] publicaciones = {libro1, libro2, revista1, revista2};

        // Prestar el primer libro
        libro1.prestar();

        // Mostrar las publicaciones
        System.out.println("Publicaciones en la biblioteca:");
        for (Publicacion p : publicaciones) {
            System.out.println(p);
        }

        // Contar cuántas publicaciones están prestadas
        int prestados = cuentaPrestados(publicaciones);
        System.out.println("\nNúmero de publicaciones prestadas: " + prestados);

        // Contar cuántas publicaciones son anteriores a 1990
        int anterioresA1990 = publicacionesAnterioresA(publicaciones, 1990);
        System.out.println("Número de publicaciones anteriores a 1990: " + anterioresA1990);
    }
}