package data;

public class Huespedes {

    public String nombre;
    public int cedula;
    public String estadia;
    public int habitacion;

    public void solicitaComida(){
        System.out.println("El huesped solicita comida");
    }

    public void salida(){
        System.out.println("El huesped ha salido del hotel");
    }
}
