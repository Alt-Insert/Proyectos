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
public class Rectangulo {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese base");
        
        int base = s.nextInt();
        
        System.out.println("Ingrese altura");
        
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) { // i = i + 1
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
