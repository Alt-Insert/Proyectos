/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class EdadExacta {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese dia");
        int dia = s.nextInt();
        
        System.out.println("Ingrese mes");
        int mes = s.nextInt();
        
        System.out.println("Ingrese año");
        int anio = s.nextInt();
        
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        
        int mesActual = Calendar.getInstance().get(Calendar.MONTH) + 1;
        
        int diaActual = Calendar.getInstance().get(Calendar.DATE);
        
        int edad = anioActual - anio;
        
        if (mes > mesActual) {
            edad = edad - 1;
        } else if (mes == mesActual) {
            if (dia > diaActual) {
                edad = edad - 1;
            }
        }
        
        if (mes > mesActual || mes == mesActual && dia > diaActual) {
            // condicion equivalente
        }
        
        System.out.println("Edad en años: "+edad);
    }
    
}
