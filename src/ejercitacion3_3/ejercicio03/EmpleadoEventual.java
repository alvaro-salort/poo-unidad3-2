package ejercitacion3_3.ejercicio03;

public class EmpleadoEventual extends Empleado {
    private int horasTrabajadas;
    private double costoHora;

    public EmpleadoEventual(String legajo, String nombre, double sueldoBase, int horasTrabajadas, double costoHora) {
        super(legajo, nombre, sueldoBase);
        this.horasTrabajadas = horasTrabajadas;
        this.costoHora = costoHora;
    }

    @Override
    public double calcularSueldoNeto() {
        return this.horasTrabajadas * this.costoHora;
    }
}
