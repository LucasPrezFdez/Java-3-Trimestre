package Pista;

public class Camion extends Vehiculo{

    static double valorPeaje = 3.67;
    int numEjes;

    public Camion(String placa, int numEjes) {
        super(placa);
        this.numEjes = numEjes;
    }

    public double getValorPeaje() {
        return valorPeaje*this.numEjes;
    }

    public static void setValorPeaje(double valorPeaje) {
        Camion.valorPeaje = valorPeaje;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "valorPeaje=" + valorPeaje +
                ", numEjes=" + numEjes +
                ", placa='" + placa + '\'' +
                "} " + super.toString();
    }
}
