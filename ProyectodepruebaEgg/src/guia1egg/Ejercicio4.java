/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia1egg;

import java.util.Scanner;

/**
 *
 * @author Ceci
 */
public class Ejercicio4 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        float celsius;
        System.out.println("Ingrese un valor en celsius");
        celsius = scan.nextFloat();
        
        System.out.println("\nEquivalente en Fahrenheit:" + (32 + (9* celsius / 5 )) + "\n");   
    }
}
