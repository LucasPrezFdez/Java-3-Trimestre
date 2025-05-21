package Perrari;

import java.util.Arrays;
import java.util.Objects;

public class Coche {

    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;

    public Motor creaMotor(int volumen) {
        return new Motor(volumen);
    }

    public Chasis creaChasis(tipoChasis tipo) {
        return new Chasis(tipo);
    }

    public Carroceria creaCarroceria(tipoCarroceria tipo, String color) {
        return new Carroceria(tipo, color);
    }

    public Llanta[] creaLlantas(String marca, int diametro, int altura, int anchura) {
        Llanta[] llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(marca, diametro, altura, anchura);
        }
        return llantas;
    }

    public Coche(Motor motor, Chasis chasis, Llanta[] llantas, Carroceria carroceria) {
        this.motor = motor;
        this.chasis = chasis;
        this.llantas = llantas;
        this.carroceria = carroceria;
    }

    Coche (Motor motor, Chasis chasis, Llanta[] llantas, Carroceria carroceria,
           String marca, int diametro, int altura, int anchura, String color, tipoCarroceria claseCarroceria) {
        this.motor = motor;
        this.chasis = chasis;
        llantas =new  Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(marca,diametro,altura,anchura);
        }
        carroceria =new Carroceria(claseCarroceria,color);
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Chasis getChasis() {
        return chasis;
    }
    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    public Llanta[] getLlantas() {
        return llantas;
    }
    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    public Carroceria getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(motor, coche.motor) && Objects.equals(chasis, coche.chasis) && Objects.deepEquals(llantas, coche.llantas) && Objects.equals(carroceria, coche.carroceria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motor, chasis, Arrays.hashCode(llantas), carroceria);
    }

    void imprimir() {
        System.out.println("Datos del coche:");
        System.out.println("Motor - Cilindros " + motor.getVolumen());
        System.out.println("Chasis - Tipo " + chasis.getTipo());
        System.out.println("Carroceria - Tipo "+ carroceria.getTipo() +" Color " + carroceria.getColor());
        System.out.println("Llantas - Cantidad " + llantas.length);
        for (int i = 0; i < llantas.length; i++) {
            System.out.println("Llanta " + (i+1) + " - Marca " + llantas[i].getMarca() + " Diametro " + llantas[i].getDiametro() +
                    " Altura " + llantas[i].getAltura() + " Anchura " + llantas[i].getAnchura());
        }

    }

}
