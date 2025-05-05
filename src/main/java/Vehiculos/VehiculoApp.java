package Vehiculos;

public class VehiculoApp {

    public static void main(String[] args) {

        Terrestre camioneta = new Terrestre(100, 250);
        System.out.println("Terrestre --> camioneta: " + camioneta);

        camioneta.acelerar(50);
        System.out.println("Nueva velocidad: ");
        System.out.println(camioneta);

        // ------------------------------------------------------------

        Acuatico velero = new Acuatico(50, 100);
        System.out.println("Acuatico --> velero: " + velero);

        System.out.println("Revoluciones del motor: " + velero.calcularRevolucionesMotor(100, 50));
        velero.recomendarVelocidad(90);
        System.out.println(velero);

        // ------------------------------------------------------------

        VehiculoAereo avion = new VehiculoAereo(200, 800);
        System.out.println(avion);
        avion.acelerar(400);

        avion.despegar();
        System.out.println(avion);

        avion.volar();
        System.out.println(avion);

        avion.frenar(100);
        System.out.println(avion);

        avion.aterrizar();
        System.out.println(avion);

    }
}
