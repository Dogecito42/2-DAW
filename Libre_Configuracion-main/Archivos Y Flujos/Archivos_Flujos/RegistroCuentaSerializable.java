/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos_Flujos;

/**
 *
 * @author Doge42
 */
class RegistroCuentaSerializable {
    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;

    // El constructor sin argumentos llama al otro constructor con valores predeterminados
    public RegistroCuentaSerializable() {
        this(0, "", "", 0.0);
    } // fin del constructor de Ej4 sin argumentos

    // El constructor con cuatro argumentos inicializa un registro
    public RegistroCuentaSerializable(int cta, String nombre, String apellido, double sal) {
        setCuenta(cta);
        setPrimerNombre(nombre);
        setApellidoPaterno(apellido);
        setSaldo(sal);
    } // fin del constructor de Ej4 con cuatro argumentos

    // Establece el número de cuenta
    public void setCuenta(int cta) {
        cuenta = cta;
    } // fin del método establecerCuenta

    // Obtiene el número de cuenta
    public int getCuenta() {
        return cuenta;
    } // fin del método obtenerCuenta

    // Establece el primer nombre
    public void setPrimerNombre(String nombre) {
        primerNombre = nombre;
    } // fin del método establecerPrimerNombre

    // Obtiene el primer nombre
    public String getPrimerNombre() {
        return primerNombre;
    } // fin del método obtenerPrimerNombre

    // Establece el apellido paterno
    public void setApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    } // fin del método establecerApellidoPaterno

    // Obtiene el apellido paterno
    public String getApellidoPaterno() {
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // Establece el saldo
    public void setSaldo(double sal) {
        saldo = sal;
    } // fin del método establecerSaldo

    // Obtiene el saldo
    public double getSaldo() {
        return saldo;
    } // fin del método obtenerSaldo
} // fin de la clase Ej4
