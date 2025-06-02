package ExamenProgramacion.ej3;

public class Oficina extends Local{

    double valorArea ;
    boolean esGoierono ;

    public Oficina(int idInmo, int area, String direccion, tipo tipoLocal, double valorArea, boolean esGoierono) {
        super(idInmo, area, direccion, tipoLocal);
        this.valorArea = valorArea;
        this.esGoierono = esGoierono;
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Oficina");
        if (esGoierono){
            this.precioVenta += 4700;
        }
    }
}
