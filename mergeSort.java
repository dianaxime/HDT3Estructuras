/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt3;
/*Integrantes:
Diana Ximena de Leon Figueroa 18607
Fatima Jazmin Albeño Barrios 18060
Randy Samuel Venegas Lorenti 18341

Miercoles 6 de febrero de 2019

Ordenamiento mediante mergeSort
*/
/**
 *
 * @author DIANA
 */
//import java.util.Arrays;
//import java.io.IOException;

public class mergeSort {
    
    public void merge(Comparable[] miarray, int left, int mitad, int right) { 
        // Encontrar el tamaño de las mitades para unirlas  
        int mitad1 = mitad - left + 1; 
        int mitad2 = right - mitad; 
  
        // Crear array auxiliares
        int[] Left = new int [mitad1]; 
        int[] Right = new int [mitad2]; 
  
        // Copiar los datos a los arrays auxiliares
        for (int i=0; i<mitad1; ++i){ 
            Left[i] = (int)miarray[left + i];
        }
        for (int j=0; j<mitad2; ++j){
            Right[j] = (int)miarray[mitad + 1+ j];
        }
        //Unir ambas mitades
        // Iniciar los indices de los arrays 
        int i = 0;
        int j = 0; 
  
        // Iniciar el indice del array unido
        int k = left; 
        while (i < mitad1 && j < mitad2){ 
            if (Left[i] <= Right[j]) { 
                miarray[k] = Left[i]; 
                i++; 
            } 
            else{ 
                miarray[k] = Right[j]; 
                j++; 
            } 
            k++; 
        } 
        //Copiar los elementos restantes 
        while (i < mitad1) { 
            miarray[k] = Left[i]; 
            i++; 
            k++; 
        } 
        while (j < mitad2){ 
            miarray[k] = Right[j]; 
            j++; 
            k++; 
        } 
    } 
  
    public Comparable[] mergesort(Comparable[] miarray, int left, int right) { 
        if (left < right) { 
            // Encontrar la mitad del array 
            int mitad = (left+right)/2; 
            // Ordenar ambas mitades
            mergesort(miarray, left, mitad); 
            mergesort(miarray , mitad+1, right); 
            //Unir ambas mitades
            merge(miarray, left, mitad, right); 
        } 
        return miarray;
    }  
}
