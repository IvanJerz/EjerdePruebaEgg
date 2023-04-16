/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
 * si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día,
 * 2 horas.
 * @author Ceci
 */
public class ejercExtra1 {
    public static void main(String[] args) {
       Scanner leerNum = new Scanner(System.in);
        // Creamos la variamble tiempo
        int min ;
        int dias = 0 ;
        // Le pedimos al usuario que ingrese el valor
        System.out.println("Ingrese los minutos que desea saber");
        // Leemos la entrada
        min = leerNum.nextInt();
        int aux = min;
        if (aux > 1440){
          //  double horas = min / 60;
            dias = aux / 1440 ;
            aux = aux % 1440; 
        }
        int horas = aux / 60;
        // Escribimos el resultado
        System.out.println("En días son: " + dias + " y en horas son: " + horas);
        
        
    }
}
