package ej2;

public class EmpleadoPorHoras extends Empleado {
    private double sueldoPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String nombre, String apellidos, String nss, double sueldoPorHora, double horasTrabajadas, Fecha fechaNacimiento) {
        super(nombre, apellidos, nss, fechaNacimiento);
        setSueldoPorHora(sueldoPorHora);
        setHorasTrabajadas(horasTrabajadas);
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = (sueldoPorHora < 0.0) ? 0.0 : sueldoPorHora;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = (horasTrabajadas >= 0.0 && horasTrabajadas <= 168.0) ? horasTrabajadas : 0.0;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double ingresos() {
        double ingresos = (getHorasTrabajadas() <= 40) ?
                getSueldoPorHora() * getHorasTrabajadas() :
                40 * getSueldoPorHora() + (getHorasTrabajadas() - 40) * getSueldoPorHora() * 1.5;

        if (getFechaNacimiento().toString().contains(String.valueOf(java.time.LocalDate.now().getMonthValue()))) {
            ingresos += 100; // Bonificación de 100€ si es el mes del cumpleaños
        }

        return ingresos;
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\nSueldo por hora: %.2f€; Horas trabajadas: %.2f",
                super.toString(), getSueldoPorHora(), getHorasTrabajadas());
    }
}

