package Pista;

public class MarianoMain {

    public static void main(String[] args) {

        Peaje peaje = new Peaje("Vilaboa", "PO");
        Coche coche = new Coche("1234ABC");
        Moto moto = new Moto("5678DEF");
        Camion camion = new Camion("9101GHI", 3);

        peaje.addVehiculo(coche);
        peaje.addVehiculo(moto);
        peaje.addVehiculo(camion);

        peaje.calcularPeaje(coche);
        peaje.calcularPeaje(moto);
        peaje.calcularPeaje(camion);

        System.out.println(coche);
        System.out.println(moto);
        System.out.println(camion);



    }
}
