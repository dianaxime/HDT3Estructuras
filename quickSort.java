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
public class quickSort {
    
    public void quick(Comparable[] miarray, int left, int right){
        Comparable pivote = miarray[left];
        int i = left;
        int j = right;
        Comparable aux;
        while(i<j){
            while(miarray[i].compareTo(pivote)<=0 && i<j){
                i++;
            }
            while(miarray[j].compareTo(pivote)==1){
                j--;
            }
            if (i<j){
                aux = miarray[i];
                miarray[i] = miarray[j];
                miarray[j] = miarray[i];
            }
        }
        miarray[left] = miarray[j];
        miarray[j] = pivote;
        if (left<j-1){
            quick(miarray, left, j-1);
        }
        if (j+1<right){
            quick(miarray, j+1, right);
        }
    }
    
}
