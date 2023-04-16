/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 * @author Ceci
 */
public class ejerc3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        int  i = 0;
        
    for (int f = 0; f < 5; f++) { 
        System.out.println("Ingrese el número del vector");
        int num= leer.nextInt();
        vector[f]= num;
        
     }    
    for (int elemento: vector){ //imprime el vector 
        System.out.println("[" + elemento + "]");
    }
    for (int elemento: vector) {  
       i++;
       int res = elemento;
       int cont= 0;
        do {
            res = res/10;
            cont++;
            
        } while (res !=0);
        System.out.println("");
        System.out.println("El elemento de la posicion " + i + " tiene " + cont + " digitos ");
        
    }      
    }
}
