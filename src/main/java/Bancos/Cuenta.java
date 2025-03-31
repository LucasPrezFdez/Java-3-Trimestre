package Bancos;

public class Cuenta {

    //atributos
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    //constructor

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    //contructor completo
    public Cuenta(float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual, float comisionMensual) {
        this.saldo = saldo;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numeroRetiros = numeroRetiros;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
    }

    //es ingresar
    public void consignar(float cantidad) {
        saldo += cantidad;
        numeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("La cantida a retirar excede el saldo actual");
        }
    }

    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }

    //getters setters


    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "comisionMensual=" + comisionMensual +
                ", saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numeroRetiros=" + numeroRetiros +
                ", tasaAnual=" + tasaAnual +
                '}';
    }
}
