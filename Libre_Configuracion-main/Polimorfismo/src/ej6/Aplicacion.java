package ej6;

// Clase abstracta Forma
public abstract class Forma {
    private String color;
    private Punto centro; // La coordenada del centro será un objeto de la clase Punto
    private String nombre;

    // Constructor
    public Forma(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract void imprimir();

    // Métodos Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public String getNombre() {
        return nombre;
    }

    // Método para mover la forma (cambiar la posición del centro)
    public void mover(int x, int y) {
        centro.setX(x);
        centro.setY(y);
    }
}
public class Aplicacion {
    public static void main(String[] args) {
        // Crear una lista multimedia de tamaño 10
        ListaMultimedia lista = new ListaMultimedia(10);

        // Crear objetos Película y añadirlos a la lista
        Pelicula pelicula1 = new Pelicula("La Casa de Papel", "Álex Pina", "mp4", 60, "Álvaro Morte", "Itziar Ituño");
        Pelicula pelicula2 = new Pelicula("Avengers: Endgame", "Anthony y Joe Russo", "avi", 180, "Robert Downey Jr.", "Scarlett Johansson");
        Pelicula pelicula3 = new Pelicula("Interstellar", "Christopher Nolan", "mkv", 169, "Matthew McConaughey", null);

        // Añadir las películas a la lista
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);

        // Mostrar la lista por pantalla
        System.out.println(lista.toString());
    }
}
