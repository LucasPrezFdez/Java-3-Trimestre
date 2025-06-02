package ParaVer.ExamenA.ejercicio3;

import java.io.Serializable;

public abstract class Inmueble implements Impuesto, Serializable {
    protected String direccion;
    protected int area;
    protected int habitaciones;
    protected int banos;

    public Inmueble(String direccion, int area, int habitaciones, int banos) {
        this.direccion = direccion;
        this.area = area;
        this.habitaciones = habitaciones;
        this.banos = banos;
    }

    public abstract double valorMetroCuadrado();

    public double calcularValorVenta() {
        return area * valorMetroCuadrado();
    }

    public String resumen() {
        return this.getClass().getSimpleName() + " en " + direccion + " - $" + calcularValorVenta();
    }
}
