/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
 * La matriz traspuesta de una matriz A se denota por B 
 * y se obtiene cambiando sus filas por columnas (o viceversa).

 * @author Ceci
 */
public class ejerc4 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        String aux = " ";
    //cargo la matriz    
    for (int i=0; i<4; i++) { 
   
    for (int j=0; j<4; j++) { 
        matriz[i][j] = (int)(Math.random()*11);
    }     
    }    
    //Imprimo vector
    for (int[] fila: matriz) { 
        aux= "";
        for(int elemento: fila) {
        aux += " " + elemento;
        }
       System.out.println("[" + aux  + "]");
    }
        System.out.println("\n");
        //recore columnas
        for (int i = 0; i<4; i++) {  
           aux = "";
     //recorre filas
           for(int j=0; j<4; j++) { 
           aux+= " " + matriz[j][i];
           }
            System.out.println("[" + aux + "]");
        
        }
    }
}
