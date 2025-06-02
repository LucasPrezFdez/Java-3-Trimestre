package ParaVer.InmobiliariaMejorada;

public abstract class Inmueble {
    protected String direccion;
    protected double area;
    protected double valorBase;

    public Inmueble(String direccion, double area, double valorBase) {
        if (area <= 0 || valorBase <= 0) {
            throw new IllegalArgumentException("Área y valor deben ser positivos.");
        }
        this.direccion = direccion;
        this.area = area;
        this.valorBase = valorBase;
    }

    public abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return "Dirección: " + direccion + ", Área: " + area + " m², Valor base: $" + valorBase;
    }
}
