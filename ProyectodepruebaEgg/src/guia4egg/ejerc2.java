/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4egg;

import java.util.Scanner;

/**
 *
 * @author Ceci
 */
public class ejerc2 {
    public static void main(String[] args) {
        String nombre;
        String opcion="";
        int edad;       
        Scanner ingreso= new Scanner (System.in);
        
        
        do{
            System.out.println("Ingrese un nombre y edad");
            
            nombre=ingreso.next();
            edad=ingreso.nextInt();
            
            acceso(edad,nombre);
            System.out.println("*********");
            System.out.println("Desea continuar? ingrese 'No' si desea salir.");
            opcion=ingreso.next();
            
        }while(!(opcion.equals("No")));
      
    }
 
  public static void acceso(int edad, String nombre){
      System.out.println("El nombre de la persona es: " + nombre);
      System.out.println("La edad ingresada es de: " + edad + " años");
      
      if(edad<18){
          System.out.println("La persona es menor de edad");
      }else{
          System.out.println("La persona es mayor de edad");
      }
      
  }
}
