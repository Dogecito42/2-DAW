/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej1;


public class ArrayReales implements Estadisticas {
    private double[] datos;

    // Constructor para inicializar el array de datos
    public ArrayReales(double[] datos) {
        this.datos = datos;
    }

    // Implementación del método minimo() para obtener el valor mínimo del array
    @Override
    public double minimo() {
        double min = datos[0];
        for (double valor : datos) {
            if (valor < min) {
                min = valor;
            }
        }
        return min;
    }

    // Implementación del método maximo() para obtener el valor máximo del array
    @Override
    public double maximo() {
        double max = datos[0];
        for (double valor : datos) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    }

    // Implementación del método sumatorio() para calcular la suma de los valores del array
    @Override
    public double sumatorio() {
        double suma = 0;
        for (double valor : datos) {
            suma += valor;
        }
        return suma;
    }
}
