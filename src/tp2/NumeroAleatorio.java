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
public class NumeroAleatorio {
    
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        
        Scanner s = new Scanner(System.in);
        
        int x;
        do {
            System.out.println("Ingrese un numero entre 1 y 10");
            x = s.nextInt();
        } while (x < 1 || x > 10);
        
        if (x == n) {
            System.out.println("Adivinaste!");
        } else {
            System.out.println("Perdiste. El numero era "+n);
        }
    }
    
}
