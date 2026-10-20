package ejercitacion3_4.ejercicio03;

public class ProfesorTitular extends PersonalUniversitario {
    private double bonoInvestigacion;

    public ProfesorTitular(String legajo, String nombre, double sueldoBase, double bonoInvestigacion) {
        super(legajo, nombre, sueldoBase);
        this.bonoInvestigacion = bonoInvestigacion;
    }

    @Override
    public double calcularSueldoCobrar() {
        return this.getSueldoBase() + this.bonoInvestigacion;
    }

    public double getBonoInvestigacion() {
        return bonoInvestigacion;
    }
}
