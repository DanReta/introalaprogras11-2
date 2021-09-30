package data;
import javax.swing.*;
public class Tarea {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escriba su nombre completo");
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite cuantos años tiene:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite las horas laboradas por semana:"));
        float precioHora = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio pagado por hora: "));

        float salario;
        salario = precioHora * horas;

        float deduccion;
        deduccion = salario * 9.34f / 100f;

        float salarioNeto;
        salarioNeto = salario - deduccion;

        String mensaje = "Estimado " + nombre + "su salario mensual se desglosa de la siguiente manera. ";
        mensaje += "\n"+ "Salario Bruto: " + salario + "\n" + "Deducciones " + deduccion + "\n" + "Salario Neto " + salarioNeto + "\n";
        {
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}


