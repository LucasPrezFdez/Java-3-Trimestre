package ParaVer.ExamenA.ejercicio4;

import java.util.Random;

public class Velocista extends Ciclista {
    private int velocidadPromedio;
    private int potenciaPromedio;

    public Velocista(String nombre, int vel, int pot) {
        super(nombre);
        this.velocidadPromedio = vel;
        this.potenciaPromedio = pot;
    }

    public void calcularTiempoParcial() {
        Random rand = new Random();
        double tiempo = 20 + rand.nextDouble() * 20;
        tiempo += 5 * velocidadPromedio - 2 * potenciaPromedio;
        tiempoAcumulado += tiempo;
    }
}
