package data;

import javax.swing.*;

public class Lec01 {

    public static void main(String[] args) {
        // Clase es un conjunto de codigo
// Variable espacio de memoria RAM en la cual se guarda un dato
// EF243555F Hola
// String
        String saludo = "Saludo"; // String nombre;
        Integer edad = 25;
        Float temperatura = 25.09F;
        Double salario = 25.000;
        Boolean verdadero = false;
        int edad2 = 26;
        float celsius = 26.04F;
        // todo numero flotante va con una F al final
        double salarioNeto = 25.000;
        boolean falso = false;
        char inicial = 'a';
        String apellido; //Variable no asignada, instanciada

        System.out.println("Hola mundo");
        // escribiendo sout aparace System.out.println()
        String nombre="Nabiry Retana Picado";
        int nEdad= 20;
        String direccion = "300 mts sur de la escuela de Ojo de Agua, Vuelta de Jorco";
        System.out.println(nombre+" "+nEdad+" "+direccion);

        //Ejercicio 2

        JOptionPane.showInternalMessageDialog(null, "Hola con JOption Pane");
        String direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        JOptionPane.showMessageDialog(null, direccion);

        //Ejercicio 3
        String nombre= JOptionPane.showInputDialog(null, "Digite su nombre");
        JOptionPane.showMessageDialog(null, nombre);
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        JOptionPane.showMessageDialog(null, edad);
        String direccion="400 mts sur de la escuela Ojo de Agua";

        //Ejercicio 4
        int miEdad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        int nombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nombre"));
        String laEdad = String.valueOf(miEdad);

        //Ejercicio 5
        int numUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        int numDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        int numTres = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        int numCuatro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        JOptionPane.showMessageDialog (null,numUno + numDos + numTres + numCuatro);



    }
}
