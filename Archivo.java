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
    
    public void crear(int cant) throws IOException{
        String ruta;
        ruta = "Documentos/Random.txt*";
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
    
    public int aleatorio(int max){
        Random numero =new Random(System.currentTimeMillis());
        int alazar = numero.nextInt(max);
        return alazar;
    }
    
}
