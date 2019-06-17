/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controlador;

import ec.edu.ups.clase.Palabras;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author José Quinde
 */
public class Texto_Controlador {
    String ruta = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Manejo_Archivos_Texto\\src\\ec\\edu\\ups\\archivos\\archivo.txt";
       private String linea;
    private List<Palabras> lista;

    public Texto_Controlador() {
        lista = new ArrayList<>();
    }
    
    /**
     * Metodo que sirve para Escribir en un archivo
     * @param palabra
     * @throws IOException 
     */
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
    /**
     * Metodo que nos devuelve todo lo que posee un archivo
     */
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
    /**
     * Este metodo sirve para Leer la linea y luego lo compara
     */
    private void leerLinea() { 
        String palabras[] = linea.split(" ");
         for(int i = 0; i <palabras.length;i++){
            compararPalabra(palabras[i].toLowerCase());
        }
     
       
    
    }
    /**
     * Metodo para comparar Palabras repetidas
     * @param palabra 
     */
    private void compararPalabra(String palabra) {
        int con = 0;
        for (Palabras  palabralista: lista) {
            if (palabralista.getNombre().equals(palabra)) {
                palabralista.setCantidad(palabralista.getCantidad()+1);
                con = 1;
                break;
            }
        }
        if(con == 0){
            Palabras newPalabra = new Palabras();
            newPalabra.setNombre(palabra);
            newPalabra.setCantidad(1);
            lista.add(newPalabra);
        }
    }
    /**
     * Este metodo guarda en una archivo resultado las veces repetidas 
     * 
     * @throws IOException 
     */
    public void guardaResultado() throws IOException {
        Collections.sort(lista, new Comparator<Palabras>(){
            public int compare(Palabras p1, Palabras p2){
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        try {
            String ruta2 = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Manejo_Archivos_Texto\\src\\ec\\edu\\ups\\archivos\\Resultado.txt";
            FileWriter archivo = new FileWriter(ruta2, false);
            
            BufferedWriter escritura = new BufferedWriter(archivo);
            for (Palabras palabraEscribir : lista) {
                escritura.append(palabraEscribir.getNombre()+"   veces repetidas:"+palabraEscribir.getCantidad());
                escritura.newLine();
            }
            
            escritura.close();
            archivo.close();
            
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error de Escritura");
        }
    }
    public void LecturaResultado(String ruta1) throws IOException {
        linea = "";
        try {           
           FileReader archivo = new FileReader(ruta1);
            BufferedReader lectura = new BufferedReader(archivo);
            while (linea != null) {
                linea = lectura.readLine();
                if(linea != null){
                    leerLinea();
                }              
            }       
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.err.println("Error al momento de escribir");
        }

    }
}
