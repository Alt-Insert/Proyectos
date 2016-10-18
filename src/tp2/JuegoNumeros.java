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
public class JuegoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int n4;
        
        n1 = (int)(Math.random() * 10);
        do {
            n2 = (int)(Math.random() * 10);
        } while (n2 == n1);
        do {
            n3 = (int)(Math.random() * 10);
        } while (n3 == n2 || n3 == n1);
        do {
            n4 = (int)(Math.random() * 10);
        } while (n4 == n3 || n4 == n2 || n4 == n1);
        
        //System.out.println("" + n1 + n2 + n3 + n4);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 cifras distintas");
        
        int contadorBien;
        int contadorRegular;
        int contadorMal;
        
        do {
            String cifras = scanner.next();
            
            int c1;
            int c2;
            int c3;
            int c4;
            
            c1 = Character.digit(cifras.charAt(0), 10);
            c2 = Character.digit(cifras.charAt(1), 10);
            c3 = Character.digit(cifras.charAt(2), 10);
            c4 = Character.digit(cifras.charAt(3), 10);
            
            contadorBien = 0;
            contadorRegular = 0;
            contadorMal = 0;
            
            if (c1 == n1) {
                contadorBien++;
            } else if (c1 == n2 || c1 == n3 || c1 == n4) {
                contadorRegular++;
            } else {
                contadorMal++;
            }

            if (c2 == n2) {
                contadorBien++;
            } else if (c2 == n1 || c2 == n3 || c2 == n4) {
                contadorRegular++;
            } else {
                contadorMal++;
            }

            if (c3 == n3) {
                contadorBien++;
            } else if (c3 == n1 || c3 == n2 || c3 == n4) {
                contadorRegular++;
            } else {
                contadorMal++;
            }

            if (c4 == n4) {
                contadorBien++;
            } else if (c4 == n1 || c4 == n2 || c4 == n3) {
                contadorRegular++;
            } else {
                contadorMal++;
            }

            System.out.println(contadorBien + " Bien. " + contadorRegular + " Regular. " + contadorMal + " Mal.");
        } while (contadorBien != 4);
        
        System.out.println("" + n1 + n2 + n3 + n4);
    }
    
}
