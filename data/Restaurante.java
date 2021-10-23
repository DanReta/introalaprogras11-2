package data;

public class Restaurante {
    public String ordenComida;
    public String refresco;
    public int personas;

    public void mesaApartada() {
        System.out.println("Usted tiene una mesa apartada");
    }

    public String numeroMesa(String mesa) {
        if (mesa == "6") {
            return "Correcto, esa es su mesa";
        } else {
            return "Incorrecto,su numero de mesa es 6";
        }
    }
}