package ejercitacion3_3.ejercicio02;

public class EmpleadoPlanta extends Empleado {
    private double bonoAntiguedad;

    public EmpleadoPlanta(String legajo, String nombre, double sueldoBase, double bonoAntiguedad) {
        super(legajo, nombre, sueldoBase);
        this.bonoAntiguedad = bonoAntiguedad;
    }

    // el sueldo neto es el sueldo base mas el bono por antiguedad
    @Override
    public double calcularSueldoNeto() {
        return this.getSueldoBase() + this.bonoAntiguedad;
    }

    public double getBonoAntiguedad() {
        return bonoAntiguedad;
    }

    public void setBonoAntiguedad(double bonoAntiguedad) {
        this.bonoAntiguedad = bonoAntiguedad;
    }
}
