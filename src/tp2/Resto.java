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
public class Resto {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero:");
        int n = s.nextInt();
        
        System.out.println("Ingrese otro numero entero:");
        int m = s.nextInt();
        
        while (m <= n) {
            n -= m;
        }
        
        System.out.println("Resto de la division: "+n);
    }
    
}
