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
public class ContadorCaracteres {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un texto");
        String texto = s.nextLine();
        
        System.out.println("Ingrese un caracter");
        String t = s.next();
        char c = t.charAt(0);
        
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i=i+1) {
            char letra = texto.charAt(i);
            if (letra == c) {
                contador++;
            }
        }
        
        System.out.println(c + " aparece " + contador + " veces");
    }
    
}
