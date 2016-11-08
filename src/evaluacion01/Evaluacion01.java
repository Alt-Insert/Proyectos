/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion01;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class Evaluacion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaramos los arrays
        int[] vectorA = new int[4];
        //vectorA = {5,32,4,1}

        int[] vectorB = new int[4];
        //vectorB = {56,6,70,7}

        int[] vectorC = new int[4];

        int[] vectorD = new int[4];
        
        //declaramos la matriz 
        int[][] matriz = new int[4][4];

        int numeroSw;   //declaramos un int para el menu

        int busqueda;   //utilizamos una busqueda binaria

        String cNumeroSw;   //el mismo int para el menu esta en forma de String 

        //declaramos un menu con las opciones
        do {//usamos el int del menu y lo parseamos
            cNumeroSw = JOptionPane.showInputDialog(null, "Menu\n"
                    + "1- Cargar vector A y mostrar por consola\n"
                    + "2- Cargar vector B y mostrar por consola\n"
                    + "3- Sumar vector A y B y colocar resultado en C\n"
                    + "4- Cargar Matriz cuadrada de 4x4\n"
                    + "5- Sumar elementos de la Diagonal Principal en vector D\n"
                    + "6- Aplicar burbuja en vector D\n"
                    + "7- Realizar busqueda binaria de elementos 40\n"
                    + "8- Salir");
            numeroSw = Integer.parseInt(cNumeroSw);
            
            //abrimos un Switch para cada caso
            switch (numeroSw) {
                case 1:
                    cargarVectorA(vectorA);    //utilizamos un subprograma pra cargar el vector A
                    break;
                case 2:
                    cargarVectorB(vectorB);   //utilizamos un subprograma para cargar el vector B
                    break;
                case 3:
                    sumaVec(vectorA, vectorB, vectorC);      //utilizamos un subprograma para la suma de los vectores A + B
                    break;
                case 4:
                    matriz(matriz);     //utilizamos un subprograma para cargar la matriz de 4x4
                    break;
                case 5:
                    diagonalPrinc(matriz, vectorD);   //utilizamos un subprograma para cargar la Diagonal Principal
                    break;
                case 6:
                    burbuja(vectorD);       //utilizamos un subprograma para cargar la burbuja
                    break;
                case 7:
                    busqueda = busquedaBinaria(vectorD, 40);        //utilizamos un subprograma para la busqueda binaria

                    if (busqueda == -1) {   //condicionamos un if para que nos muestre si se encuentra el resultado o no
                        JOptionPane.showMessageDialog(null, "No se encuetra el valor en el vector");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se encuentra en la posicion" + busqueda + 1);
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "salir");   //ventana mostrando salida
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Accion no valida");     //condicion cuando no es correcto la tecla
            }

        } while (numeroSw != 8); //condicion para salir del menu

    }//abrimos un subprograma

    public static void cargarVectorA(int vector[]) {   //subprograma vectorA cargar datos

        //vectorA = {5,32,4,1} valores para cargar
        String ValorA;

        for (int i = 0; i < vector.length; i++) {   //usamos un for para cargar los valores del vector A

            ValorA = JOptionPane.showInputDialog(null, "Ingrese valores para Vector A");
            vector[i] = Integer.parseInt(ValorA);

        }
        for (int i = 0; i < vector.length; i++) {   //utilizamos un for para mostrar los valores en un Sout del vector A
            System.out.println("Valores" + vector[i]);
        }
    }

    public static void cargarVectorB(int vector[]) {   //subprograma vectorB cargar datos

        //vectorB = {56,6,70,7} valores para cargar
        String ValorB;

        for (int i = 0; i < vector.length; i++) {       //usamos un for para cargar los valores del vector B

            ValorB = JOptionPane.showInputDialog(null, "Ingrese valores para Vector B");
            vector[i] = Integer.parseInt(ValorB);

        }
        for (int i = 0; i < vector.length; i++) {       //utilizamos un for para mostrar los valores en un Sout del vector B
            System.out.println("Valores" + vector[i]);
        }
    }

    public static void sumaVec(int vectorA[], int vectorB[], int vectorC[]) { //subprograma vectorC el resultado de vector A y vector B

        String mostrar = "\t";  //utilizamos un String para mostrar el resultado en un Jop y lo condicionamos con \t para que muestre ordenado

        for (int i = 0; i < vectorC.length; i++) {      //usamos un for para cargar la suma de los valores del vector A y B
            vectorC[i] = vectorA[i] + vectorB[i];
            //JOptionPane.showMessageDialog(null,"Vector C: " + vectorC[i]);
            mostrar = mostrar + vectorC[i];
        }
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println("Vector D: " + vectorC[i]);
        }
        JOptionPane.showMessageDialog(null, mostrar);   //mostramos el valor del vector C
    }

    public static void matriz(int[][] matriz) {     //subprograma matriz cargar datos

        int valor;  //declaramos la variable para los valores

        String cValor;  //usamos un String para valores

        for (int i = 0; i < matriz.length; i++) {   //utilizamos un for para la matriz 
            for (int j = 0; j < matriz.length; j++) {   //utilizamos un for para la matriz

                //nos muestra la matriz con el valor del parseo
                cValor = JOptionPane.showInputDialog(null, "Valor de la Matriz");
                valor = Integer.parseInt(cValor);
                matriz[i][j] = valor;
            }
        }
        //3,67,67,0,28,89,28,1,77,31,12,27,19,14,13,10 valores de la matriz
    }

    public static void diagonalPrinc(int matriz[][], int vector[]) {    //subprograma para la diagonal Principal y ser guardada en vector D
        int sumaDia = 0;    //variable para la suma 

        for (int i = 0; i < matriz.length; i++) {   //for para la suma de la diagonal
            sumaDia = sumaDia + matriz[i][i];

        }
        JOptionPane.showMessageDialog(null, "Valor Diagonal principal: " + sumaDia);
        System.out.println("Valor Diagonal principal: " + sumaDia);

        //for para la carga de la matriz al vectorD
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    vector[i] = matriz[i][j];
                } else {
                }
            }
        }
        //for para mostrar el valor de vectorD y poder imprimirlo
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector D: " + vector[i]);
        }
    }

    public static void burbuja(int vector[]) {      //subprograma para la burbuja

        int aux;    //declaramos una variable para el metodo burbuja

        //utilizamos dos for para el metodo de ordenamiento
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        //utilizamos un for para mostrar el ordenamiento
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector D: " + vector[i]);
        }
    }

    public static int busquedaBinaria(int vector[], int dato) {     //subprograma para la busqueda binaria

        //declaramos las variables para la busqueda Binaria
        int n = vector.length;
        int centro;
        int inf = 0;
        int sup = n - 1;

        //condicionamos un While para la busqueda 
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            //utilizamos un if como condicion para la busqueda deseada
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;  //colocamos un return para la salida
    }
}
