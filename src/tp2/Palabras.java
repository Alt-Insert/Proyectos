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
public class Palabras {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra:");
        String p1 = s.next();
        
        System.out.println("Ingrese otra palabra:");
        String p2 = s.next();
        
        int longitud1 = p1.length();
        int longitud2 = p2.length();
        
        if (longitud1 > longitud2) {
            System.out.println("La primera palabra es mas larga");
        } else if (longitud2 > longitud1) {
            System.out.println("La segunda palabra es mas larga");
        } else {
            System.out.println("Las palabras miden lo mismo");
        }
    }
    
}
