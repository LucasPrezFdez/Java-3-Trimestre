package Perrari;

public class Coche {

    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;

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

    void imprimir() {
        System.out.println("Datos del coche:");
        System.out.println("Motor - Cilindros " + motor.getVolumen());
        System.out.println("Chasis - Tipo " + chasis.getTipo());
        System.out.println("Carroceria - Tipo "+ carroceria.getTipo() +" Color " + carroceria.getColor());

    }

}
