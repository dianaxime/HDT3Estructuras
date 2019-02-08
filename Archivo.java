/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt3;


/*Integrantes:
Diana Ximena de Leon Figueroa
Fatima Jazmin Albeño Barrios
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

public class Archivo {
    String ruta;
    public void crear(int cant, String nombre){
        try{
           ruta = "Documentos/"+nombre+".txt*";
            File archivo = new File(ruta);

            if (!archivo.exists()){
                archivo.createNewFile();
            }

            FileWriter archivow = new FileWriter(archivo);
            BufferedWriter archivob = new BufferedWriter(archivow);

            for (int i=0; i<cant; i++){
                archivob.write(aleatorio(10000));
                archivob.write(",");
            } 
        }
        catch( IOException | NumberFormatException e){
            
        }
        
    }
    
    public int aleatorio(int max){
        Random numero =new Random(System.currentTimeMillis());
        int alazar = numero.nextInt(max);
        return alazar;
    }
    
    public int[] leer(){
        int[] miarray = new int[0];
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
                   miarray = new int[partes.length-1];
                   //recorre las partes 
                   for (int i=0; i<partes.length; i++){
                       //si es un operador extrae los valores y realiza la operacion
                       miarray[i]= Integer.parseInt(partes[i]);
                   }
                   //lee otra linea
                   datos= lector1.readLine();
                }
        }
        catch( IOException | NumberFormatException e){
            
        }
        
        return miarray;
    }
}
