public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String numeroCuenta, String titular, double saldo){
        super(numeroCuenta, titular, saldo);
    }
    @Override
    public void retirar(double monto){
        if(monto > 0 && (getSaldo() - monto) >= -500){
            super.depositar(-monto);
        }else{
            System.out.println("Transaccion invalida, supera el sobregiro permitido.");
        }
    }
    @Override
    public double calcularInteresMensual(){
        return 0;

    }
}