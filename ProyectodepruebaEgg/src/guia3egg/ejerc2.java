/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar
 * @author Ceci
 */
public class ejerc2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int number;
        if((number = leer.nextInt()) % 2 == 0) { 
            System.out.println("El " +number+ "es par");
        } else { 
            System.out.println("El" +number+ "es impar");
        }
        
    }
         
}
