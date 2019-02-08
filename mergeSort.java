/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt3;

/**
 *
 * @author DIANA
 */
import java.util.Arrays;
import java.io.IOException;

public class mergeSort {
    
    public void mergesort(int[] miarray) throws IOException{
        
        /*if (left<right){
            int num = (left+right)/2;
            mergesort(miarray, left, num);
            mergesort(miarray, num+1, right);
            merge(miarray, left, m, right);
        }*/
        if (miarray.length>1){
            int num = miarray.length/2;
            int[] left = Arrays.copyOfRange(miarray, 0, num-1);
            int[] right = Arrays.copyOfRange(miarray, num, miarray.length-1);
            mergesort(left);
            mergesort(right);
            merge(miarray, left, right);
        }
    }
    public void merge(int[] miarray, int[] izquierda, int[] derecha){
        int total=izquierda.length+derecha.length;
        int i = 0;
        int li = 0;
        int ri = 0;
        while (i<total){
            if ((li<izquierda.length) && (ri<derecha.length)){
                if (izquierda[li]<derecha[ri]){
                    miarray[i] = izquierda[li];
                    i++;
                    li++;
                }
                else{
                    miarray[i] = derecha[ri];
                    i++;
                    ri++;
                }
            }
            else{
                if (li>=izquierda.length){
                    while(ri<derecha.length){
                        miarray[i] = derecha[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri>=derecha.length){
                    while(li<izquierda.length){
                        miarray[i] = izquierda[li];
                        i++;
                        li++;
                    }
                }
            }
        }
    }
}
