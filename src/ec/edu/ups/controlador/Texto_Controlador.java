/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author José Quinde
 */
public class Texto_Controlador {
    String ruta = "archivo.txt";
    
    public void Escritura(String palabra) throws IOException{
          try {
         FileWriter archivo = new FileWriter(ruta, true);

         BufferedWriter escritura = new BufferedWriter(archivo);

         //todo lo que se abre se tiene que cerrar, sino queda abierta la conexion.
         escritura.append(palabra);
         escritura.newLine();

         escritura.close();
         archivo.close();
          } catch (IOException ex) {
         System.err.println("\n" + "Error de escritura");
         }
      
    }
    public void Lectura(){
         try {

            FileReader archivo = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivo);
            String linea = " ";

            while (linea != null) {
                linea = lectura.readLine();
                if(linea != null){
                    System.out.println(linea);
                }
               
            }

        } catch (FileNotFoundException ex1) {
            System.out.println("Archivo " + ruta + "no encontrada");
        } catch (IOException ex) {
            System.out.println("error de lectura");
        }
    }
    public void ContarPalabras(){
      
}

}
