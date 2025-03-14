package ej3;

public class Rectangulo {
    // Atributos de la clase
    private double longitud = 1.0;
    private double anchura = 1.0;

    // Constructor por defecto
    public Rectangulo() {
    }

    // Constructor con parámetros
    public Rectangulo(double longitud, double anchura) {
        setLongitud(longitud);
        setAnchura(anchura);
    }

    // Método establecer para longitud
    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            throw new IllegalArgumentException("La longitud debe ser mayor a 0.0 y menor a 20.0.");
        }
    }

    // Método obtener para longitud
    public double getLongitud() {
        return longitud;
    }

    // Método establecer para anchura
    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            throw new IllegalArgumentException("La anchura debe ser mayor a 0.0 y menor a 20.0.");
        }
    }

    // Método obtener para anchura
    public double getAnchura() {
        return anchura;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    // Método para calcular el área
    public double calcularArea() {
        return longitud * anchura;
    }
}
