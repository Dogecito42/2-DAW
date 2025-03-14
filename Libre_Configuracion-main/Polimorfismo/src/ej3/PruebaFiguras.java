package ej3;

// Clase base Figura
abstract class Figura {
    // Método abstracto que debe ser implementado por las subclases
    public abstract void descripcion();
}

// Clase para figuras bidimensionales
abstract class FiguraBidimensional extends Figura {
    // Método abstracto para obtener el área de la figura bidimensional
    public abstract double obtenerArea();

    // Método abstracto para obtener el perímetro de la figura bidimensional
    public abstract double obtenerPerimetro();
}

// Clase para figuras tridimensionales
abstract class FiguraTridimensional extends Figura {
    // Método abstracto para obtener el área superficial de la figura tridimensional
    public abstract double obtenerArea();

    // Método abstracto para obtener el volumen de la figura tridimensional
    public abstract double obtenerVolumen();
}

// Clase para el círculo (FiguraBidimensional)
class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void descripcion() {
        System.out.println("Figura: Círculo");
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Clase para el triángulo rectángulo (FiguraBidimensional)
class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void descripcion() {
        System.out.println("Figura: Triángulo Rectángulo");
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public double obtenerPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }
}

// Clase para el cuadrado (FiguraBidimensional)
class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void descripcion() {
        System.out.println("Figura: Cuadrado");
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }

    @Override
    public double obtenerPerimetro() {
        return 4 * lado;
    }
}

// Clase para el cubo (FiguraTridimensional)
class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public void descripcion() {
        System.out.println("Figura: Cubo");
    }

    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return Math.pow(lado, 3);
    }
}

// Clase para la esfera (FiguraTridimensional)
class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public void descripcion() {
        System.out.println("Figura: Esfera");
    }

    @Override
    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}

// Clase para el cono (FiguraTridimensional)
class Cono extends FiguraTridimensional {
    private double radio;
    private double altura;

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public void descripcion() {
        System.out.println("Figura: Cono");
    }

    @Override
    public double obtenerArea() {
        double generatriz = Math.sqrt(radio * radio + altura * altura);
        return Math.PI * radio * (radio + generatriz);
    }

    @Override
    public double obtenerVolumen() {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }
}

// Clase de prueba
public class PruebaFiguras {
    public static void main(String[] args) {
        // Crear un array de figuras
        Figura[] figuras = new Figura[6];

        // Crear instancias de las figuras
        figuras[0] = new Circulo(5);
        figuras[1] = new Triangulo(3, 4);
        figuras[2] = new Cuadrado(6);
        figuras[3] = new Cubo(3);
        figuras[4] = new Esfera(4);
        figuras[5] = new Cono(3, 5);

        // Procesar cada figura en el array
        for (Figura figura : figuras) {
            figura.descripcion();
            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.printf("Área: %.2f\n", figuraBidimensional.obtenerArea());
                System.out.printf("Perímetro: %.2f\n\n", figuraBidimensional.obtenerPerimetro());
            } else if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.printf("Área Superficial: %.2f\n", figuraTridimensional.obtenerArea());
                System.out.printf("Volumen: %.2f\n\n", figuraTridimensional.obtenerVolumen());
            }
        }
    }
}
