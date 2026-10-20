package ejercitacion3_4.ejercicio01;

public class Estudiante extends MiembroUniversitario {
    private String carrera;

    public Estudiante(String legajo, String nombre, String carrera) {
        super(legajo, nombre);
        this.carrera = carrera;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante de " + this.carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}
