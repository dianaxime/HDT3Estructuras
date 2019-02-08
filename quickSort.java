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
    
    public void quick(int[] miarray, int left, int right){
        int pivote = miarray[left];
        int i = left;
        int j = right;
        int aux;
        while(i<j){
            while(miarray[i]<=pivote && i<j){
                i++;
            }
            while(miarray[j]>pivote){
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
