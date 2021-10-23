package data;

public class Main {

    public static void main(String[] args) {
        // rendimiento
        // legibilidad
        // reutilizacion
        // Objetos, Funcional, Eventos
        // Sequencial Recursivo
        Fabrica miFabrica = new Fabrica();
        miFabrica.abreFabrica();
        System.out.println();

        Fabrica fabricadeClavos = new Fabrica();
        System.out.println();
        System.out.println(fabricadeClavos.nombreDeEncargado(""));
/*
        Taller elTaller = new Taller();
        elTaller.disponibilidad();
        System.out.println();
        Taller tallerDos= new Taller();
        System.out.println(tallerDos.diaEntrada("Lunes") );

        Farmacia farmaciaAla= new Farmacia();
        System.out.println(farmaciaAla.abreFarmacia(""));
        System.out.println(farmaciaAla.mayorEdad(" Mayor de 18 " ));

        Restaurante restauraNte= new Restaurante();
        System.out.println(restauraNte.mesaApartada());
        System.out.println(restauraNte.numeroMesa("6"));

*/
    }
}
