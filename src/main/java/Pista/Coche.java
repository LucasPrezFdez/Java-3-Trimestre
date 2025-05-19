package Pista;

public class Coche extends Vehiculo{

    static double valorPeaje = 10.32;

    public Coche(String placa) {
        super(placa);
    }

    public static double getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(double valorPeaje) {
        Coche.valorPeaje = valorPeaje;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "placa='" + placa + '\'' +
                "Peaje="+valorPeaje+"}" ;
    }
}
