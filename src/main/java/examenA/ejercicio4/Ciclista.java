package examenA.ejercicio4;

import java.util.Random;

public class Ciclista implements Comparable{

    protected int id;
    protected String nombre;
    protected double tiempoAcumulado = 0d;
    protected int posGeneral = 0;
    public double sumaTotal = 0;
    double tiempoParcial;

    public Ciclista(String nombre, String pais, int identificador) {
        this.id = identificador;
        this.nombre=nombre;
    }

    public double getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(double sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public double getTiempoParcial() {
        return tiempoParcial;
    }

    public void setTiempoParcial(double tiempoParcial) {
        this.tiempoParcial = tiempoParcial;
    }



    protected String imprimirTipo() {
        return "Ciclista Generico";
    }

    protected int getPosGeneral() {
        return this.posGeneral;
    }

    protected void setPosGeneral(int pos) {
        this.posGeneral = pos;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", timepo='" + tiempoParcial +
                ", tiempoAcumulado=" + tiempoAcumulado +
                ", posGeneral=" + posGeneral +
                "} " ;
    }

    @Override
    public int compareTo(Object o) {
        Ciclista c = (Ciclista) o;

        return Double.compare(getTiempoAcumulado(),c.getTiempoAcumulado());

    }

    public void calcularTiempoParcial() {
        Random random = new Random();
        tiempoParcial = random.nextDouble(20, 40);
        setTiempoParcial(tiempoParcial);
        this.tiempoAcumulado += tiempoParcial;
    }
}
