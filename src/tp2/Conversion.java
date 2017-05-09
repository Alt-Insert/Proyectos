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
public class Conversion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese bytes");
        long bytes = scanner.nextLong();
        
        int eleccion;
        do {
            System.out.println("Convertir a unidad:");
            System.out.println("1. Kilobytes");
            System.out.println("2. Megabytes");
            System.out.println("3. Gigabytes");
            System.out.println("4. Salir");
            
            eleccion = scanner.nextInt();
        } while (eleccion < 1 || eleccion > 4);
        
        if (eleccion == 4) {
            return;
        }
        
        switch (eleccion) {
            case 1:
                System.out.println(bytes / 1024.0); // 1024.0 devuelve resultado decimal
                break;
            case 2:
                System.out.println(bytes / 1024.0 / 1024);
                break;
            case 3:
                System.out.println(bytes / 1024.0 / 1024 / 1024);
                break;
        }
    }
    
}
