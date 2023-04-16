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
public class muestramatriz {
    public static void main(String[] args) {
        String[] [] matriz = new  String [3][3];
    // Asigno valores:
    matriz [0][0] = "A";
    for (int i =0; i < 3; i++) { 
     for (int j=0; j< 3; j++) { 
         matriz [i][j]= "A";
     }
     }  
    //muestra matriz
    for (int i = 0; i < 3; i++) { 
       for (int j =0; j <3; j++) { 
           System.out.println("[" + matriz[i][j] + "]");
           
       } 
        System.out.println("");
    }
    }
}
