/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

import java.util.Scanner;

/**
 Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
public class ejerc5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limit;
        System.out.println("Ingrese un valor limite positivo");
        limit= leer.nextInt();
 //En lugar de hacer una suma y compararla con el límite, se le puede restar
// a este último lo que ingrese el usuario y salir una vez que el resto sea menor que 0.       
        while(limit >= 0){ 
            System.out.println("Ingrese un numero");
            limit -= leer.nextInt();
        }
        System.out.println("Limite superado");
    }
    
    
    
}
