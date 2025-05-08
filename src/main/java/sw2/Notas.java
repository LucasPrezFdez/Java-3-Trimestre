package sw2;

import java.util.Arrays;

public class Notas {

    double[] listaNotas; /* Atributo que identifica un array de notas de tipo double */

    public Notas() {
        listaNotas = new double[5]; // Crea un array de 5 notas
    }

    double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) { // Se recorre el array
            suma = suma + listaNotas[i]; // Suma las notas del array
        }
        return (suma / listaNotas.length);
    }

//    double calcularPromedio() {
//        return Arrays.stream(listaNotas).average().orElse(0.0);
//    }

    public double[] getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(double[] listaNotas) {
        this.listaNotas = listaNotas;
    }

    double calcularDesviacion() {
        double prom = calcularPromedio(); /* Invoca el método para calcular el promedio */
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            // Aplica fórmula para la sumatoria de elementos
            suma += Math.pow(listaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.length); /* Retorna el cálculo final de la desviación */
    }

    double calcularMenor() {
        double menor = listaNotas[0]; /* Define una variable como la nota menor */
        for (int i = 0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] < menor) {
                menor = listaNotas[i];
            }
        }
        return menor;
    }

    double calcularMayor() {
        double mayor = listaNotas[0]; /* Define una variable como la nota mayor */
        for (int i = 0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] > mayor) {
                /*
                 * Si un elemento del array es mayor que el mayor actual, se actualiza su valor
                 */
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }

}