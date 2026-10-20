package ejercitacion3_4.ejercicio05;

public class ProyectoInvestigacion implements Acreditable {
    private String codigo;
    private int horasAsignadas;

    public ProyectoInvestigacion(String codigo, int horasAsignadas) {
        this.codigo = codigo;
        this.horasAsignadas = horasAsignadas;
    }

    @Override
    public int obtenerHorasAcreditadas() {
        return this.horasAsignadas;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getHorasAsignadas() {
        return horasAsignadas;
    }
}
