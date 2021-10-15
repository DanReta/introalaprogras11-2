package data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args)
    {

    }

    static void ejercicioAutomovil()
    {
        // Instancia Clon de un Objeto
        Automovil toyota = new Automovil();
        toyota.motor = "2500";
        toyota.modelo = "Land Cruiser";
        toyota.puertas = 4;
        toyota.pasajeros = 7;

        System.out.println(toyota.motor);
        System.out.println(toyota.modelo);
        toyota.encender();
        toyota.apagar();
        boolean agua = toyota.tieneAgua();
        if (agua) {
            System.out.println("Tiene agua");
        } else {
            System.out.println("No tiene agua");
        }
    }

    static void ejercicioHuesped()
    {
        Huespedes cliente = new Huespedes();
        cliente.nombre = "Carlos Jimenez";
        cliente.cedula = 115664724;
        cliente.estadia = "Del 30 al 3 de noviembre";
        cliente.habitacion = 345;

        System.out.println(cliente.nombre);
        System.out.println(cliente.habitacion);
        cliente.solicitaComida();
        cliente.salida();
    }

    static void ejercicioGrupos()
    {
        Grupos personas= new Grupos();
        personas.nombre ="Alejandra Gonzales";
        personas.horario= "De 11:00 am a 4:00pm ";
        personas.salon=567;

        System.out.println(personas.nombre);
        System.out.println(personas.salon);
        System.out.println(personas.horario);
        personas.salonGrande();
        personas.salonPequeño();

    }


}
