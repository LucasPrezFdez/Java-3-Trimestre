package ParaVer.ExamenA.ejercicio4;

public abstract class Ciclista {
    protected String nombre;
    protected double tiempoAcumulado;

    public Ciclista(String nombre) {
        this.nombre = nombre;
        this.tiempoAcumulado = 0.0;
    }

    public abstract void calcularTiempoParcial();

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public String getNombre() {
        return nombre;
    }
}
