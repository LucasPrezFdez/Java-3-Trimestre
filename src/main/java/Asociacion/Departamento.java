package Asociacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Departamento {

    String nombre; // Atributo que identifica el nombre de un departamento
    /* Atributo que identifica los municipios que pertenecen a un departamento */
    private ArrayList<Municipio> municipios;

    public void inicializarMunicipios() {
        municipios = new ArrayList<>();
        municipios.add(new Municipio("Sanxenxo", 17760, 15.3, 170));
        municipios.add(new Municipio("Pontevedra", 83077, 14.8, 20));
        municipios.add(new Municipio("Caldas de Reis", 9678, 14.4, 80));
        municipios.add(new Municipio("Marín", 24034, 14.5, 10));
        municipios.add(new Municipio("Vigo", 292374, 14.9, 20));
        municipios.add(new Municipio("Vilagarcía de Arousa", 37677, 14.7, 10));
        municipios.add(new Municipio("Poio", 17276, 14.6, 20));
        municipios.add(new Municipio("Ponteareas", 23049, 14.5, 40));
        municipios.add(new Municipio("Redondela", 29055, 14.6, 50));
        municipios.add(new Municipio("O Porriño", 20408, 14.5, 120));
    }
    /**
     * Constructor de la clase Departamento
     *
     * @param nombre     Parámetro que define el nombre del departamento
     * @param municipios Parámetro que define los municipios que hacen parte del
     *                   departamento
     */
    public Departamento(String nombre, ArrayList<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    // Preparar un mock de datos --> tener algunos municipios ya preparados





    /**
     * Método que devuelve el nombre del departamento
     *
     * @return El nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del departamento
     *
     * @param nombre Parámetro que define el nombre del departamento
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que agrega un municipio al vector de municipios del departamento
     *
     * @param municipio Parámetro que define el municipio a agregar al vector de
     *                  municipios del departamento
     */
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    /**
     * Método que elimina un municipio del vector de municipios del departamento
     *
     * @param nombre Parámetro que define el nombre del municipio a eliminar
     */
    public void eliminarMunicipio(String nombre) {
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio);
                break;
            }
        }
    }

    /**
     * Método que busca un municipio a partir de un nombre
     *
     * @param nombre Parámetro que define el nombre del municipio a buscar
     */
    public void buscarMunicipio(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Municipio no encontrado.");
        }
    }

    /**
     * Método que busca municipios con una población mayor o igual a un valor dado
     * como parámetro
     *
     * @param poblacion Parámetro que define una determinada cantidad de población
     */
    public void buscarMunicipioConPoblacionMayor(int poblacion) {
        boolean encontroMunicipios = false;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (municipio.getPoblacion() >= poblacion) {
                System.out.println(municipio.getNombre());
                encontroMunicipios = true;
            }
        }
        if (!encontroMunicipios) {
            System.out.println("No existen municipios con esta población.");
        }
    }

    /**
     * Método que calcula el censo poblacional del departamento sumando la
     * población de todos los municipios del departamento
     *
     * @return La población total del departamento
     */
    public int calcularCensoPoblacionDepartamento() {
        int totalCenso = 0;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            totalCenso += municipio.getPoblacion();
        }
        return totalCenso;
    }

    public void listarPoblacionesConMasPob (int poblacion) {
        List<Municipio> encontrados = municipios.stream()
                .filter(m -> m.getPoblacion() >= poblacion)
                .collect(Collectors.toList());
        if (encontrados.isEmpty()){
            System.out.println("No existen municipios con mas que esa poblacion");
        } else {
            encontrados.forEach(m -> System.out.println(m.getNombre()));
        }
    }

    public void listaTodo() {
        Iterator iterator = municipios.iterator();
        while (iterator.hasNext()){
            Municipio municipio = (Municipio) iterator.next();
            System.out.println("nombre: "+municipio.getNombre() + " --> poblacion: " +municipio.getPoblacion());
        }
    }
}