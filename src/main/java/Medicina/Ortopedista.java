package Medicina;

public class Ortopedista extends Medico {

    enum tipologia {
        MAXILOFACIAL, PEDIATRICA
    };

    protected tipologia tipo;

    public Ortopedista(String nombre, tipologia tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public tipologia getTipo() {
        return tipo;
    }

    public void setTipo(tipologia tipo) {
        this.tipo = tipo;
    }
}
