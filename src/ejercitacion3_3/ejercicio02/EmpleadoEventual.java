package ejercitacion3_3.ejercicio02;

public class EmpleadoEventual extends Empleado {
    private int horasTrabajadas;
    private double costoHora;

    public EmpleadoEventual(String legajo, String nombre, double sueldoBase, int horasTrabajadas, double costoHora) {
        super(legajo, nombre, sueldoBase);
        this.horasTrabajadas = horasTrabajadas;
        this.costoHora = costoHora;
    }

    // el sueldo neto se calcula SOLO por horas trabajadas
    @Override
    public double calcularSueldoNeto() {
        return this.horasTrabajadas * this.costoHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }
}
