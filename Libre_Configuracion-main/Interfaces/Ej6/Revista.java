/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej6;

public class Revista {
    private String codigo;
    private String titulo;
    private int anio;
    private int numero;

    // Constructor de la clase Revista
    public Revista(String codigo, String titulo, int anio, int numero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.numero = numero;
    }

    // Método toString() que devuelve los datos de la revista
    public String toString() {
        return "Revista [Codigo: " + this.codigo + ", Titulo: " + this.titulo + 
               ", Año: " + this.anio + ", Numero: " + this.numero + "]";
    }

    // Métodos adicionales para obtener el código y el año
    public String getCodigo() {
        return this.codigo;
    }

    public int getAnio() {
        return this.anio;
    }
}

