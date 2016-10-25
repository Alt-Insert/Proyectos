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
public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero:");
        int n = s.nextInt();
        
        int f1 = 1;
        int f2 = 1;
        
        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    System.out.println(f1);
                    break;
                case 1:
                    System.out.println(f2);
                    break;
                default:
                    int x = f1 + f2;
                    System.out.println(x);
                    f1 = f2;
                    f2 = x;
                    break;
            }
        }
    }
    
}
