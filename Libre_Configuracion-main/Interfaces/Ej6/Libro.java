/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej6;

public class Libro implements Prestable {
    private String codigo;
    private String titulo;
    private int anio;
    private boolean prestado;

    // Constructor de la clase Libro
    public Libro(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = false;  // Al principio no está prestado
    }

    // Implementación de la interfaz Prestable
    @Override
    public void prestar() {
        this.prestado = true; // Marca el libro como prestado
    }

    @Override
    public void devolver() {
        this.prestado = false; // Marca el libro como devuelto
    }

    @Override
    public boolean prestado() {
        return this.prestado; // Devuelve si el libro está prestado
    }

    // Método toString() que devuelve los datos del libro
    public String toString() {
        return "Libro [Codigo: " + this.codigo + ", Titulo: " + this.titulo + 
               ", Año: " + this.anio + ", Prestado: " + this.prestado + "]";
    }

    // Métodos adicionales para obtener el código y el año
    public String getCodigo() {
        return this.codigo;
    }

    public int getAnio() {
        return this.anio;
    }
}
