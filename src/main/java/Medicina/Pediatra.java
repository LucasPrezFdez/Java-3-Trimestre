package Medicina;

public class Pediatra extends Medico{

    enum tipologia {NEUROLOGO, PSICOLOGO};

        protected tipologia tipo;

    public Pediatra(String nombre, tipologia tipo) {
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
