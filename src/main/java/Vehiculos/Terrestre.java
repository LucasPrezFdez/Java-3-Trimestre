package Vehiculos;

public class Terrestre extends Vehiculo implements Motor {

    public Terrestre(int velocidadActual, int velocidadMax) {
        super(velocidadActual, velocidadMax);
    }

    @Override
    void acelerar(int velocidad) {
        int vel = this.velocidadActual + velocidad;
        if (vel > velocidadMax) {
            System.out.println("Supera la velocidad maxima");
        } else {
            this.velocidadActual = vel;
        }
    }

    @Override
    void frenar(int velocidad) {
        int vel = this.velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            this.velocidadActual = vel;
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

}
