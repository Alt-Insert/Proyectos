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
public class HoraDia {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese hora del dia");
        
        int hora = s.nextInt();
        
        if (hora >= 0 && hora <= 1 || hora >= 20) {
            System.out.println("Noche");
        } else if (hora >= 2 && hora <= 6) {
            System.out.println("Madrugada");
        } else if (hora >= 7 && hora <= 12) {
            System.out.println("Mañana");
        } else if (hora >= 13 && hora <= 19) {
            System.out.println("Tarde");
        }
        
        // alternativa
        if (hora <= 1) {
            
        } else if (hora <= 6) {
            
        } else if (hora <= 12) {
            
        } else if (hora <= 19) {
            
        } else {
            
        }
    }
    
}
