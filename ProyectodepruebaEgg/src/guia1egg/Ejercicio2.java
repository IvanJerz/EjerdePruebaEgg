/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
	Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
 * and open the template in the editor.
 */
package guia1egg;

import java.util.Scanner;

/**
 *
 * @author Ceci
 */

public class Ejercicio2 {
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence;
        System.out.println("Ingrese una frase");
        
        System.out.println("\\nFrase original:" + (sentence = scan.nextLine()));
        System.out.println("Mayuscula:" + sentence.toUpperCase());
        System.out.println("Minusculas" + sentence.toLowerCase());
    }
}
