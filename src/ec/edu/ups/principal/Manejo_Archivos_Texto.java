

/**
 *
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.controlador.Texto_Controlador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author José Quinde
 */
public class Manejo_Archivos_Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //primero colocar la ruta.
       Scanner sc=new Scanner(System.in);
       int i= 1;
        int a;

        while(i==1){
				    	//Imprime Menu
				        System.out.println("-----------------------------------------------------------------------");
				        System.out.println("|------------------------------ARCHIVOS DE TEXTO-----------------------|");
				        System.out.println("|                            1.Escribir Texto                          |");
				        System.out.println("|                            2.Leer Archivo                            |");
                                        System.out.println("|                            3.Contar Palabras                         |");
                                        System.out.println("|                            4.Salir                                   |");
				        System.out.println("------------------------------------------------------------------------");
				        System.out.println("Ingrese Opcion:");
                                        //Ingresar la opcion que se quiere realizar
				        a=sc.nextInt();
				        //un switch que ingresa dependiendo el valor seleccionado
				    switch(a){
				    case 1:{
                                        System.out.println("Ingrese Texto a escribir");
                                        String palabra=sc.next();
                                        Texto_Controlador tc=new Texto_Controlador();
                                        tc.Escritura(palabra);
                       				        break;
				    }
				    case 2:{
                                       Texto_Controlador tc=new Texto_Controlador();
                                        tc.Lectura();
				        break;
				    }
                                  case 3:{
                                       Texto_Controlador tc=new Texto_Controlador();
                                       
				        break;
				    }
                                  
                                  
				    case 4:{
                                        
                                        /**
                                         * Se sale del programa 
                                         */
				        System.out.println("Gracias");
				        i=0;
				        break;
				    }
				    default:{
				        System.out.flush();        
				        System.err.println("Ingrese Opcion Valida");
				        break;
				    }
                                    }
                    }
    }
    
}

   

