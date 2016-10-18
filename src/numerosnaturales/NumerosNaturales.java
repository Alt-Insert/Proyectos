/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosnaturales;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class NumerosNaturales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int res = 0;
        int inicio = 1;
        int cant;

        String cCant;
        String imprimir = "Números a imprimir \n";
        do {
            cCant = JOptionPane.showInputDialog(null, "Ingrese cantidad deseada\n"
                    + "1- Menos de 10 números y Salir\n"
                    + "2- Hasta 1000 números");
            cant = Integer.parseInt(cCant);
            switch (cant) {
                case 1:
                    for (inicio = 1; inicio <= 10; inicio++) {
                        imprimir = imprimir + inicio + "\t";
                        
                    }
                    JOptionPane.showMessageDialog(null, imprimir);
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                case 2:
                    for (inicio = 1; inicio <= 1000; inicio++) {
                        imprimir = imprimir + inicio + "\t";
                        
                    }
                    JOptionPane.showMessageDialog(null, imprimir);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Acción invalidad");

            }

        } while (cant != 1);

    }
}
