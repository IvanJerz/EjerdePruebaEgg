/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

/**
 *
 * @author Ceci
 */
//VECTOR
public class ejerc1 {
    public static void main(String[] args) {
        int vector [] = new int[5];
        vector[0] = 3;
    /*asigno valores mediante un for */
    for(int i = 0; i<5; i++) { 
       vector[i]= i + 3;
     } 
    // muestro el vector:
    for(int i = 0; i < 5; i++){  
        System.out.println("["+ vector[i] + "]");
    }
    }
}
