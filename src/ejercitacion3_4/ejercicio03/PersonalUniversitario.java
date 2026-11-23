package ejercitacion3_4.ejercicio03;

public abstract class PersonalUniversitario {
    private String legajo;
    private String nombre;
    protected double sueldoBase;

    public PersonalUniversitario(String legajo, String nombre, double sueldoBase) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldoCobrar();

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
        ProfesorTitular titular = new ProfesorTitular("P-001", "Ana Torres", 950000.0, 180000.0);
        PersonalNoDocente noDocente = new PersonalNoDocente("N-002", "Luis Vega", 600000.0, 20, 3500.0);

        LiquidacionSueldos liquidacion = new LiquidacionSueldos();

        System.out.println("LIQUIDACION POLIMORFICA DE HABERES");
        liquidacion.procesarPago(titular);
        liquidacion.procesarPago(noDocente);
    }
}
