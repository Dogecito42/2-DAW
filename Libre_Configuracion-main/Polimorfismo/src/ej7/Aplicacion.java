package ej7;

public class yAplicacion {
    public static void main(String[] args) {
        // Crear formas
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(10, 10);
        
        Forma rectangulo = new Rectangulo("Rojo", punto1, "Rectángulo1", 5, 10);
        Forma elipse = new Elipse("Azul", punto2, "Elipse1", 6, 4);
        Forma cuadrado = new Cuadrado("Verde", punto1, "Cuadrado1", 7);
        Forma circulo = new Circulo("Amarillo", punto2, "Círculo1", 3);

        // Crear un array de formas
        Forma[] formas = { rectangulo, elipse, cuadrado, circulo };

        // Poner todas las formas del mismo color y moverlas a una posición
        for (Forma forma : formas) {
            forma.setColor("Negro");  // Cambiar el color
            forma.mover(20, 20);  // Mover la forma a la posición (20, 20)
            forma.imprimir();  // Imprimir la información de la forma
            if (forma instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) forma;
                System.out.println("Área: " + r.calcularArea());
            } else if (forma instanceof Elipse) {
                Elipse e = (Elipse) forma;
                System.out.println("Área: " + e.calcularArea());
            }
            System.out.println();
        }
    }
}
