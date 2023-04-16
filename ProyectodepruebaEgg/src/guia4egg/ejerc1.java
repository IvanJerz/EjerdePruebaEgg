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
public class ejerc1 {
    public static void main(String[] args) {
    System.out.println("Ingrese dos numeros para evaluar");
        int num1,num2;
        double resultado=0;
        String opcion="";
        Scanner ingreso = new Scanner (System.in);
        num1= ingreso.nextInt();
        num2= ingreso.nextInt();
        
        System.out.println("Ingrese  alguna opcion: M - D - R - S");
        opcion=ingreso.next();
        
        switch(opcion){
            case "M": resultado = multiplicacion(num1,num2);
            break;
            
            case "D": resultado = division(num1,num2);
            break;
            
            case "R": resultado = resta(num1,num2);
            break;
            
            case "S": resultado = suma(num1,num2);
            break;
        
        
        }
        
        System.out.println(resultado);
        
    }
    
    public static int suma(int num1 , int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    
    public static int resta(int num1 , int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    
    public static double division(int num1 , int num2){
        double resultado = num1 / num2;
        return resultado;
    }
    
    public static int multiplicacion(int num1 , int num2){
        int resultado = num1 * num2;
        return resultado;
    }
}



    
    
