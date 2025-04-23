package TourCiclista;

import java.util.Random;

public class Ciclista implements Comparable{

    protected int id;
    protected String nombre;
    protected double tiempoAcumulado = 0d;
    protected int posGeneral = 0;

    public Ciclista(String nombre, String pais, int identificador) {
        this.id = identificador;
        this.nombre=nombre;
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

    public void correr() {
        Random random = new Random();
        double t = random.nextDouble(50, 70);
        this.setTiempoAcumulado(t);
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
                ", tiempoAcumulado=" + tiempoAcumulado +
                ", posGeneral=" + posGeneral +
                "} " ;
    }

    @Override
    public int compareTo(Object o) {
        Ciclista c = (Ciclista) o;

        return Double.compare(getTiempoAcumulado(),c.getTiempoAcumulado());

    }
}
