/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 *
 * @author Ceci
 */
public class extra5Ejerc {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de filas y columnas");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
    int [][] matriz = new int[n][m];
    int suma =0;
    for(int i = 0; i < matriz.length; i++) { 
       for(int j = 0; j < m; j++) { 
       matriz[i][j] = (int)(Math.random()*10);
       suma+= matriz[i][j];
       }
    }    
    for(int[] ints : matriz) { 
       for(int j = 0; j< m; j++) { 
           System.out.println("[" +ints[j]+ "]");
       
       }
        System.out.println("");
    }    
        System.out.println("");
        System.out.println("La suma de todos sus elementos es de " + suma);
    
    }
    
}
