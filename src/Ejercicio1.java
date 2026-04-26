import ec.gob.subsidio.modelo.SolicitanteSubsidio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        SolicitanteSubsidio.mostrarReglasSubsidio();

        System.out.print("Ingrese nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese cantidad de vehículos: ");
        int vehiculos = sc.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean vive = sc.nextBoolean();

        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculos, vive);
        System.out.println("\n========== DATOS ==========");
        System.out.println(solicitante);

        System.out.println("\n========== RESULTADO ==========");
        solicitante.generarResultado();

        double consumo1 = solicitante.calcularConsumoMensual();
        double consumo2 = solicitante.calcularConsumoMensual(200);
        System.out.println("\nConsumo mensual (normal): " + consumo1 + " galones");
        System.out.println("Consumo mensual (con km extra): " + consumo2 + " galones");
        sc.close();
    }
}
