/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero0;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class Cajero0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String globalUsuario = "matias"; // usuario por defecto
        String globalPass = "mati34"; // contraseña por defecto

        double saldoGlobal = 1000;  //saldo en el cajero del usuario

        int intentosGloblal = 0; // cantidad de intentos para ingresar 3
        int banderaGlobal = 0; //el programa sale cuando esta en cero (0)
        // si ingresamos bien entra con uno (1)

        String cNombre;
        String cPass;

        //validacion
        do {
            cNombre = JOptionPane.showInputDialog(null, "Ingrese usuario");         //ingresamos un usuario 
            cPass = JOptionPane.showInputDialog(null, "Ingrese su contraseña");     //colocamos contraseña

            //comparamos los datos ingresados con los que predeterminamos 
            if (cNombre.equals(globalUsuario) && cPass.equals(globalPass)) {

                banderaGlobal = 1;

            } else {
                JOptionPane.showMessageDialog(null, "Datos no validos");    //si no esta bien sale con bandera 0
                intentosGloblal = intentosGloblal + 1;            //cantidad de intentos 
                banderaGlobal = 0;

            }

        } while (banderaGlobal != 1 && intentosGloblal != 3); //con esto salimos y procedemos a ingresar si esta bien

        switch (banderaGlobal) {
            case 0:
                JOptionPane.showMessageDialog(null, "Regrese dentro de las 24 horas\n"
                        + "Por ingresar más de tres veces el usuario o contraseña incorrecta");
                break;
            case 1:

                Menu(saldoGlobal);      //abrimos un subprograma con la opcion menu

                break;

            default:

        }

    }
    //el subprograma menu 

    public static void Menu(double pSaldoG) {
        int intentosLocal = 0; // cantidad de intentos para ingresar 3
        int banderaLocal = 0; //el programa sale cuando esta en cero (0)
        // si ingresamos bien entra con uno (1)
        
        int salir = 1;
        int opcionLocal;

        double extraccionLocal;
        //declaramos tantos las variables como los String para el menu
        String cOpcionLocal;

        String cExtraccionLocal;

        //generamos un ciclo para el menu
        do {
            cOpcionLocal = JOptionPane.showInputDialog(null, "Menu\n"
                    + "1- Consulta de Saldo\n"
                    + "2- Deposito\n"
                    + "3- Extraccion\n"
                    + "4- Salir");
            opcionLocal = Integer.parseInt(cOpcionLocal);

            //abrimos un Switch para cada caso
            switch (opcionLocal) {
                case 1:             //Consulta de saldo
                    JOptionPane.showMessageDialog(null, "Su saldo es \n" + pSaldoG);
                    break;
                case 2:             //Realizamos el deposito
                    JOptionPane.showMessageDialog(null, "Su saldo es \n" + pSaldoG);
                    //variables declaradas para calcular el deposito
                    double depoLocal;
                    double deposito;
                    String cDeposito;

                    cDeposito = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar");
                    deposito = Double.parseDouble(cDeposito);
                    //la variable depoLocal es la sumatoria para esta operacion
                    depoLocal = pSaldoG + deposito;
                    JOptionPane.showMessageDialog(null, "Se realizo un deposito de \n"
                            + "$ " + deposito);
                    JOptionPane.showMessageDialog(null, "Su saldo es \n" + depoLocal);
                    break;
                case 3:             //Realizamos la extraccion

                    JOptionPane.showMessageDialog(null, "Su saldo es \n"
                            + "$ " + pSaldoG);
                    //variables declaradas para la extraccion
                    
                    double extraccion = 10;     //Inicializamos la variable en 10 para que no pueda sacar menos 
                    double extLocal;
                    String cExtraccion;

                    //pedimos el monto a retirar
                    cExtraccion = JOptionPane.showInputDialog(null, "Ingrese el monto a retirar con multiplos de 10");
                    extraccion = Double.parseDouble(cExtraccion);
                    
                    do {    //Con la funcion Do While Realizamos un repetidor si ingresa la contraseña mal para 
                           //darle 3 intentos y que salga
                                
                        //validacion para extraccion
                        String globalPass = "mati34"; // contraseña por defecto    
                        String cPass;
                        cPass = JOptionPane.showInputDialog(null, "Ingrese su contraseña"); //pide nuevamente la contraseña para verificar datos

                        //abrimos un if-else para que no podamos sacar mas de 1000 y controlar los Datos
                        if (cPass.equals(globalPass) && extraccion <= 1000 && extraccion % 10 == 0) {
                            
                            //utilizamos un multiplo de 10 para la extraccion
                            //la variable extLocal es la resta para esta operacion
                            
                            extLocal = pSaldoG - extraccion;
                            JOptionPane.showMessageDialog(null, "Su Saldo es  \n"
                                    + "$ " + extLocal);

                            //Verificacion Aprobada
                            banderaLocal = 1;
                        } else {
                            //Si ingresa un dato no correcto 
                            JOptionPane.showMessageDialog(null, "Datos invalidos");
                            
                            //cantidad de intentos 
                            intentosLocal = intentosLocal + 1;            
                            
                            //verificacion nula
                            banderaLocal = 0;       
                        }
                    } while (banderaLocal != 1 && intentosLocal != 3); // condicion para que sea realizado la salida

                        //Mensaje con Advertencia sobre los intentos
                    JOptionPane.showMessageDialog(null, "Regrese dentro de las 24 horas\n"
                    + "Por ingresar más de tres veces la contraseña incorrecta");

                    break;
                case 4:         //Para poder salir del cajero
                    
                    //Pedimos al usuario que desea realizar
                    String cSalir;

                    cSalir = JOptionPane.showInputDialog(null, "Seguro que desea salir \n"
                            + "1- Si\n"
                            + "2- No\n");
                    salir = Integer.parseInt(cSalir);

                default:
            }
        } while (opcionLocal != 4 || salir != 1);        // condicion para salir
        
        //Mensaje Agradeciendo su visita
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros cajeros");
    }
}
