/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej7;

class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.prestado = false; // Al principio no está prestado
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}