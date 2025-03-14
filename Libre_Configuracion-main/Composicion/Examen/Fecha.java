/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion.Examen;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Métodos getter
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    // Método toString() para devolver la fecha en formato "día/mes/año"
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}

