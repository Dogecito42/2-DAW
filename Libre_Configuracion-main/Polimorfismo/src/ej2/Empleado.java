package ej2;


public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String numeroSeguroSocial;
    private Fecha fechaNacimiento; // Nueva variable de instancia

    public Empleado(String nombre, String apellidos, String nss, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSeguroSocial = nss;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nnumero de seguro social: %s\nFecha de nacimiento: %s",
                getNombre(), getApellidos(), getNumeroSeguroSocial(), getFechaNacimiento());
    }

    public abstract double ingresos();
}

