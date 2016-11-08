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
public class ContadorPalabras {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un texto");
        String texto = s.nextLine();
        
        int contador = 1; // empieza en 1 porque la ultima palabra no termina con espacio
        
        for (int i = 0; i < texto.length(); i=i+1) {
            char letra = texto.charAt(i);
            if (letra == ' ') {
                contador++;
            }
        }
        
        System.out.println("Cantidad de palabras: " + contador);
    }
    
}
