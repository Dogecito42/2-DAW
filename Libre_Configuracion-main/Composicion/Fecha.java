/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor por defecto que inicializa la fecha a 01/01/2020
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 2020;
    }

    // Constructor que inicializa con valores proporcionados
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Métodos getter y setter para los atributos de la fecha
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método que compara si la fecha actual es mayor que la proporcionada
    public boolean esMayorQue(Fecha f) {
        if (this.año > f.año) {
            return true;
        } else if (this.año == f.año) {
            if (this.mes > f.mes) {
                return true;
            } else if (this.mes == f.mes) {
                return this.dia > f.dia;
            }
        }
        return false;
    }

    // Método toString que devuelve la fecha en formato dd/MM/yyyy
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }
}

