package ej5;

// PruebaCuentaDeAhorros.java
public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        // Crear dos cuentas de ahorros con saldos iniciales
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        // Establecer la tasa de interés anual al 4%
        CuentaDeAhorros.modificarTasaInteres(0.04);

        // Calcular e imprimir el interés mensual y el saldo actualizado para ambos ahorradores
        System.out.println("Tasa de interés anual: 4%");
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.printf("Saldo de ahorrador1 después del interés mensual: %.2f€%n", ahorrador1.getSaldoAhorros());
        System.out.printf("Saldo de ahorrador2 después del interés mensual: %.2f€%n", ahorrador2.getSaldoAhorros());

        // Establecer la tasa de interés anual al 5%
        CuentaDeAhorros.modificarTasaInteres(0.05);

        // Calcular e imprimir el interés mensual y el saldo actualizado para ambos ahorradores
        System.out.println("\nTasa de interés anual: 5%");
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.printf("Saldo de ahorrador1 después del interés mensual: %.2f€%n", ahorrador1.getSaldoAhorros());
        System.out.printf("Saldo de ahorrador2 después del interés mensual: %.2f€%n", ahorrador2.getSaldoAhorros());
    }
}
