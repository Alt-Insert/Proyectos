/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int busqueda;       //declaramos la variable busqueda
        int numeroSw;       //declaramos la variable numeroSw

        String cNumeroSw;       //declaramos la cadena de numeroSw
        
        //los array de vectores con la cantidad de valores
        
        int[] vectorA = new int[4];
        int[] vectorB = new int[4];
        int[] vectorC = new int[4];

        do {        //utilizamos un do para el menu

            cNumeroSw = JOptionPane.showInputDialog(null, "MENU\n"
                    + "1- Cargar Vector A y Mostrarlo\n"
                    + "2- Cargar Vector B y Mostrarlo\n"
                    + "3- Sumar ambos Vectores en C\n"
                    + "4- Burbuja\n"
                    + "5- Mostar Vector Ordenado\n"
                    + "6- Busqueda Binaria\n"
                    + "7- Salir");
            numeroSw = Integer.parseInt(cNumeroSw);
            
            switch (numeroSw) {     //abrimos el Switch para el menu y a cada uno un subprograma
                case 1:

                    cargaMuestraVecA(vectorA);

                    break;
                case 2:

                    cargaMuestraVecB(vectorB);

                    break;
                case 3:

                    sumaVecAB(vectorA, vectorB, vectorC);

                    break;
                case 4:
                    
                    burbuja(vectorC);
                    
                    break;
                case 5:
                    
                    mostrarVecOrdenado(vectorC);
                    
                    break;
                case 6:
                    
                    busqueda = busquedaBinaria(vectorC, 40);
                    
                    if (busqueda == -1) {
                        JOptionPane.showMessageDialog(null, "No se encuetra el valor en el vector");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se encuentra en la posicion" + busqueda + 1);
                    }
                    break;
                case 7:
                    
                    System.out.println("salir");
                    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Accion no valida");        //si ingresamos un dato no valido
            }
        } while (numeroSw != 7);        //condicion de salida del menu

    }
            //subProgramas de Switch
    
    public static void cargaMuestraVecA(int vector[]) {     //caso 1 ingresamos los valores del Vector A
        
        String ValorA;
        
        for (int i = 0; i < vector.length; i++) {

            ValorA = JOptionPane.showInputDialog(null, "Ingrese valores para Vector A");
            vector[i] = Integer.parseInt(ValorA);

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Valores" + vector[i]);
            
        }
    }

    public static void cargaMuestraVecB(int vector[]) {     //caso 2  ingresamos los valores del Vector B

        String ValorB;

        for (int i = 0; i < vector.length; i++) {

            ValorB = JOptionPane.showInputDialog(null, "Ingrese valores para Vector B");
            vector[i] = Integer.parseInt(ValorB);

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Valores" + vector[i]);
        }
        System.out.println("Entre a la op 2");
    }

    public static void sumaVecAB(int vectorA[], int vectorB[], int vectorC[]) {     //caso 3 suma los valores de ambos vectores y lo guarda en Vector C
        
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println("Vector C: " + vectorC[i]);
        }
    }

    public static void burbuja(int vector[]) {      //caso 4 realiza un ordenamiento
        
        int aux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
        }
    }

    public static void mostrarVecOrdenado(int vector[]) {       //caso 5 muestra el resultado del ordenamiento
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector C: " + vector[i]);
        }
    }

    public static int busquedaBinaria(int vector[], int dato) {     //caso 6 busca el numero seleccionado
        
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;

    }
}

