package ExamenProgramacion.ej1;

public class Portero extends Jugador {

    int golesRecividos = 0;
    int penalesParados = 0;

    public Portero(String n, String d, int p, int g, int a, int r, int golesRecividos, int penalesParados) {
        super(n, d, p, g, a, r);
        this.golesRecividos = golesRecividos;
        this.penalesParados = penalesParados;
    }

    public Portero(int golesRecividos, int penalesParados) {
        this.golesRecividos = golesRecividos;
        this.penalesParados = penalesParados;
    }

    public int getGolesRecividos() {
        return golesRecividos;
    }

    public void setGolesRecividos(int golesRecividos) {
        this.golesRecividos = golesRecividos;
    }

    public int getPenalesParados() {
        return penalesParados;
    }

    public void setPenalesParados(int penalesParados) {
        this.penalesParados = penalesParados;
    }


    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Goles recividos: " + golesRecividos);
        System.out.println("Penales parados: " + penalesParados);
        System.out.println();

    }

    @Override
    public String toString() {
        return "Portero{" +
                "golesRecividos=" + golesRecividos +
                ", penalesParados=" + penalesParados +
                "} " + super.toString();
    }
}
