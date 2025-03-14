/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej7;

class Revista extends Publicacion {
    private int numero;

    public Revista(String codigo, String titulo, int anio, int numero) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero: " + numero;
    }
}
