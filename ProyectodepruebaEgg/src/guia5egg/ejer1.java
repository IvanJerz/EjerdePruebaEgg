/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

/** Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 *
 * @author Ceci
 */
public class ejer1 {
    static final int cantidad = 100;
    public static void main(String[] args) {
        int [] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++ ) { 
         vector[i] = i+1; 
        }
        for (int i = vector.length -1; i >=0; i--) { 
            System.out.println("El valor del vector es  [" + vector[i] + "]");
        }
    }
 
}
