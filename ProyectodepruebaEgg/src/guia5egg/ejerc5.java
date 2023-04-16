/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
 * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT 
 * y se obtiene cambiando sus filas por columnas (o viceversa).

 * @author Ceci
 */
public class ejerc5 {
   static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        
     cargar(matriz);
     imprimir(matriz);
     verificar(matriz);
     mostrar(matriz);
    }
   //FUNCION CARGAR:
    public static void cargar(int[][] matriz) {
       for (int i = 0; i<3; i++) {  
          for (int j= 0; j<3; j++) { 
              System.out.println("Ingrese elemento de la posicion " + i + " , " + j);
              matriz[i][j] = leer.nextInt();
           
          }
         
       } 
        
    }
    //FUNCION IMPRIMIR:
    public static void imprimir(int[][] matriz) { 
     for(int i= 0; i< 3; i++) { 
       for(int j=0; j<3; j++) { 
           System.out.println("[" + matriz[i][j] + "]");
       } 
         System.out.println("");
     }
    
    }
  //Funcion verificar: 
    public static void verificar(int [][] matriz){ 
      boolean verificar = false;
      for(int i=0; i<3; i++){ 
       for(int j=0; j<3; j++) { 
           if (matriz[i][j]== -matriz[j][i]) { 
              verificar = true;
           }
       }
         
      }
    if (verificar) { 
        System.out.println("La matriz es antisimetrica");
     } else {  
        System.out.println("La matriz no es antisimetrica");
    }
    }
  //funcion impriir:
    public static void mostrar(int [][] matriz) {  
       for (int i=0; i<3; i++) { 
        for (int j=0; j<3; j++) {  
            System.out.println("[" + matriz[i][i] +  "]");
          
        }
           System.out.println("");
       }
        System.out.println("");
        
        for (int i=0; i<3; i++) { 
          for (int j=0; j<3; j++){  
              System.out.println("[" +matriz[j][i]+ "]");
            
          }
            System.out.println("");
        }
    }
}



