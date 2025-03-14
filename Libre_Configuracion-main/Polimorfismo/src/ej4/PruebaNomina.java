package ej4;

// Clase base Empleado
abstract class Empleado {
    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, String numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    // Método abstracto para obtener los ingresos
    public abstract double ingresos();

    // Representación de cadena
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\nNúmero de Seguro Social: " + numeroSeguroSocial;
    }
}

// Clase EmpleadoAsalariado (Empleado por salario fijo)
class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String numeroSeguroSocial, double salarioSemanal) {
        super(nombre, apellido, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Empleado Asalariado\nSalario Semanal: " + salarioSemanal;
    }
}

// Clase EmpleadoPorHoras (Empleado que trabaja por horas)
class EmpleadoPorHoras extends Empleado {
    private double salarioPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String nombre, String apellido, String numeroSeguroSocial, double salarioPorHora, double horasTrabajadas) {
        super(nombre, apellido, numeroSeguroSocial);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double ingresos() {
        return salarioPorHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Empleado Por Horas\nSalario por Hora: " + salarioPorHora + "\nHoras Trabajadas: " + horasTrabajadas;
    }
}

// Clase EmpleadoPorComision (Empleado por comisiones)
class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(nombre, apellido, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Empleado Por Comision\nVentas Brutas: " + ventasBrutas + "\nTarifa de Comisión: " + tarifaComision;
    }
}

// Nueva clase EmpleadoPorPiezas (Empleado por piezas producidas)
class EmpleadoPorPiezas extends Empleado {
    private double sueldoPorPieza;
    private int piezas;

    public EmpleadoPorPiezas(String nombre, String apellido, String numeroSeguroSocial, double sueldoPorPieza, int piezas) {
        super(nombre, apellido, numeroSeguroSocial);
        this.sueldoPorPieza = sueldoPorPieza;
        this.piezas = piezas;
    }

    @Override
    public double ingresos() {
        return sueldoPorPieza * piezas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Empleado Por Piezas\nSueldo por Pieza: " + sueldoPorPieza + "\nPiezas Producidas: " + piezas;
    }
}

// Clase de prueba
public class PruebaNomina {
    public static void main(String[] args) {
        // Crear un array de empleados
        Empleado[] empleados = new Empleado[4];

        // Crear instancias de diferentes tipos de empleados
        empleados[0] = new EmpleadoAsalariado("Juan", "Pérez", "123-45-6789", 1000.00);
        empleados[1] = new EmpleadoPorHoras("Ana", "Gómez", "234-56-7890", 20.00, 40);
        empleados[2] = new EmpleadoPorComision("Carlos", "Rodríguez", "345-67-8901", 5000.00, 0.1);
        empleados[3] = new EmpleadoPorPiezas("María", "López", "456-78-9012", 2.50, 500);

        // Procesar cada empleado en el array
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            System.out.printf("Ingresos: %.2f\n\n", empleado.ingresos());
        }
    }
}
