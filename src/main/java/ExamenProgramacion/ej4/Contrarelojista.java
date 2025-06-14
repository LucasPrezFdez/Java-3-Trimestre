package ExamenProgramacion.ej4;

import java.util.Random;

public class Contrarelojista extends Ciclista {

    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMáxima;

    public Contrarelojista(String nombre, String pais, int identificador, double velocidadMáxima) {
        super(nombre, pais, identificador);
        this.velocidadMáxima = velocidadMáxima;
    }

    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }


    @Override
    public String toString() {
        return super.toString()+"\nContrarelojista [velocidadMáxima=" + velocidadMáxima + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     * @return Un valor String con el texto “Es un constrarrelojista”
     */
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }


    @Override
    public void calcularTiempoParcial() {
        super.calcularTiempoParcial();
        tiempoAcumulado += 2.5* velocidadMáxima;
    }
}