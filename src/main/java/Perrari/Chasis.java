package Perrari;

public class Chasis {

    tipoChasis tipo;

    Chasis (tipoChasis tipo) {
        this.tipo = tipo;
    }

    public tipoChasis getTipo() {
        return tipo;
    }

    public void setTipo(tipoChasis tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Chasis{" +
                "tipo=" + tipo +
                '}';
    }


}
