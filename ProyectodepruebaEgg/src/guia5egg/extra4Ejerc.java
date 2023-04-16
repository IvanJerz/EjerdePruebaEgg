/*
 * To change this license header, choose License Headers i5n Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5egg;

import java.util.Scanner;

/**
 *
 * @author Ceci
 */
public class extra4Ejerc {
    public static void main(String[] args) {
           
Scanner leer = new Scanner(System.in).useDelimiter("\n");
double[] vec = new double[10];

int aprobados =0;
int desaprobados =0;

for (int i = 0; i < vec.length; i++) { 
   for(int j = 0; j < 4; j++) { 
       System.out.println("INgrese la nota " + (j + 1) + " del alumno " + (i + 1));
       vec[i] += leer.nextDouble();
   }
vec[i] /= 4;
    System.out.println("El promedio del alumno " +(i+ 1)+ " es de " + String.format("[%.3f]", vec[i]) + " ");
    if (vec[i] >= 7) { 
      aprobados++;
    
    } else { 
      desaprobados++;
    
    }
    System.out.println("");
}
        System.out.println("");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);




}
}