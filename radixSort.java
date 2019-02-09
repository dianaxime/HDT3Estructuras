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

Miercoles 6 de febrero de 2019

Ordenamiento mediante RadixSort
*/
/**
 *
 * @author DIANA
 */
import java.util.Arrays;

public class radixSort {
    
    // Obtener el numero mayor 
    public Comparable max(Comparable[] miarray, int num){
        //supone que el primero es el mayor
        Comparable maxi = miarray[0];
        //recorre todos los numeros buscando uno mayor
        for (int i=1; i<num; i++){
            //si hay uno mas alto, lo define como el nuevo mayor
            if (miarray[i].compareTo(maxi)==1){
                maxi = miarray[i];
            }
        }
        return maxi;
    }
    //realiza el conteo del array basado en el valor de expo
    public Comparable[] count(Comparable[] miarray, int num, int expo){
        int[] otroarray = new int[num]; //array final u ordenado
        int i;
        int[] contarray = new int[10];
        Arrays.fill(contarray, 0);
        //Almacena el conteo
        for (i=0; i<num; i++){
            contarray[(((int)miarray[i])/expo)%10]++;
        }
        // Cambiar la cuenta para que contenga la posicion actual del digito de salida
        for (i=1; i<10; i++){
            contarray[i]+= contarray[i-1];
        }
        //Construir el array ordenado
        for (i=num-1; i>=0; i--){
            otroarray[contarray[((int)miarray[i]/expo)%10]-1] = (int)miarray[i];
            contarray[((int)miarray[i]/expo)%10]--;
        }
        //Copiar el array ordenado para que el original contenga el ordenado
        for (i=0; i<num; i++){
            miarray[i] = otroarray[i];
        }
        return miarray;
    }
    public Comparable[] radix(Comparable[] miarray){
        int num = miarray.length;
        //Encuentra el numero mayor 
        Comparable maxim = max(miarray, num);
        int maximo= (int)maxim;
        // Contar ordenando cada digito 
        for (int exp=1; maximo/exp>0; exp*=10){
            count(miarray, num, exp);
        }
        return miarray;
    }
}
