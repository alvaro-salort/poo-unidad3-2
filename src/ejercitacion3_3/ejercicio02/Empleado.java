package ejercitacion3_3.ejercicio02;

public abstract class Empleado {
    private String legajo;
    private String nombre;
    private double sueldoBase;

    public Empleado(String legajo, String nombre, double sueldoBase) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    // comportamiento especializado obligatorio
    public abstract double calcularSueldoNeto();

    // getters
    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public static void main(String[] args) {
        EmpleadoPlanta planta = new EmpleadoPlanta("L-101", "Sofia Ramirez", 750000.0, 120000.0);
        EmpleadoEventual eventual = new EmpleadoEventual("L-202", "Diego Paz", 0.0, 120, 4500.0);

        System.out.println("SUELDO NETO DE CADA TIPO DE EMPLEADO");
        System.out.printf("%-8s %-15s | Sueldo base: $%.2f | Sueldo neto: $%.2f%n",
                planta.getLegajo(), planta.getNombre(), planta.getSueldoBase(), planta.calcularSueldoNeto());
        System.out.printf("%-8s %-15s | Sueldo base: $%.2f | Sueldo neto: $%.2f%n",
                eventual.getLegajo(), eventual.getNombre(), eventual.getSueldoBase(), eventual.calcularSueldoNeto());
    }
}
