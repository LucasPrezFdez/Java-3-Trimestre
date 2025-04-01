package Inmobiliaria;

public class Local extends Inmueble{

    enum tipo{
        INTERNO,CALLE
    }
    protected tipo tipoLocal;

    public Local(int idInmo, int area, String direccion, tipo tipoLocal) {
        super(idInmo, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public String toString() {
        return "Local{" +
                "tipoLocal=" + tipoLocal +
                "} " + super.toString();
    }


}
