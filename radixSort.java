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
import java.util.Arrays;

public class radixSort {
    
    public Comparable max(Comparable[] miarray, int num){
        Comparable maxi = miarray[0];
        for (int i=1; i<num; i++){
            if (miarray[i].compareTo(maxi)==1){
                maxi = miarray[i];
            }
        }
        return maxi;
    }
    public void count(Comparable[] miarray, int num, int expo){
        Comparable[] otroarray = new Comparable[num];
        int i;
        int[] contarray = new int[10];
        Arrays.fill(contarray, 0);
        for (i=0; i<num; i++){
            contarray[10%(( Integer.parseInt((String)miarray[i]))/expo)]++;
        }
        for (i=1; i<10; i++){
            contarray[i]+= contarray[i-1];
        }
        for (i=num-1; i>=0; i--){
            otroarray[contarray[(Integer.parseInt((String)miarray[i])/expo)%10]-1] = miarray[i];
            contarray[(Integer.parseInt((String)miarray[i])/expo)%10]--;
        }
        for (i=0; i<num; i++){
            miarray[i] = otroarray[i];
        }
    }
    public void radix(Comparable[] miarray){
        int num = miarray.length;
        Comparable maxim = max(miarray, num);
        int maximo= Integer.parseInt((String) maxim);
        for (int exp=1; maximo/exp>0; exp*=10){
            count(miarray, num, exp);
        }
        
    }
}
