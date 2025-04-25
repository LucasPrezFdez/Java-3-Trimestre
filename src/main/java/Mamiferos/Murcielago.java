package Mamiferos;

public class Murcielago extends Mamifero implements Volador {

    private boolean colgado = true;

    public Murcielago(String nombre, boolean colgado) {
        super(nombre);
        this.colgado = colgado;
    }

    @Override
    public void amamantarCrias() {
        System.out.println("amamantan de uno en uno");
    }

    @Override
    public String volar(String como) {
        return "los murcielagos vuelan ..." + como;
    }

    @Override
    public String toString() {
        return "\nMurcielago{" +
                "colgado=" + colgado +
                "} " + super.toString();
    }
}
