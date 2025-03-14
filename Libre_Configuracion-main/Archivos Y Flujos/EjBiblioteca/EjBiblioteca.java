package EjBiblioteca;

import java.io.*;
import java.util.Scanner;

public class EjBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro libro = null; // Se usará más adelante para almacenar el libro introducido.

        while (true) {
            // Menú de opciones
            System.out.println("Menú de opciones");
            System.out.println("--------------------");
            System.out.println("1 - Introducir datos del libro");
            System.out.println("2 - Consultar datos del libro");
            System.out.println("3 - Leer datos desde fichero (Fichero de texto)");
            System.out.println("4 - Escribir datos en fichero (Fichero de texto)");
            System.out.println("5 - Leer datos desde fichero (Fichero binario)");
            System.out.println("6 - Escribir datos en fichero (Fichero binario)");
            System.out.println("7 - Leer datos desde fichero (Fichero Aleatorio)");
            System.out.println("8 - Escribir datos en fichero (Fichero Aleatorio)");
            System.out.println("9 - Leer datos desde fichero (Leer Objetos)");
            System.out.println("10 - Escribir datos en fichero (Escribir Objetos)");
            System.out.println("0 - Salir");
            System.out.println("--------------------");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Introducir datos del libro
                    System.out.print("Introduce el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el ISBN: ");
                    String isbn = scanner.nextLine();
                    libro = new Libro(titulo, autor, isbn);
                    break;

                case 2:
                    // Consultar datos del libro
                    if (libro != null) {
                        System.out.println("Título: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("ISBN: " + libro.getIsbn());
                    } else {
                        System.out.println("No se ha introducido ningún libro.");
                    }
                    break;

                case 3:
                    // Leer datos desde fichero (Fichero de texto)
                    leerFicheroTexto();
                    break;

                case 4:
                    // Escribir datos en fichero (Fichero de texto)
                    if (libro != null) {
                        escribirFicheroTexto(libro);
                    } else {
                        System.out.println("Primero debes introducir un libro.");
                    }
                    break;

                case 5:
                    // Leer datos desde fichero (Fichero binario)
                    leerFicheroBinario();
                    break;

                case 6:
                    // Escribir datos en fichero (Fichero binario)
                    if (libro != null) {
                        escribirFicheroBinario(libro);
                    } else {
                        System.out.println("Primero debes introducir un libro.");
                    }
                    break;

                case 7:
                    // Leer datos desde fichero (Fichero Aleatorio)
                    leerFicheroAleatorio();
                    break;

                case 8:
                    // Escribir datos en fichero (Fichero Aleatorio)
                    if (libro != null) {
                        escribirFicheroAleatorio(libro);
                    } else {
                        System.out.println("Primero debes introducir un libro.");
                    }
                    break;

                case 9:
                    // Leer datos desde fichero (Leer Objetos)
                    leerFicheroObjetos();
                    break;

                case 10:
                    // Escribir datos en fichero (Escribir Objetos)
                    if (libro != null) {
                        escribirFicheroObjetos(libro);
                    } else {
                        System.out.println("Primero debes introducir un libro.");
                    }
                    break;

                case 0:
                    // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Métodos de lectura/escritura de ficheros

    public static void escribirFicheroTexto(Libro libro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("libro.txt"))) {
            writer.write("Título: " + libro.getTitulo());
            writer.newLine();
            writer.write("Autor: " + libro.getAutor());
            writer.newLine();
            writer.write("ISBN: " + libro.getIsbn());
            System.out.println("Datos escritos en libro.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero de texto: " + e.getMessage());
        }
    }

    public static void leerFicheroTexto() {
        try (BufferedReader reader = new BufferedReader(new FileReader("libro.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero de texto: " + e.getMessage());
        }
    }

    public static void escribirFicheroBinario(Libro libro) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("libro.bin"))) {
            out.writeObject(libro);
            System.out.println("Datos escritos en libro.bin");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero binario: " + e.getMessage());
        }
    }

    public static void leerFicheroBinario() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.bin"))) {
            Libro libro = (Libro) in.readObject();
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getIsbn());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el fichero binario: " + e.getMessage());
        }
    }

    public static void escribirFicheroAleatorio(Libro libro) {
        try (RandomAccessFile file = new RandomAccessFile("libro.rdn", "rw")) {
            file.writeUTF(libro.getTitulo());
            file.writeUTF(libro.getAutor());
            file.writeUTF(libro.getIsbn());
            System.out.println("Datos escritos en libro.rdn");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero de acceso aleatorio: " + e.getMessage());
        }
    }

    public static void leerFicheroAleatorio() {
        try (RandomAccessFile file = new RandomAccessFile("libro.rdn", "r")) {
            String titulo = file.readUTF();
            String autor = file.readUTF();
            String isbn = file.readUTF();
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("ISBN: " + isbn);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero de acceso aleatorio: " + e.getMessage());
        }
    }

    public static void escribirFicheroObjetos(Libro libro) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("libro.obj"))) {
            out.writeObject(libro);
            System.out.println("Datos escritos en libro.obj");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero de objetos: " + e.getMessage());
        }
    }

    public static void leerFicheroObjetos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.obj"))) {
            Libro libro = (Libro) in.readObject();
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getIsbn());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el fichero de objetos: " + e.getMessage());
        }
    }
}

