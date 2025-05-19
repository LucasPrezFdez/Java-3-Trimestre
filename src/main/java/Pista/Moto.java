package Pista;

public class Moto extends Vehiculo {

    public static double valorPeaje = 4.53;

    public Moto(String placa) {
        super(placa);
    }

    public static double getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(double valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "valorPeaje=" + valorPeaje +
                ", placa='" + placa + '\'' +
                "} " + super.toString();
    }
}
