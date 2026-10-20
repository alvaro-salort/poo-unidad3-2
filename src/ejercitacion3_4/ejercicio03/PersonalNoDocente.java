package ejercitacion3_4.ejercicio03;

public class PersonalNoDocente extends PersonalUniversitario {
    private int horasExtras;
    private double montoHoraExtra;

    public PersonalNoDocente(String legajo, String nombre, double sueldoBase, int horasExtras, double montoHoraExtra) {
        super(legajo, nombre, sueldoBase);
        this.horasExtras = horasExtras;
        this.montoHoraExtra = montoHoraExtra;
    }

    @Override
    public double calcularSueldoCobrar() {
        return this.getSueldoBase() + (this.horasExtras * this.montoHoraExtra);
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getMontoHoraExtra() {
        return montoHoraExtra;
    }
}
