package ej6;

// Clase Multimedia
public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private double duracion;

    // Constructor
    public Multimedia(String titulo, String autor, String formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    // Métodos Getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Duración: " + duracion + " min";
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia that = (Multimedia) obj;
        return titulo.equals(that.titulo) && autor.equals(that.autor);
    }
}
