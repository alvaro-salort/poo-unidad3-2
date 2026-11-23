package ejercitacion3_3.ejercicio03;

public class LiquidacionSueldos {

    // el parametro es una referencia del tipo abstracto: el cliente no conoce la subclase
    public void liquidar(Empleado e) {
        System.out.printf("%-8s %-15s | Sueldo neto a cobrar: $%.2f%n",
                e.getLegajo(), e.getNombre(), e.calcularSueldoNeto());
    }

    public static void main(String[] args) {
        EmpleadoPlanta planta = new EmpleadoPlanta("L-101", "Sofia Ramirez", 750000.0, 120000.0);
        EmpleadoEventual eventual = new EmpleadoEventual("L-202", "Diego Paz", 0.0, 120, 4500.0);

        LiquidacionSueldos liquidacion = new LiquidacionSueldos();

        System.out.println("LIQUIDACION POLIMORFICA");
        liquidacion.liquidar(planta);
        liquidacion.liquidar(eventual);
    }
}
