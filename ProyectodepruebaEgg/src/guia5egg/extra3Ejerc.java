/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 *Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro.
 * Después haremos otra función o procedimiento que imprima el vector.
 * @author Ceci
 */
public class extra3Ejerc {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        rellenarVector(vector);
        mostrarVector(vector);
    }
 public static void rellenarVector(int[] vector) {  
    for (int i=0; i< vector.length; i++) { 
        vector[i] = (int)(Math.random()*100+1);
                
    }
     System.out.println("Vector completo");
 }   
 
  public static void mostrarVector(int[] vector){ 
     for(int i=0; i  < vector.length; i++){ 
         System.out.println("["+vector[i]+"]");
     }
      System.out.println("");
  }  
  
}
