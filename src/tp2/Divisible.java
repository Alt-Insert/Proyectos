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
public class Divisible {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int x = s.nextInt();
        
        System.out.println("Ingrese otro numero:");
        int y = s.nextInt();
        
        if (x % y == 0) {
            System.out.println("Los numeros son divisibles");
        } else {
            System.out.println("Los numeros no son divisibles");
        }
    }
    
}
