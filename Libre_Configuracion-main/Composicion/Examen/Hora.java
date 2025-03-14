/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion.Examen;

public class Hora {
    private int hora;
    private int minuto;

    // Constructor
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    // Métodos getter
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    // Método toString() para devolver la hora en formato "hora:minutos"
    @Override
    public String toString() {
        return hora + ":" + minuto;
    }
}

