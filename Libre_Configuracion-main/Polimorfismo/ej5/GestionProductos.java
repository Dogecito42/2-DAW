package ej5;

// Clase base Producto
abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método abstracto calcular que será implementado en las subclases
    public abstract double calcular(int cantidad);

    // Método toString para la representación en cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
}

// Clase Perecedero (Producto perecedero)
class Perecedero extends Producto {
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    // Getter y Setter para diasACaducar
    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    // Implementación del método calcular
    @Override
    public double calcular(int cantidad) {
        double precioFinal = getPrecio();
        // Reducir el precio según los días a caducar
        if (diasACaducar == 1) {
            precioFinal = precioFinal / 4;
        } else if (diasACaducar == 2) {
            precioFinal = precioFinal / 3;
        } else if (diasACaducar == 3) {
            precioFinal = precioFinal / 2;
        }
        return precioFinal * cantidad;
    }

    // toString para la clase Perecedero
    @Override
    public String toString() {
        return super.toString() + ", Días a caducar: " + diasACaducar;
    }
}

// Clase NoPerecedero (Producto no perecedero)
class NoPerecedero extends Producto {
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    // Getter y Setter para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Implementación del método calcular
    @Override
    public double calcular(int cantidad) {
        return getPrecio() * cantidad;
    }

    // toString para la clase NoPerecedero
    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
}

// Clase principal para ejecutar el código
public class GestionProductos {
    public static void main(String[] args) {
        // Crear un array de productos
        Producto[] productos = new Producto[6];

        // Crear productos de tipo Perecedero y NoPerecedero
        productos[0] = new Perecedero("Leche", 1.5, 1); // Perecedero con 1 día para caducar
        productos[1] = new Perecedero("Pan", 2.0, 2);   // Perecedero con 2 días para caducar
        productos[2] = new Perecedero("Yogurt", 1.0, 3); // Perecedero con 3 días para caducar
        productos[3] = new NoPerecedero("Arroz", 3.0, "Grano");  // No Perecedero
        productos[4] = new NoPerecedero("Papel higiénico", 2.5, "Hogar");  // No Perecedero
        productos[5] = new NoPerecedero("Aceite", 5.0, "Cocina"); // No Perecedero

        // Imprimir el precio total de vender 5 productos de cada tipo
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.printf("Precio total para vender 5 unidades: %.2f\n\n", producto.calcular(5));
        }
    }
}
