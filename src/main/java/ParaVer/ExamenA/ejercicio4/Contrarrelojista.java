package ParaVer.ExamenA.ejercicio4;

import java.util.Random;

public class Contrarrelojista extends Ciclista {
    private int velocidadMaxima;

    public Contrarrelojista(String nombre, int velMax) {
        super(nombre);
        this.velocidadMaxima = velMax;
    }

    public void calcularTiempoParcial() {
        Random rand = new Random();
        double tiempo = 20 + rand.nextDouble() * 20;
        tiempo += 4 * velocidadMaxima;
        tiempoAcumulado += tiempo;
    }
}
