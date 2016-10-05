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
public class Tipeo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int correctos = 0;
        int incorrectos = 0;
        long sumaTiempo = 0;
        
        for (int i = 0; i < 10; i++) {
            int cifras;
            do {
                cifras = (int) (Math.random() * 10);
            } while (cifras < 3);
            
            int numero = (int) (Math.random() * Math.pow(10, cifras));
            
            System.out.println(numero);
            
            long t1 = System.nanoTime();
            
            int numeroUsuario = scanner.nextInt();
            
            long t2 = System.nanoTime();
            
            long t = (t2 - t1) / 1000000;
            
            if (numero == numeroUsuario) {
                System.out.println("Correcto");
                correctos++;
            } else {
                System.out.println("Incorrecto");
                incorrectos++;
            }
            
            System.out.println("Tiempo: "+t+" ms");
            sumaTiempo = sumaTiempo + t;
        }
        
        System.out.println("Cantidad correctos: "+correctos);
        System.out.println("Cantidad incorrectos: "+incorrectos);
        System.out.println("Tiempo promedio: "+(sumaTiempo / 10));
    }
    
}
