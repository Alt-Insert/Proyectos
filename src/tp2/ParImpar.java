/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2;

import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class ParImpar {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int numero = s.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else 
            System.out.println("El numero es impar");
    }
    
}
