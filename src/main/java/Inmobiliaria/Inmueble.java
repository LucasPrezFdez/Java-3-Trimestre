package Inmobiliaria;

import java.util.HashMap;

public class Inmueble {

    //VAMOS A CREAR UN MAP PARA ALMACENAR LOS PRECIOS UNITARIOS PARA
    //CADA CATEGORIA DE LAS SIETE QUE ME PROPORCIONA EL EJERICIO

//	Tabla 4.2. Valor por metro cuadrado según tipo de inmueble
//
//	Inmueble						Valor por metro cuadrado
//	Casa rural						$ 1 500000
//	Casa en conjunto cerrado		$ 2 500000
//	Casa independiente				$ 3 000 000
//	Apartaestudio					$ 1500000
//	Apartamento familiar			$ 2 000000
//	Local comercial					$ 3000000
//	Oficina							$ 3500 000


    protected HashMap<String, Double> valorUnitario;

    public void pueblaValores() {
        valorUnitario = new HashMap<String, Double>();
        this.valorUnitario.put("Casa rural", 1500000d);
        this.valorUnitario.put("Casa en conjunto cerrado", 2500000d);
        this.valorUnitario.put("Casa independiente", 3000000d);
        this.valorUnitario.put("Apartaestudio", 1500000d);
        this.valorUnitario.put("Apartamento familiar", 2000000d);
        this.valorUnitario.put("Local comercial", 3000000d);
        this.valorUnitario.put("Oficina", 3500000d);
        this.valorUnitario.put("zero", 0d);
    }

    // Atributo para el identificador inmobiliario de un inmueble
    protected int idInmo;
    // Atributo que identifica el área de un inmueble
    protected int area;
    /* Atributo que identifica la dirección de un inmueble */
    protected String direccion;
    /* Atributo que identifica el precio de venta de un inmueble */
    protected double precioVenta;

    /**
     * Constructor de la clase Inmueble
     *
     * @param idInmo    Parámetro que define el identificador de un inmueble
     * @param area      Parámetro que define el área de un inmueble
     * @param direccion Parámetro que define la dirección donde se encuentra
     *                  localizado un inmueble
     */
    Inmueble(int idInmo, int area, String direccion) {
        this.idInmo = idInmo;
        this.area = area;
        this.direccion = direccion;
        this.precioVenta = 0d;
    }

    /**
     * Método que a partir del valor del área de un inmueble, calcula su precio de venta
     *
     * @param valorArea (UNIDAD) El valor unitario por área de un determinado
     *                  inmueble SEGUN TABLA
     * @return Precio de venta del inmueble
     */
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("zero");
    }

    //precisamos un getter
    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "area=" + area +
                ", valorUnitario=" + valorUnitario +
                ", idInmo=" + idInmo +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + precioVenta +
                '}';
    }

    //uso 1 llama a pueblaValores para crear el map
    //2 llama a calculaPrecioVenta con el nombre de la clase apropiada
    //que es la string usada como key
    //3 con el getter del precio de venta tienes un double
}