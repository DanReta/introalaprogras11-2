package com.company;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        // [ 25 ,  ,   ,   ] 4 Posiciones
        //   0   1   2   3 Indices
        // [ , , , , ] 5 Posiciones
        // Longitud 5 , 4
        // [ , ] Indice 0
        // [ 35, 40, 50 ] -> Numeros[0]
        /*

        //Me imprime la posicion 5
        int[] numeros = new int[5];
        numeros[0] = 35;
        numeros[1] = 36;
        numeros[2] = 37;
        numeros[3] = 38;
        numeros[4] = 39;
        numeros[5] = 40;



        //Ejercicio 1
        String[] nombre = new String[2];
        nombre[0] = "Juan";
        nombre[1] = "Luisa";

        //Me va a recorrer el arreglo
        // int es igul a 0 que es donde se empieza
        //mientras int sea menor a la longitud del arreglo entonces
        //ir incrementando

        for (int i =0; i< nombre.length; i++){
        //con esa i se comienza desde cero
            System.out.println(nombre[i]); }
            // 0 -> 35
            // 1 -> 36
            // 2 -> 37

            //Ejercicio 2
         float[] Valor= new float[3];
         Valor[0] = 4f;
         Valor[1] = 5f;
         Valor[2] = 6f;
         Valor[3] = 7f;
         for (int i =0; i< Valor.length; i++){
              System.out.println(Valor[i]);}

        String[]  name = new String[2];
        //pregunta
        for (int i =0; i< name.length; i++){
            name[i] = JOptionPane.showInputDialog("Ingrese el Nombre");
        }
        //imprime
        for (int i = 0; i<name.length; i++){
            System.out.println(name[i]);
        }

        //Ejercicio 3
        double[]  dato = new double[2];
        for (int i =0; i< dato.length; i++){
            double[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero"));
        }
        for (int i = 0; i<double.length; i++){
            System.out.println(double[i]);
        }

        //Areglo de dos posiciones, en cada una hay 2 datos
        //[ [] ,[] ] [0]
        // [ [ [ ], 50 ], [75,100 ] ]
        // [0][0][1] [0][1] [1][0] [1][1]

        int[][] numeros2= new int[2][2];
        //[ [,], [,] ]
        numeros2[0][0]=25;
        numeros2[0][1]=50;
        numeros2[1][0]=75;
        numeros2[1][1]=100;

        for (int i =0 i<numeros2.length; i++){
        // la longitud siempre va a hacer la misma, no va a cambiar "numeros2.lenght"
             for (int j=0 j<numeros2.lenght; j++){
             System.out.println(numeros2[i][j];
             }
         }
         //Pide los numeros
        Float[][] numerosFlotantes = new Float[2][2]
        for (int i = 0; i < numerosFlotantes.length; i++) {
            for (int j = 0; j < numerosFlotantes.length; j++) {
                numerosFlotantes[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su numero"));
                //
            }
        }
        //Recorre los numeros
        for (int i = 0; i < numerosFlotantes.length; i++) {
            for (int j = 0; j < numerosFlotantes.length; j++) {
                System.out.println(numerosFlotantes[i][j]);
            }
        }
        */
        double[][] numerosDouble = new double[5][5]
        for (int i = 0; i < numerosDouble.length; i++) {
            for (int j = 0; j < numerosDouble.length; j++) {
                numerosDouble[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su numero"));
                //
            }
        }
        //Recorre los numeros
        for (int i = 0; i < numerosDouble.length; i++) {
            for (int j = 0; j < numerosDouble.length; j++) {
                System.out.println(numerosDouble[i][j]);
            }


    }
}

