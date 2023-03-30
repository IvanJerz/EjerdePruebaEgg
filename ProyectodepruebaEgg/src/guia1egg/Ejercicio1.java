/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1egg;

import java.util.Scanner;

/**
 *
 * @author Ceci
 */
public class Ejercicio1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int number1, number2;
		
		System.out.print("Ingrese el primer número: ");
		number1 = scan.nextInt();
		System.out.print("Ingrese el segundo número: ");
		number2 = scan.nextInt();
		
		System.out.printf("\n%d + %d = %d\n", number1, number2, number1 + number2);
    }
    
}
