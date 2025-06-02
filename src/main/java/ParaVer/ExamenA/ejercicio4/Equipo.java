package ParaVer.ExamenA.ejercicio4;

public class Equipo {
    private String nombre;
    private Ciclista[] ciclistas;

    public Equipo(String nombre, Ciclista[] ciclistas) {
        this.nombre = nombre;
        this.ciclistas = ciclistas;
    }

    public String getNombre() {
        return nombre;
    }

    public Ciclista[] getCiclistas() {
        return ciclistas;
    }

    public double getTiempoTotalEquipo() {
        double total = 0;
        for (Ciclista c : ciclistas) {
            total += c.getTiempoAcumulado();
        }
        return total;
    }
}
