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
*/
/**
 *
 * @author DIANA
 */
public class bubbleSort {
    public Comparable[] bubble(Comparable[] miarray){
        int num = miarray.length;
        Comparable aux;
        for (int i=0; i<num; i++){
            for (int j=1; j<(num-i); j++){
               if (miarray[j-1].compareTo(miarray[j])==1){
                   aux = miarray[j-1];
                   miarray[j-1] = miarray[j];
                   miarray[j] = aux;
               } 
            }
        }
        return miarray;
    }
}
