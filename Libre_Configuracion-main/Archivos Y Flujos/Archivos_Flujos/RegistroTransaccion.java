package Archivos_Flujos;

public class RegistroTransaccion {
    private int cuenta;       // Número de cuenta
    private double cantidad;  // Cantidad de la transacción

    // Constructor sin argumentos
    public RegistroTransaccion() {
        this.cuenta = 0;
        this.cantidad = 0.0;
    }

    // Constructor con argumentos
    public RegistroTransaccion(int cuenta, double cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    // Método para establecer el número de cuenta
    public void establecerCuenta(int cta) {
        this.cuenta = cta;
    }

    // Método para obtener el número de cuenta
    public int obtenerCuenta() {
        return this.cuenta;
    }

    // Método para establecer la cantidad
    public void establecerCantidad(double cant) {
        this.cantidad = cant;
    }

    // Método para obtener la cantidad
    public double obtenerCantidad() {
        return this.cantidad;
    }

    // Método para mostrar los datos del registro
    @Override
    public String toString() {
        return "RegistroTransaccion{" +
               "cuenta=" + cuenta +
               ", cantidad=" + cantidad +
               '}';
    }
}

