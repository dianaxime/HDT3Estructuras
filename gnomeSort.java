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
public class gnomeSort {
    
    public Comparable[] ordenar(Comparable[] miarray){
        
        int cont = 1;
        
        while(cont<miarray.length){
            
            if (miarray[cont-1].compareTo(miarray[cont])<=0){
                cont++;
            }
            else{
                Comparable num = miarray[cont-1];
                miarray[cont-1] = miarray[cont];
                miarray[cont] = num;
                if (--cont==0){
                    cont=1;
                }
            }
        } 
        return miarray;
    }  
}
