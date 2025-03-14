/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ej2;

public final class Math3 implements Extremos {
    
    // Método estático que devuelve el valor mínimo de un array de enteros
    @Override
    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Método estático que devuelve el valor máximo de un array de enteros
    @Override
    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Método estático que devuelve el valor mínimo de un array de doubles
    @Override
    public double min(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        double min = a[0];
        for (double num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Método estático que devuelve el valor máximo de un array de doubles
    @Override
    public double max(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        double max = a[0];
        for (double num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

