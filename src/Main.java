import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(){
        List<CuentaBancaria> cuentas = new ArrayList<>();

        //ahora creamos las cuentas
        cuentas.add(new CuentaAhorros("T001", "Maria Perez",1200));
        cuentas.add(new CuentaCorriente("T002", "Emilio Lopez",800));
        cuentas.add(new CuentaInversion("T003", "Oscar Jimenez",7000));

        //ahora calculamos los intereses
        double totalIntereses = 0;
        for(CuentaBancaria cuenta: cuentas){
            double interes = cuenta.calcularInteresMensual();
            totalIntereses += interes;

            //actualizamos el saldo

            if (interes > 0) {
                cuenta.depositar(interes);
            }

            System.out.println("Titular: " + cuenta.getTitular());
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println("Interés mensual: " + interes);
            System.out.println("-------------------------");

        }
        System.out.println("Total intereses del banco: " + totalIntereses);
    }

}

