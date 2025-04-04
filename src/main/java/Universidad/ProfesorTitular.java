package Universidad;

public class ProfesorTitular extends Profesor{

    String asignatura;

    public ProfesorTitular(String nombre, String direccion, String departamento, String categoria, String asignatura) {
        super(nombre, direccion, departamento, categoria);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void irAClase() {
        super.irAClase();
        System.out.println("para DAR CLASE de "+this.categoria+ "en el "+this.departamento);
    }

    @Override
    public String toString() {
        return "Es un profesor titualar";
    }
}
