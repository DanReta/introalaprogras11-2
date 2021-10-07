package data;

import javax.swing.JOptionPane;

public class semana03 {

    public static void main(String[] args) {
        /*

        for(int i = 10; i>-1; i--)
        {
            // i = 0 i = i+1 = 1 = 2 = 3

            System.out.println("Hola desde un for el ciclo es "+ i);

            // 0 Index Language, comienza a contar de 0
            // 0 1 2 3 4
            // 10 9 8
            // for(bloque de iniciacion;  condicion logica ; autoincremento)
            // punto y coma para determinar que finalice ese bloque ;
        }
     */
        /*
        for(int i = 10;i<5;i++)
        {
            // i = 0 i = i+1 = 1 = 2 = 3
            System.out.println("Hola desde un for el ciclo es "+ i);

        }

             //ejercicio 1
        for(int i =0 ;i < 8; i++){
            // i = 0 i = i+1 = 1 = 2 = 3

            System.out.println("Hola "+ i);
            // 0 Index Language
            // 0 1 2 3 4
        }

      */
        //Ciclo While
        int j = 0;
        while (j < 5) {
            System.out.println("Hola desde el while el valor es " + j);
            j++; // j = j + 1
        }

        // ejercicio 2

        /*
        int j = 0;
        while (j < 10)
        {
            System.out.println("Holaaa " + j);
            j++;
        }
        */
        //ejercicio 3
        /*
        int j = 0;
        while (j < 5) {
            System.out.println("@@@@@@@@@@ ");
            j++;
        */


        /*

        int tabla,multi;
        tabla = Integer.parseInt(JOptionPane.showInputDialog("Digite la tabla: "));
        for(int i=0; i<11;i++){
            multi = tabla*i;
            System.out.println(tabla+"x"+i+" = "+multi);
        }
 */
        /*
        //Ciclo Do While
        int k=0;
        do{
            System.out.println("Hola desde Do While");
            k++;
        }
        */

        //se escribo fori me va a poner esto = for (int i = 0; i < ; i++) {



         //nos sirve para recorrer objetos que tienen dos propiedades
        /*
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hola desde un for el ciclo anidado es: " + i);
            for (int j = 0; j < 1; j++) {
                System.out.println("Hola for anidado");
            }
        }

        ejercicio 4
         //nos sirve para recorrer objetos que tienen dos propiedades
        for (int i = 0; i <5 ;i++) {
            for (int j = 1; j < 1; j++) {
                System.out.println("@");
            }
            System.out.println("");

        }
        ejercicio 5
         //nos sirve para recorrer objetos que tienen dos propiedades
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(" @ ")
            }
            System.out.println(" ");


        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
        do {
            if (opcion == 1){
                System.out.println("Eligio la opcion 1");
                // JOptionPane
            } else if(opcion == 2){
                System.out.println("Eligio la opcion 2");
            } else if (opcion == 3){
                System.out.println("Eligio la opcion 3");
            }
        } while (opcion != 4);
        */
    }
}
