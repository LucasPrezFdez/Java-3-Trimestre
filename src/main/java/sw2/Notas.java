package sw2;

import java.util.ArrayList;

public class Notas {

    ArrayList<Double> listaNotas;

    public Notas() {
        listaNotas = new ArrayList<Double>();
    }

    double calcularPromedio() {
        double suma = 0;
        for (double listaNota : listaNotas) {
            suma += listaNota;
        }
        return (suma / listaNotas.size());
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    double calcularDesviacion() {
        double prom = calcularPromedio();
        double suma = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            suma += Math.pow(listaNotas.get(i) - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.size());
    }

    double calcularMenor() {
        double menor = listaNotas.getFirst();
        for (Double listaNota : listaNotas) {
            if (listaNota < menor) {
                menor = listaNota;
            }
        }
        return menor;
    }

    double calcularMayor() {
        double mayor = listaNotas.getFirst();
        for (Double listaNota : listaNotas) {
            if (listaNota > mayor) {
                mayor = listaNota;
            }
        }
        return mayor;
    }
}