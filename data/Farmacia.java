package data;

public class Farmacia {
    public String malestar;
    public String medicamento;
    public int cantidad;

    public void abreFarmacia() {
        System.out.println("La Farmacia se encuentra abierta");
    }// Cuando el metodo es Void es no tipado

    public String mayorEdad (String edad) {
        if (edad == "Mayor de 18") {
            return " No se le pueden vender medicamentos ";
        } else {
            return " Si se le puede vender medicamentos ";
        }
    }
}
