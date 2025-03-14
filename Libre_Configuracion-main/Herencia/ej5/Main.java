package ej5;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Comercial y Repartidor
        Comercial comercial1 = new Comercial("Juan", 32, 1500, 250);
        Comercial comercial2 = new Comercial("Ana", 28, 1200, 150);

        Repartidor repartidor1 = new Repartidor("Carlos", 24, 1000, "zona 3");
        Repartidor repartidor2 = new Repartidor("Pedro", 26, 1100, "zona 2");

        // Mostrar empleados antes de aplicar el plus
        System.out.println("Antes del plus:");
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);

        // Aplicar el plus
        comercial1.plus();
        comercial2.plus();
        repartidor1.plus();
        repartidor2.plus();

        // Mostrar empleados después de aplicar el plus
        System.out.println("\nDespués del plus:");
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);
    }
}

