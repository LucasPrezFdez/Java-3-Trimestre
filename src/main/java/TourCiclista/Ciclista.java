package TourCiclista;

public class Ciclista extends Equipo {

    protected int id;
    protected String nombre;
    protected double tiempoAcumulado = 0d;
    protected int posGeneral = 0;

    public Ciclista(String nombre, String pais, int identificador, String nombre1) {
        super(nombre, pais);
        this.id = identificador;
        this.nombre = nombre1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
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
                "} " + super.toString();
    }
}
