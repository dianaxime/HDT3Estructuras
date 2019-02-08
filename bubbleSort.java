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
public class bubbleSort {
    public void bubble(int[] miarray){
        int num = miarray.length;
        int aux = 0;
        for (int i=0; i<num; i++){
            for (int j=1; j<(num-i); j++){
               if (miarray[j-1]>miarray[j]){
                   aux = miarray[j-1];
                   miarray[j-1] = miarray[j];
                   miarray[j] = aux;
               } 
            }
        }
    }
}
