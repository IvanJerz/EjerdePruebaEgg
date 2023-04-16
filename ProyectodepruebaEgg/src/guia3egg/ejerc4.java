/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá imprimir
	un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package guia3egg;

import static guia3egg.ejerc1.scan;
import java.util.Scanner;

/**
 *
 * @author Ceci
 */
public class ejerc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();
        String letra= frase.substring(0,1);
        
        if (letra.equals("a")) { 
            System.out.println("correcto");
        } else { 
            System.out.println("Incorrecto");
        }
    }
}
