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
public class Tablas {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la tabla que desea ver");
        int x = s.nextInt();
        
        System.out.println("Ingrese la cantidad de multiplicaciones");
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
    
}
