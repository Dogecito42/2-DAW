package ej2;


public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellidos, String nss, double salarioSemanal, Fecha fechaNacimiento) {
        super(nombre, apellidos, nss, fechaNacimiento);
        setSalarioSemanal(salarioSemanal);
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = (salarioSemanal < 0.0) ? 0.0 : salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double ingresos() {
        double ingresos = getSalarioSemanal();
        if (getFechaNacimiento().toString().contains(String.valueOf(java.time.LocalDate.now().getMonthValue()))) {
            ingresos += 100; // Bonificación de 100€ si es el mes del cumpleaños
        }
        return ingresos;
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\nSalario semanal: %.2f€",
                super.toString(), getSalarioSemanal());
    }
}

