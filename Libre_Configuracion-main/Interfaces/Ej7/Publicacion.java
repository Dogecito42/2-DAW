/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej7;

abstract class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int anio;

    public Publicacion(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Año: " + anio;
    }
}
