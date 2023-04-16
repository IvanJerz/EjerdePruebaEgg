/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3egg;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
 * A continuación, realizar las instrucciones necesarias para que:
	B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
        * Mostrar los valores iniciales y los valores finales de cada variable.
	Utilizar sólo una variable auxiliar.
 * @author Ceci
 */
public class ejercExtra2 {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C= 12;
        int D =3;
        int aux;
        
        System.out.println("A = " + A + "B = " + B + "C = " + C + "D =" + D);
        aux = B; B= C; C= A; A= D; D= aux;
        
        System.out.println("A = " + A+ "B= " + B + "B= " + C + "D= " + D);
        
    }
 
}
