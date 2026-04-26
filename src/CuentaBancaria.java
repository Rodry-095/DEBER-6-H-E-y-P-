public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Encapsulamiento
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    //--------------------------------------------------------------

    //Metodos depositar y retirar
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }else{
            System.out.println("Monto ingresado invalido.");
        }
    }

    public void retirar(double monto){
        if(monto > 0 && monto <= saldo){
            monto -= saldo;
        }else{
            System.out.println("Fondos insuficientes.");
        }
    }

    //--------------------------------------------------------------

    //Metodo para calcular el interes mensual(polimorfismo)
    public abstract double calcularInteresMensual();


}

