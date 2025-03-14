/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos_Flujos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Doge42
 */
public class Ej4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        ObjectInputStream entAntMaest = new ObjectInputStream(new FileInputStream("antmaest.ser"));
        
        ObjectInputStream entTransaccion = new ObjectInputStream(new FileInputStream("trans.ser"));

        ObjectOutputStream salNuevoMaest = new ObjectOutputStream(new FileOutputStream("nuevomaest.ser"));

        RegistroCuentaSerializable registro = (RegistroCuentaSerializable) entAntMaest.readObject();
        
        RegistroTransaccion registroTrans = (RegistroTransaccion) entTransaccion.readObject();

        RegistroCuentaSerializable registroCuenta=new RegistroCuentaSerializable();
          salNuevoMaest.writeObject(registroCuenta);


    }
}
