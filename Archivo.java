/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt3;


/*Integrantes:
Diana Ximena de Leon Figueroa 18607
Fatima Jazmin Albeño Barrios 18060
Randy Samuel Venegas Lorenti 18341

Miercoles 6 de febrero de 2019

//Escritura y lectura de archivo .TXT
*/
/**
 *
 * @author DIANA
 */

import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo implements Comparable{
    String ruta;
    public void crear(int cant, String nombre){
        try{
            //direccion para guardar el documento
           ruta = "C:\\Users\\DIANA\\Documents\\"+nombre+".txt";
           //crea un nuevo archivo en esa direccion
            File archivo = new File(ruta);
            //lo crea solo si el archivo no existe 
            if (!archivo.exists()){
                archivo.createNewFile();
            }

            FileWriter archivow = new FileWriter(archivo);
            BufferedWriter archivob = new BufferedWriter(archivow);
            //genera la cantidad de numeros aleatorios definida por el usuario
            for (int i=0; i<cant; i++){
                archivob.write(Integer.toString(aleatorio(100*i+10)));
                archivob.write(",");
            } 
            archivob.close();
        }
        catch( IOException | NumberFormatException e){
            
        }
        
    }
    @Override
    public int compareTo(Object other){
        return 0; //solo para implementar los metodos de la interfaz
    }
    
    public int aleatorio(int max){
        //genera un numero aleatorio 
        Random numero = new Random(System.currentTimeMillis());
        int alazar = numero.nextInt(max);
        //numero.setSeed(System.currentTimeMillis());
        //numero.setSeed(numero.nextInt());
        return alazar;
    }
    
    public Comparable[] leer(){
        //lee el archivo TXT con los numeros 
        Comparable[] miarray = new Comparable[0];
        try{
            FileReader lector;
            BufferedReader lector1;
            String datos;
            // lee el archivo
                lector = new FileReader(ruta);
                lector1 = new BufferedReader(lector);
                //lee una linea del archivo 
                datos= lector1.readLine();
                //verifica que tenga contenido
                while (datos!=null){
                    //elimina las comas
                   String partes[] = datos.split(",");
                   miarray = new Comparable[partes.length];
                   //recorre las partes 
                   for (int i=0; i<partes.length; i++){
                       //agrega los numeros al array
                       miarray[i]= Integer.parseInt((String)partes[i]);
                   }
                   //lee otra linea
                   datos= lector1.readLine();
                }
                lector1.close();
        }
        catch( IOException | NumberFormatException e){
            
        }
        
        return miarray;
    }
}
