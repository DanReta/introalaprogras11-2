package data;
import javax.swing.JOptionPane;
public class Lec02 {

    public static void main(String[] args) {
	// write your code here
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        if (nota >= 80){
            JOptionPane.showMessageDialog(null, "El estudiante Aprobo");
        } else {
            JOptionPane.showMessageDialog(null,"El estudiante no Aprobo");
        }

        /*
        int numero = 25;
        int elSegundoNumero = 31;
        if (numero == 25 && elSegundoNumero ==30){ // Verdadero Falso  || Verdadero and &&
            System.out.println("los numeros son iguales");
         */
        /*
         int edad;
         edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite su edad"));
                 if (edad>= 18) {
                     JOptionPane.showMessageDialog(null, "Usted puede votar");
                 } else{
                     JOptionPane.showMessageDialog(null, "Usted no puede votar");
                 }
        */
        /*
        int provincia;
        provincia= Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite su número de provincia"));
         if (provincia==1) {
             JOptionPane.showMessageDialog(null,"Usted pertenece a la provincia de San Jose ");
        } else if (provincia==2){
             JOptionPane.showMessageDialog(null,"Usted pertenece a la provincia de Alajuela");
        }else if (provincia==3) {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la provincia de Heredia");
        }else if (provincia==4) {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la provincia de Cartago");
        }else if (provincia==5) {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la provincia de Guanacaste");
        }else if (provincia==6) {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la provincia de Puntarenas");
        }else
        {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la provincia de Limón");
        }
        */
        /*
        int dia;
        dia=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el dia de la semana."));
        if(dia==6 || 7 )
        {
            JOptionPane.showMessageDialog(null,"El dia es libre");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El dia es laboral");
        }
        /*
        int casa;
        casa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Casa"));
        if (casa % 2 == 0){
            System.out.println("Su casa es la numero" + casa + "Y los impuestos se pagan trimestralmente");
        } else {ystem.out.println("Los impuestos se pagan semetralmente");
        }
         */
        /*
        switch (casa) {
            case 0:
                System.out.println("La casa 0");
                break;
            case 1:
                System.out.println("La
            Scasa 1");
                break;
            default:
                System.out.println("Por defecto");


                switch (casa) {
                    case 0 -> System.out.println("La casa 0");
                    case 1 -> System.out.println("La casa 1");
                    default -> System.out.println("Por defecto");
                }
         */
        }
    }





