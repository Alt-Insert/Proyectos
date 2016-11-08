/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int pValor;
        int sValor;
        int cLog;

        String cadenaPValor;
        String cadenaSValor;
        String cadenaCLog;

        do {
            cadenaCLog = JOptionPane.showInputDialog(null, "Indique la operacion a realizar \n"
                    + "1- SUMA\n"
                    + "2- RESTA\n"
                    + "3- MULTIPLICACION\n"
                    + "4- DIVISION\n"
                    + "0- SALIR\n");
            cLog = Integer.parseInt(cadenaCLog);
            switch (cLog) {
                case 1:
                    int suma;

                    cadenaPValor = JOptionPane.showInputDialog(null, "Primer valor");
                    pValor = Integer.parseInt(cadenaPValor);
                    cadenaSValor = JOptionPane.showInputDialog(null, "Segundo valor");
                    sValor = Integer.parseInt(cadenaSValor);

                    suma = pValor + sValor;
                    JOptionPane.showMessageDialog(null, "La Suma es " + suma);
                    break;
                case 2:
                    int resta;

                    cadenaPValor = JOptionPane.showInputDialog(null, "Primer valor");
                    pValor = Integer.parseInt(cadenaPValor);
                    cadenaSValor = JOptionPane.showInputDialog(null, "Segundo valor");
                    sValor = Integer.parseInt(cadenaSValor);

                    resta = (pValor - sValor);
                    JOptionPane.showMessageDialog(null, "La Resta es " + resta);
                    break;
                case 3:
                    int multiplicacion;

                    cadenaPValor = JOptionPane.showInputDialog(null, "Primer valor");
                    pValor = Integer.parseInt(cadenaPValor);
                    cadenaSValor = JOptionPane.showInputDialog(null, "Segundo valor");
                    sValor = Integer.parseInt(cadenaSValor);

                    multiplicacion = (pValor * sValor);
                    JOptionPane.showMessageDialog(null, "La Multiplicacion es " + multiplicacion);
                    break;
                case 4:
                    int division;

                    cadenaPValor = JOptionPane.showInputDialog(null, "Primer valor");
                    pValor = Integer.parseInt(cadenaPValor);
                    cadenaSValor = JOptionPane.showInputDialog(null, "Segundo valor");
                    sValor = Integer.parseInt(cadenaSValor);

                    division = (pValor / sValor);
                    JOptionPane.showMessageDialog(null, "La Division es " + division);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Accion no Valida");
            }
        } while (cLog != 0);

    }

}
