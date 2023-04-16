/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

/**
 *
 * @author Ceci
 */
public class ejercExtra4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        String rom = "A";
        
        do { 
            System.out.println("Ingrese un numero del 1 al 10");
            num = leer.nextInt();
         switch(num){ 
             case 1: 
                 rom="I";
              break;   
             case 2: rom="II";
             break;
             case 3: rom="III";
             break;
             case 4: rom= "IV";
             break;
             case 5: rom= "V";
             break;
       
             case 6: rom= "VI";
             break;
             case 7: rom=  "VII";
             break;
             case 8: rom= "VIII";
             break;
             case 9: rom= "ix";
             break;
             case 10: rom = "X";
             break;
             
             default: System.out.println("Numero ingresado incorrecto \n ");
         }   
        } while (num<1 || num > 10);{
        System.out.println("El equivalente a numero romano es:" + rom);
    }
    }
}
