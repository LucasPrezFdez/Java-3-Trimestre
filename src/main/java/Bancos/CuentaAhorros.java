package Bancos;

public class CuentaAhorros extends Cuenta {

    private boolean activa;

    //constructor


    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);

        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }

    //constructor completo


    public CuentaAhorros(float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual, float comisionMensual, boolean activa) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.activa = activa;
    }

    @Override
    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);
    }

    @Override
    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }

    public void extractoMensual() {
        if (numeroRetiros > 4)
            comisionMensual += (numeroRetiros - 4) * 1000;
        super.extractoMensual();
        if (saldo < 10000)
            activa = false;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "tasaAnual=" + tasaAnual +
                ", saldo=" + saldo +
                ", numeroRetiros=" + numeroRetiros +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", comisionMensual=" + comisionMensual +
                ", activa=" + activa +
                '}';
    }
}
