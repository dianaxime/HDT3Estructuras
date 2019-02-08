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
    
    public int max(int[] miarray, int num){
        int maxi = miarray[0];
        for (int i=1; i<num; i++){
            if (miarray[i]>maxi){
                maxi = miarray[i];
            }
        }
        return maxi;
    }
    public void count(int[] miarray, int num, int expo){
        int[] otroarray = new int[num];
        int i;
        int[] contarray = new int[10];
        Arrays.fill(contarray, 0);
        for (i=0; i<num; i++){
            contarray[(miarray[i]/expo)%10]++;
        }
        for (i=1; i<10; i++){
            contarray[i]+= contarray[i-1];
        }
        for (i=num-1; i>=0; i--){
            otroarray[contarray[(miarray[i]/expo)%10]-1] = miarray[i];
            contarray[(miarray[i]/expo)%10]--;
        }
        for (i=0; i<num; i++){
            miarray[i] = otroarray[i];
        }
    }
    public void radix(int[] miarray){
        int num = miarray.length;
        int maxim = max(miarray, num);
        for (int exp=1; maxim/exp>0; exp*=10){
            count(miarray, num, exp);
        }
        
    }
}
