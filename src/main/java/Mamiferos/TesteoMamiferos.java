package Mamiferos;

public class TesteoMamiferos {

    public static void main(String[] args) {

        Ballena mobyDick = new Ballena("Anxo", 9999999);

        mobyDick.amamantarCrias();

        Ornitorrinco ornitorrinco1 = new Ornitorrinco("Hector", 9999999);

        ornitorrinco1.amamantarCrias();

        ornitorrinco1.ponerHuevos();

        Murcielago batman = new Murcielago("Jose", true);

        batman.amamantarCrias();

        System.out.println(batman.volar("por los aires"));

    }
}
