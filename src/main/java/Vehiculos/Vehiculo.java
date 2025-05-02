package Vehiculos;

public abstract class Vehiculo {

    int velocidadActual;
    int velocidadMax;

    public Vehiculo(int velocidadActual, int velocidadMax) {
        this.velocidadActual = velocidadActual;
        this.velocidadMax = velocidadMax;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidadActual=" + velocidadActual +
                ", velocidadMax=" + velocidadMax +
                '}';
    }

    abstract void acelerar(int velocidad);

    abstract void frenar(int velocidad);

}
