package ej2;
public class PruebaNominas {
    public static void main(String args[]) {
        // Crear objetos de las subclases con fechas de nacimiento
        Fecha fecha1 = new Fecha(15, 12, 1980); // Cumpleaños en diciembre
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00, fecha1);

        Fecha fecha2 = new Fecha(25, 5, 1990); // Cumpleaños en mayo
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40, fecha2);

        Fecha fecha3 = new Fecha(10, 12, 1985); // Cumpleaños en diciembre
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06, fecha3);

        Fecha fecha4 = new Fecha(1, 3, 1992); // Cumpleaños en marzo
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Mike", "Davis", "444-44-4444", 5000, .1, 1000, fecha4);

        // Crear un arreglo de empleados
        Empleado empleados[] = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        // Mostrar información de los empleados y sus ingresos
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);
            System.out.printf("Ingresos: %.2f€\n\n", empleados[i].ingresos());
        }
    }
}