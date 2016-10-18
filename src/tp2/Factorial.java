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
public class Factorial {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese numero");
        
        int x = s.nextInt();
        
        int termino = x;
        int factorial = x;
        while (termino > 1) {
            factorial = factorial * (termino - 1);
            termino = termino - 1; // termino--;
        }
        
        System.out.println("Factorial de " + x + " = "+factorial);
    }
    
}
