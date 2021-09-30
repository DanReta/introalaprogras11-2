package data;
import javax.swing.*;
public class Tarea {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escriba su nombre completo");
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite cuantos años tiene:"));
        int dias= Integer.parseInt(JOptionPane.showInputDialog("Por favor digite los dias laborados por semana:"));
        float precioDia = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio pagado por dia: "));

        float salario;
        salario = precioDia * dias;

        float mensual;
        mensual= salario * 4;

        float deduccion;
        deduccion = mensual * 9.34f / 100f;

        float salarioNeto;
        salarioNeto = salario - deduccion;

        String mensaje = "Estimado " + nombre + " su salario mensual se desglosa de la siguiente manera. ";
        mensaje += "\n"+ "Salario Bruto: " + salario + "\n" + "Deducciones: " + deduccion + "\n" + "Salario Neto: " + salarioNeto + "\n";
        {
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}


