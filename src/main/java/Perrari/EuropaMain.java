package Perrari;

public class EuropaMain {

    public static void main(String[] args) {

        // creo partes y luego instacion coche

        Motor motor = new Motor(1200);
        Chasis chasis = new Chasis(tipoChasis.MONOCASCO);
        Carroceria carroceria = new Carroceria(tipoCarroceria.TUBULAR, "Rojo");
        Llanta llantas = new Llanta("juyear", 23, 12, 7);
        Llanta[] llantasArray = new Llanta[4];
        for (int i = 0; i < llantasArray.length; i++) {
            llantasArray[i] = llantas;
        }

        Coche coche = new Coche(motor, chasis, llantasArray, carroceria);
        coche.imprimir();



    }

}
