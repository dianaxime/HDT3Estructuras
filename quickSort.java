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

Miercoles 6 de febreo de 2019

Ordenamiento mediante quicksort
*/
/**
 *
 * @author DIANA
 */
public class quickSort {
    
    public Comparable[] quick(Comparable[] miarray, int left, int right){
        //elegir el pivote
        Comparable pivote = miarray[left];
        int i = left; // izquierda del pivote
        int j = right; // derecha del pivote
        Comparable aux;
        // evaluar los elementos buscando un nuevo pivote
        while(i<j){
            //mientras el elemento sea menor o igual al pivote, aumenta i
            while(miarray[i].compareTo(pivote)<=0 && i<j){
                i++;
            }
            //mientras el elemento sea mayor al pivote, se disminuye j
            while(miarray[j].compareTo(pivote)>0){
                j--;
            }
            //la parte i debe ir a la derecha y j a la izquierda
            //por lo tanto i<j se intercambian los elementos
            if (i<j){
                aux = miarray[i];
                miarray[i] = miarray[j];
                miarray[j] = aux;
            }
        }
        //actualizar la posicion del pivote
        miarray[left] = miarray[j];
        miarray[j] = pivote;
        if (left<j-1){
            // recursividad a parte 1
            quick(miarray, left, j-1);
        }
        if (j+1<right){
            // recursividad a parte 2
            quick(miarray, j+1, right);
        }
        return miarray;
    }
    
}
