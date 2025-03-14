package ej3;

public class PruebaRectangulo {
    public static void main(String[] args) {
        // Crear un objeto Rectangulo con los valores predeterminados
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Rectángulo predeterminado:");
        System.out.println("Longitud: " + rectangulo1.getLongitud());
        System.out.println("Anchura: " + rectangulo1.getAnchura());
        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Área: " + rectangulo1.calcularArea());

        // Crear un objeto Rectangulo con valores específicos
        Rectangulo rectangulo2 = new Rectangulo(5.0, 10.0);
        System.out.println("\nRectángulo personalizado:");
        System.out.println("Longitud: " + rectangulo2.getLongitud());
        System.out.println("Anchura: " + rectangulo2.getAnchura());
        System.out.println("Perímetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Área: " + rectangulo2.calcularArea());

        // Probar el método establecer con valores válidos
        System.out.println("\nActualizando dimensiones del rectángulo...");
        rectangulo2.setLongitud(7.5);
        rectangulo2.setAnchura(12.3);
        System.out.println("Longitud: " + rectangulo2.getLongitud());
        System.out.println("Anchura: " + rectangulo2.getAnchura());
        System.out.println("Perímetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Área: " + rectangulo2.calcularArea());

        // Probar el método establecer con valores inválidos
        try {
            rectangulo2.setLongitud(25.0); // Valor inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar la longitud: " + e.getMessage());
        }

        try {
            rectangulo2.setAnchura(-3.0); // Valor inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar la anchura: " + e.getMessage());
        }
    }
}

