package Vehiculos;

public class VehiculoAereo extends Vehiculo {

    public VehiculoAereo(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        // TODO Auto-generated constructor stub
    }

    void acelerar(int velocidad) {
        int vel = this.velocidadActual + velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad permitida");
        } else {
            this.velocidadActual = vel;
        }
    }

    void frenar(int velocidad) {
        int vel = this.velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("No puede ir a menos de 0 km/h");
        } else {
            this.velocidadActual = vel;
        }
    }

    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }

    void despegar() {
        System.out.println(this.getClass().getName() + " despegando...");
    }

    void aterrizar() {
        System.out.println(this.getClass().getName() + " aterrizando...");
    }

    void volar() {
        System.out.println(this.getClass().getName() + " volando...");
    }

}
