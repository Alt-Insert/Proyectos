/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerov3;
//utilizamos los import correspondiente a los metodos empleados
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author macbook
 */
public class Cajerov3 {

    /*
    Realizamos una busqueda dentro de la matriz de 
    letras que la misma fue por un random
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);//utilizamos Scanner y su importacion para manipular el teclado 
        //la variable a utilizar es un char 

        /*
        

        */
        char matriz[][] = new char[3][3];
        int x = 0;
        Random rnd = new Random();

        //llenamos nuestra matriz ulizando un for 
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                x = (rnd.nextInt(90));//ucumulador
                if (x >= 65 && x <= 90) {//condicion para mostrar las letras del codigo ASCII
                    matriz[filas][columnas] = (char) x;
                } else {
                    columnas = columnas - 1;
                }
            }
        }//cValor = JOptionPane.showInputDialog(null,"Ingrese cinco valores");
            
        System.out.println();//damos un enter para salto de linea
        
        System.out.println("---Esta es nuestra matriz");//para mostrar la matriz
        
        for (int filas = 0; filas < matriz.length; filas++) {//utilizamos un for para la muestra
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.print(matriz[filas][columnas] + "" + "\t");
            }
            System.out.println();//damos un enter para el salto de linea y que el codigo quede ordenado al mostrar
        }
        System.out.println("---Digite la letra a buscar---");//preguntamos sobre la letra a buscar
        
        /*
        Realizamos un parseo de string a char para 
        la busqueda en forma de coordenadas
        */
        String buscar = in.nextLine();
        char Let = buscar.charAt(0);
        String coordenadas = "";

        //La busqueda es de manera iterativa
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (matriz[filas][columnas] == Let) {
                    coordenadas += "[" + filas + "," + columnas + "]" + "\n";
                    //'\n' me permite dar enter (saltos de linea) dentro de la cadena;
                }
            }
        }
        //condicion para que nos muestre si se encuentra o no la letra
        
        if (coordenadas.equals("")) {
            System.out.println("El valor " + buscar + " no existe en la matriz--");
        } else {
            System.out.println("El valor " + buscar + " esta en la siguiente coordenada.");
            System.out.print(coordenadas);
        }
    }
}
                    
                    
