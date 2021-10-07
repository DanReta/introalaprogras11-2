package data;
import javax.swing.JOptionPane;
public class Tarea02 {
    public static void main(String[] args)
    {
        String nombre= JOptionPane.showInputDialog("Escriba su nombre");
        int años=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite cuantos años tiene de laborar aquí:"));
        int horas=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite las horas laboradas por semana:"));
        float precioHora= Float.parseFloat(JOptionPane.showInputDialog("Digite el precio pagado por hora: "));

        precioHora*=horas;
        float bono = 0;
        float deduccion=0;
        if (años>=10)
        {
            bono= precioHora*20f/100f;
        }
        if (bono>=1000f && bono <=2000f)
        {
        float deduccion -= bono*10f/100f;
        }
        else if (bono <=2000f)
        {
        float deduccion =- bono*15f/100f;
        }

    String mensaje= "Estimado"+nombre+"su salario mensual se desglosa de la siguiente manera.";
    mensaje+= "Salario Neto: " +bono+ "\n";
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
}


