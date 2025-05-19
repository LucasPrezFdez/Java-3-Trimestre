package Pista;

import java.util.ArrayList;

public class Peaje {

    String nombre;
    String departamento;
    ArrayList<Vehiculo> vehiculos;
    double totalPeaje;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCoches = 0;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new ArrayList<Vehiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double calcularPeaje(Vehiculo vehiculo) {
        double aux;
        if (vehiculo instanceof Coche) {
            totalCoches++;
            aux = Coche.getValorPeaje();
            totalPeaje += aux;
            return aux;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
            aux = Moto.getValorPeaje();
            totalPeaje += aux;
            return aux;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
            Camion camion = (Camion) vehiculo;
            aux = camion.getValorPeaje();
            totalPeaje += aux;
            return aux;
        }
        return -1;
    }

    public void imprimir() {
        System.out.println("Nombre del peaje: " + getNombre());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Total de vehiculos: " + vehiculos.size());
        System.out.println("Total de coches: " + totalCoches);
        System.out.println("Total de motos: " + totalMotos);
        System.out.println("Total de camiones: " + totalCamiones);
        int totalVehiculos = totalCoches + totalMotos + totalCamiones;
        System.out.println("Total de vehiculos: " + totalVehiculos);
        System.out.println("Dinero total = $ " + totalPeaje);

    }

}
