package Universidad;

public class Profesor extends Persona{

    String departamento;
    String categoria;

    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "categoria='" + categoria + '\'' +
                ", departamento='" + departamento + '\'' +
                "} " + super.toString();
    }

    @Override
    public void irAClase() {
        super.irAClase();
        System.out.println(" y es profesor");
    }
}
