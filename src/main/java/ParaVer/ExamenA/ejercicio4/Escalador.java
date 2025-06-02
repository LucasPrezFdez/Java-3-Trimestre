package ParaVer.ExamenA.ejercicio4;

import java.util.Random;

public class Escalador extends Ciclista {
    private int aceleracionPromedio;
    private int gradoRampa;

    public Escalador(String nombre, int acel, int grado) {
        super(nombre);
        this.aceleracionPromedio = acel;
        this.gradoRampa = grado;
    }

    public void calcularTiempoParcial() {
        Random rand = new Random();
        double tiempo = 20 + rand.nextDouble() * 20;
        tiempo += 3 * aceleracionPromedio - 5 * gradoRampa;
        tiempoAcumulado += tiempo;
    }
}
