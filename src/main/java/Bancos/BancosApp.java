package Bancos;

import java.util.Scanner;

public class BancosApp {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");

        System.out.println("Ingrese saldo inicial = $");
        float saldoInicialAhorros = input.nextFloat();

        System.out.println("Ingrese tasa de interes = ");
        float tasaAhorros = input.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);

        System.out.println("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();

        cuenta1.consignar(cantidadDepositar);

        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();

        cuenta1.retirar(cantidadRetirar);

        System.out.println("calcula el EXTRACTO del MES");
        cuenta1.extractoMensual();

        System.out.println(cuenta1.toString());

/*
-------------------------------------------------------------------------------------------------------------
 */

        System.out.println("Cuenta Corriente");

        System.out.println("Ingrese saldo inicial = $");
        float saldoCorriente = input.nextFloat();

        System.out.println("Ingrese tasa de interes = ");
        float tasaInteres = input.nextFloat();

        CuentaAhorros cuenta2 = new CuentaAhorros(saldoCorriente, tasaInteres);

        System.out.println("Ingresar cantidad a consignar: $");
        float ingreso = input.nextFloat();

        cuenta1.consignar(ingreso);

        System.out.println("Ingresar cantidad a retirar: $");
        float devuelto = input.nextFloat();

        cuenta2.retirar(devuelto);

        System.out.println("calcula el EXTRACTO del MES");
        cuenta2.extractoMensual();

        System.out.println(cuenta2.toString());


    }


}







