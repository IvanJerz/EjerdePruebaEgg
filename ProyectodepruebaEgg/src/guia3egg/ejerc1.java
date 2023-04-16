/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

import java.util.Scanner;

/**
 Crear un programa que determine si es par o in par
 * @author Ceci
 */
public class ejerc1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        if ((number= scan.nextInt())%2 ==0 ) {        
        System.out.println("El numero es par" );
        
        } else { 
            System.out.println("El numero es impar");
        }
    }
}
