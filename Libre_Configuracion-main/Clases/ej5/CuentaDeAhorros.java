package ej5;

// CuentaDeAhorros.java
public class CuentaDeAhorros {
    private static double tasaInteresAnual; // Tasa de interés anual compartida por todas las cuentas
    private double saldoAhorros; // Saldo del ahorrador

    // Constructor por defecto
    public CuentaDeAhorros() {
        this.saldoAhorros = 0.0;
    }

    // Constructor con saldo inicial
    public CuentaDeAhorros(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldoAhorros = saldoInicial;
        } else {
            this.saldoAhorros = 0.0;
        }
    }

    // Método get para saldoAhorros
    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    // Método set para saldoAhorros
    public void setSaldoAhorros(double saldoAhorros) {
        if (saldoAhorros >= 0) {
            this.saldoAhorros = saldoAhorros;
        }
    }

    // Método para calcular el interés mensual y actualizar el saldo
    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12.0);
        saldoAhorros += interesMensual;
    }

    // Método estático para modificar la tasa de interés anual
    public static void modificarTasaInteres(double nuevaTasa) {
        if (nuevaTasa >= 0) {
            tasaInteresAnual = nuevaTasa;
        }
    }

    // Método para obtener la tasa de interés anual actual
    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
}
