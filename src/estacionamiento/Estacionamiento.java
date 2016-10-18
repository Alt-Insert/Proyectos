/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dias;
        int tiempo;
        double minutos;
        double horas = 0;
        double desc;
        double totalPagar;
        double conver;

        String cadenaDias;
        String cadenaMinutos;
        String cadenaHoras;
        String cadenaTiempo;
        
        do {
            cadenaDias = JOptionPane.showInputDialog(null, "*****Favor de Indicar el Dia*****\n"
                    + "1-Lunes\n"
                    + "2-Martes\n"
                    + "3-Miercoles\n"
                    + "4-Jueves\n"
                    + "5-Viernes\n"
                    + "6-Sabado\n"
                    + "7-Domingo\n"
                    + "8-Salir");
            dias = Integer.parseInt(cadenaDias);
            cadenaTiempo = JOptionPane.showInputDialog(null, "*****Favor de indicar el tiempo*****\n"
                    + "1- Minutos\n"
                    + "2- Horas\n"
                    + "3- Salir");
            tiempo = Integer.parseInt(cadenaTiempo);
            if (tiempo == 1) {
                cadenaMinutos = JOptionPane.showInputDialog(null, "Indicar los Minutos");
                minutos = Double.parseDouble(cadenaMinutos);
                if (minutos <= 10) {
                    JOptionPane.showMessageDialog(null, "GRATIS");
                } else if (dias == 2 || dias == 6) {
                    totalPagar = (minutos * 0.05);
                    desc = totalPagar * 0.1256;
                    JOptionPane.showMessageDialog(null, "El valor del estacionamiento es \n" + desc + "\n"
                            + "Cantidad de minutos \n" + minutos);
                } else {
                    totalPagar = (minutos * 0.05);
                    JOptionPane.showMessageDialog(null, "El valor del estacionamiento es \n" + totalPagar + "\n"
                            + "Cantidad de minutos \n" + minutos);
                }
            } else if (tiempo == 2) {
                cadenaHoras = JOptionPane.showInputDialog(null, "Indicar las Horas");
                horas = Double.parseDouble(cadenaHoras);
                conver = horas * 60 / 1;
                totalPagar = (conver * 0.05);
                desc = totalPagar * 0.1256;
                JOptionPane.showMessageDialog(null, "El valor del estacionamiento es \n" + desc + "\n"
                        + "Cantidad de horas \n" + horas);
            } else {
                conver = horas * 60 / 1;
                totalPagar = (conver * 0.05);
                JOptionPane.showMessageDialog(null, "El valor del estacionamiento es \n" + totalPagar + "\n"
                        + "Cantidad de minutos \n" + horas);
            }
        } while (dias != 8 && tiempo != 3);
        JOptionPane.showMessageDialog(null, "Salir");
    }
}
