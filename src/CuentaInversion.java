public class CuentaInversion extends CuentaBancaria{
    public CuentaInversion(String numeroCuenta, String titular, double saldo){
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual(){
        double saldo = getSaldo();
        double tasaAnual;
        if(saldo < 1000){
            tasaAnual = 0.04;
        }else if(saldo <= 5000){
            tasaAnual = 0.05;
        }else{
            tasaAnual = 0.06;
        }
        return saldo * (tasaAnual/12);
    }

}