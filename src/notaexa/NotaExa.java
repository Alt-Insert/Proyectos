/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaexa;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class NotaExa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float notaMate;
        float acumMate = 0;
        float notaLab;
        float acumLab = 0;
        float promMate;
        float promLab;
        float promFinal;
        
        String cadenaNotaMate;
        String cadenaNotaLab;

        for (int i = 1; i <= 3; i++) {
            cadenaNotaMate = JOptionPane.showInputDialog(null, "Ingrese las notas de MATEMATICAS");
            notaMate = Float.parseFloat(cadenaNotaMate);
            acumMate = acumMate + notaMate;
        }
        for (int i = 1; i <= 2; i++) {
            cadenaNotaLab = JOptionPane.showInputDialog(null, "Ingrese las notas de LABORATORIO");
            notaLab = Float.parseFloat(cadenaNotaLab);
            acumLab = acumLab + notaLab;
        }
        promMate = acumMate / 3;
        promLab = acumLab / 2;
        promFinal = (promMate + promLab) / 2;

        JOptionPane.showMessageDialog(null, "***** Promedio de Examen Matematica\n"
                + " " + promMate + "\n"
                + "Promedio de Examen Laboratorio\n"
                + " " + promLab + "\n"
                + "Promedio Final\n"
                + " " + promFinal);
        if (promFinal >= 6) {
            JOptionPane.showMessageDialog(null, "Aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Desaprobado");
        }

    }

}
