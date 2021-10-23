package data;

public class Taller {
    public String piezas;
    public String reparacion;
    public String nombreDueño;

    public void disponibilidad() {
        System.out.println("El taller cuenta con espacios libres");
    }

    public String diaEntrada(String dia) {
        if (dia == "Lunes") {
            return " Su carro ya se encuentra reparado";
        } else {
            return " Su carro aún no esta listo ";
        }


    }
}
