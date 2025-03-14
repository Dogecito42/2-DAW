import Composicion.Fecha;
import java.util.Calendar;

public class Persona {
    private String nombre;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    private Fecha fechaNacimiento;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.direccion = "";
        this.codigoPostal = "";
        this.ciudad = "";
        this.fechaNacimiento = new Fecha();
    }

    // Constructor con parámetros
    public Persona(String nombre, String direccion, String codigoPostal, String ciudad, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método que verifica si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        Calendar hoy = Calendar.getInstance();
        int añoActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        int edad = calcularEdad();
        return edad >= 18;
    }

    // Método que calcula la edad de la persona
    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int añoActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        int edad = añoActual - fechaNacimiento.getAño();
        if (mesActual < fechaNacimiento.getMes() || (mesActual == fechaNacimiento.getMes() && diaActual < fechaNacimiento.getDia())) {
            edad--;
        }

        return edad;
    }

    // Método toString que devuelve los datos de la persona
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Fecha Nacimiento: " + fechaNacimiento.toString() + "\n" +
               "Dirección: " + direccion + "\n" +
               codigoPostal + " " + ciudad;
    }
}

