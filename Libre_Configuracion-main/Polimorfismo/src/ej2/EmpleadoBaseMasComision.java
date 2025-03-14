package ej2;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellidos, String nss, double ventasBrutas, double tarifaComision, double salarioBase, Fecha fechaNacimiento) {
        super(nombre, apellidos, nss, ventasBrutas, tarifaComision, fechaNacimiento);
        setSalarioBase(salarioBase);
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        double ingresos = getSalarioBase() + super.ingresos();
        if (getFechaNacimiento().toString().contains(String.valueOf(java.time.LocalDate.now().getMonthValue()))) {
            ingresos += 100; // Bonificación de 100€ si es el mes del cumpleaños
        }
        return ingresos;
    }

    @Override
    public String toString() {
        return String.format("Empleado con salario base: %s\nSalario base: %.2f€",
                super.toString(), getSalarioBase());
    }
}
