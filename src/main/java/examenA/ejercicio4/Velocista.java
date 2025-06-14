package examenA.ejercicio4;

import java.util.Random;

public class Velocista extends Ciclista {

    private double potenciaPromedio; /* Atributo que define la potencia promedio de un velocista */
    private double velocidadPromedio; /* Atributo que define la velocidad promedio de un velocista */


    public Velocista(String nombre, String pais, int identificador, double potenciaPromedio, double velocidadPromedio) {
        super(nombre, pais, identificador);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocista [potenciaPromedio=" + potenciaPromedio + ", velocidadPromedio=" + velocidadPromedio + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     * @return Un valor String con el texto “Es un velocista”
     */
    protected String imprimirTipo() {
        return "Es un velocista";
    }



    @Override
    public void calcularTiempoParcial() {
        Random random = new Random();
        double tiempoParcial = random.nextDouble(20, 40);
        tiempoParcial += this.velocidadPromedio * 5;
        tiempoParcial -= this.potenciaPromedio * 2;
        setTiempoParcial(tiempoParcial);

        this.tiempoAcumulado += tiempoParcial;
    }



}