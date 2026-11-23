package ejercitacion3_4.ejercicio01;

public abstract class MiembroUniversitario {
    protected String legajo;
    protected String nombre;

    public MiembroUniversitario(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    // cada rol de la comunidad define su propia descripcion
    public abstract String obtenerRol();

    public static void main(String[] args) {
        /*
         * No se puede instanciar una clase abstracta:
         *
         *   MiembroUniversitario miembro = new MiembroUniversitario("A-1", "Juan");  // no compila
         *
         * error: cannot instantiate abstract class MiembroUniversitario
         */

        Estudiante estudiante = new Estudiante("E-001", "Juan Perez", "Ingenieria en Sistemas");
        Docente docente = new Docente("D-010", "Maria Gomez", "Semi exclusiva");

        System.out.println("ROL DE CADA MIEMBRO DE LA COMUNIDAD");
        System.out.printf("%-8s %-15s | %s%n", estudiante.legajo, estudiante.nombre, estudiante.obtenerRol());
        System.out.printf("%-8s %-15s | %s%n", docente.legajo, docente.nombre, docente.obtenerRol());
    }
}
