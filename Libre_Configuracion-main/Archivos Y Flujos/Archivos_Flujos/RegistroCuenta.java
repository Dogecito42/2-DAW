
package Archivos_Flujos;
        
 public class RegistroCuenta {
    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;

    // El constructor sin argumentos llama a otro constructor con valores predeterminados
    public RegistroCuenta() {
        this(0, "", "", 0.0); // Llama al constructor con cuatro argumentos
    } // Fin del constructor de RegistroCuenta sin argumentos

    // Inicializa un registro
    public RegistroCuenta(int cta, String nombre, String apellido, double sal) {
        setCuenta(cta);
        setPrimerNombre(nombre);
        setApellidoPaterno(apellido);
        setSaldo(sal);
    } // Fin del constructor de RegistroCuenta con cuatro argumentos

    // Establece el número de cuenta
    public void setCuenta(int cta) {
        cuenta = cta;
    } // Fin del método establecerCuenta

    // Obtiene el número de cuenta
    public int getCuenta() {
        return cuenta;
    } // Fin del método obtenerCuenta

    // Establece el primer nombre
    public void setPrimerNombre(String nombre) {
        primerNombre = nombre;
    } // Fin del método establecerPrimerNombre

    // Obtiene el primer nombre
    public String getPrimerNombre() {
        return primerNombre;
    } // Fin del método obtenerPrimerNombre

    // Establece el apellido paterno
    public void setApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    } // Fin del método establecerApellidoPaterno

    // Obtiene el apellido paterno
    public String getApellidoPaterno() {
        return apellidoPaterno;
    } // Fin del método obtenerApellidoPaterno

    // Establece el saldo
    public void setSaldo(double sal) {
        saldo = sal;
    } // Fin del método establecerSaldo

    // Obtiene el saldo
    public double getSaldo() {
        return saldo;
    } // Fin del método obtenerSaldo
} // Fin de la clase RegistroCuenta

