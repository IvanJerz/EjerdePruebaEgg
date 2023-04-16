/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje.
	Nota: investigar la función equals() de la clase String.
 * @author Ceci
 */
public class ejercExtra3 {
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   Scanner leerCadena = new Scanner(System.in);
        // Pedimos al usuario
        System.out.println("Ingrese una letra: ");
        String letra = leerCadena.next();
        if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("0") || letra.equalsIgnoreCase("u")) ) {
            System.out.println("No ingresó ninguna vocal");
        }
    }
}
