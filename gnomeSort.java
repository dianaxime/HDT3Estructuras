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
public class gnomeSort {
    
    public void ordenar(int[] miarray){
        
        int cont = 1;
        
        while(cont<miarray.length){
            
            if (miarray[cont-1]<= miarray[cont]){
                cont++;
            }
            else{
                int num = miarray[cont-1];
                miarray[cont-1] = miarray[cont];
                miarray[cont] = num;
                if (--cont==0){
                    cont=1;
                }
            }
        } 
    }  
}
