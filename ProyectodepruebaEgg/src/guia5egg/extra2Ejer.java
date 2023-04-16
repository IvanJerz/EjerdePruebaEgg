/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 *Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte 
 * alguna diferencia entre los elementos).

 * @author Ceci
 */
public class extra2Ejer {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
     for (int i=0; i < vector1.length; i++){
        System.out.println("Ingresa un valor para el vector1" + i);
     vector1[i]= leer.nextInt();
     }
     for (int i= 0; i < vector2.length; i++) { 
         System.out.println("Ingrese un valor para el vector2" +i);
         vector2[i] = leer.nextInt();
     }  
        System.out.println("vector1");
        System.out.println("");
        for(int i=0; i < vector1.length; i++) { 
            System.out.println("[" + vector1[i] + "]");
        }
    for(int i=0; i < vector2.length; i++) { 
        System.out.println("[" + vector2[i] + "]");
    }
      int cont=0;
      for(int i=0; i < vector1.length; i++) {  
          if(vector1[i]!= vector2[i]) { 
              System.out.println("Los vectores no son iguales");
              break;
          
          }
        
      }
    }
     
    
}

