/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero
 * y si se encuentra repetido

 * @author Ceci
 */
public class ejer2 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
    int [] vector = new int[10];
    
    for ( int i = 0; i< 10; i++) { 
        vector[i]= (int)(Math.random()* 11);
    } 
    for (int elemento: vector) { 
        System.out.println("[" + elemento + "]");
     }
        System.out.println("¿Que numero desea buscar entre 1 al 10?");
        int num = leer.nextInt();
        int pos = -1;
        for (int i =0; i< 10; i++){  
           if (vector[i]==num){ 
            pos = i;
               System.out.println("El número se encuentra en la posicion " + pos);
           }  
        }
      if (pos == -1){ 
          System.out.println("El numero no se encuentra en el vector");
      }
    }
    
    
}
