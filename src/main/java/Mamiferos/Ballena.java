package Mamiferos;

public class Ballena extends Mamifero{

    private double peso;

    public Ballena(String nombre, double peso) {
        super(nombre);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nBallena{" +
                "peso=" + peso +
                "} " + super.toString();
    }

    @Override
    public void amamantarCrias() {
        System.out.println("La Ballena amamanta a sus crias en los mares");
    }
}
