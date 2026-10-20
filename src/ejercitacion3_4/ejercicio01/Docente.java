package ejercitacion3_4.ejercicio01;

public class Docente extends MiembroUniversitario {
    private String dedicacion;

    public Docente(String legajo, String nombre, String dedicacion) {
        super(legajo, nombre);
        this.dedicacion = dedicacion;
    }

    @Override
    public String obtenerRol() {
        return "Docente con dedicacion " + this.dedicacion;
    }

    public String getDedicacion() {
        return dedicacion;
    }
}
