package ejercitacion3_4.ejercicio09;

public class ExamenOral implements Evaluable {
    private String alumno;
    private double exposicion;
    private double preguntas;

    public ExamenOral(String alumno, double exposicion, double preguntas) {
        this.alumno = alumno;
        this.exposicion = exposicion;
        this.preguntas = preguntas;
    }

    // el puntaje es el promedio entre la exposicion y las preguntas orales
    @Override
    public double obtenerPuntaje() {
        return (this.exposicion + this.preguntas) / 2.0;
    }

    public static void main(String[] args) {
        ExamenOral examen = new ExamenOral("Nicolas Herrera", 8.5, 7.0);

        System.out.println("METODO ABSTRACTO IMPLEMENTADO POR LA CLASE");
        System.out.printf("Alumno: %s | Puntaje: %.2f%n", examen.alumno, examen.obtenerPuntaje());

        System.out.println("\nMETODO default HEREDADO DE LA INTERFAZ");
        System.out.println("Aprobado: " + examen.estaAprobado());
    }
}
