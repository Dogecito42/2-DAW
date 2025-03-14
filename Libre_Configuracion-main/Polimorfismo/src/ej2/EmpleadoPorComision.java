package ej2;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellidos, String nss, double ventasBrutas, double tarifaComision, Fecha fechaNacimiento) {
        super(nombre, apellidos, nss, fechaNacimiento);
        setVentasBrutas(ventasBrutas);
        setTarifaComision(tarifaComision);
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    @Override
    public double ingresos() {
        double ingresos = getTarifaComision() * getVentasBrutas();
        if (getFechaNacimiento().toString().contains(String.valueOf(java.time.LocalDate.now().getMonthValue()))) {
            ingresos += 100; // Bonificación de 100€ si es el mes del cumpleaños
        }
        return ingresos;
    }

    @Override
    public String toString() {
        return String.format("Empleado por comision: %s\nVentas brutas: %.2f€; Tarifa de comision: %.2f",
                super.toString(), getVentasBrutas(), getTarifaComision());
    }
}
