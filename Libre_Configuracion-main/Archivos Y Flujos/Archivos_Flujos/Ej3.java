package Archivos_Flujos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej3 {
    
   

    public static void main(String[] args) {
        try {
            // Abrir el archivo "antmaest.txt" en modo entrada
            Scanner entAntMaestro = new Scanner(new File("antmaest.txt"));

            // Leer un registro del archivo "antmaest.txt"
            if (entAntMaestro.hasNext()) {
                int cuenta = entAntMaestro.nextInt();
                String primerNombre = entAntMaestro.next();
                String apellidoPaterno = entAntMaestro.next();
                double saldo = entAntMaestro.nextDouble();

                // Crear un objeto de la clase RegistroCuenta
                RegistroCuenta cuentaObjeto = new RegistroCuenta(cuenta, primerNombre, apellidoPaterno, saldo);
                System.out.println("RegistroCuenta creado: " + cuentaObjeto.getCuenta());
            }

            // Cerrar el Scanner para "antmaest.txt"
            entAntMaestro.close();

            // Abrir el archivo "trans.txt" en modo entrada
            Scanner entTransaccion = new Scanner(new File("trans.txt"));

            // Leer un registro del archivo "trans.txt"
            if (entTransaccion.hasNext()) {
                int cuenta = entTransaccion.nextInt();
                double cantidad = entTransaccion.nextDouble();

                // Crear un objeto de la clase RegistroTransaccion
                RegistroTransaccion transaccionObjeto = new RegistroTransaccion();
                transaccionObjeto.establecerCuenta(cuenta);
                transaccionObjeto.establecerCantidad(cantidad);
                System.out.println("RegistroTransaccion creado con cuenta: " + cuenta);
            }

            // Cerrar el Scanner para "trans.txt"
            entTransaccion.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo especificado.");
            e.printStackTrace();
        }
    }
}

