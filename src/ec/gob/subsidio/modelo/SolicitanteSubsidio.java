package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;
    public SolicitanteSubsidio(String nombreCompleto, String cedula,double ingresosMensuales, int cantidadVehiculos,boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }
    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Ingreso inválido. Se asigna 470.");
            this.ingresosMensuales = 470;
        }
    }
    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Cantidad inválida. Se asigna 0.");
            this.cantidadVehiculos = 0;
        }
    }
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }
    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getCedula() {
        return cedula;
    }
    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }
    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }
    public boolean subsidioAprobado() {
        return ingresosMensuales <= 1200 &&
                cantidadVehiculos <= 1 &&
                viveEnEcuador;
    }
    public void generarResultado() {
        if (subsidioAprobado()) {
            System.out.println("Subsidio APROBADO");
        } else {
            System.out.println("Subsidio RECHAZADO");

            if (ingresosMensuales > 1200) {
                System.out.println("- Ingresos mayores a $1200");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("- Posee más de un vehículo");
            }
            if (!viveEnEcuador) {
                System.out.println("- No reside en Ecuador");
            }
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nIngresos: $" + ingresosMensuales +
                "\nVehículos: " + cantidadVehiculos +
                "\nVive en Ecuador: " + viveEnEcuador;
    }
    public static void mostrarReglasSubsidio() {
        System.out.println("Reglas para obtener el subsidio:");
        System.out.println("- Ingresos <= $1200");
        System.out.println("- Máximo 1 vehículo");
        System.out.println("- Debe vivir en Ecuador");
    }
    public double calcularConsumoMensual() {
        double kmMensuales = 1200;
        return kmMensuales / 40;
    }
    public double calcularConsumoMensual(double kmExtra) {
        double kmMensuales = 1200 + kmExtra;
        return kmMensuales / 40;
    }
}
