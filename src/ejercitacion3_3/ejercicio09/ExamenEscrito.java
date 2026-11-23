package ejercitacion3_3.ejercicio09;

public class ExamenEscrito implements Evaluable {
    private String alumno;
    private double respuestasCorrectas;
    private int totalPreguntas;

    public ExamenEscrito(String alumno, double respuestasCorrectas, int totalPreguntas) {
        this.alumno = alumno;
        this.respuestasCorrectas = respuestasCorrectas;
        this.totalPreguntas = totalPreguntas;
    }

    @Override
    public double obtenerPuntaje() {
        return (this.respuestasCorrectas * 10.0) / this.totalPreguntas;
    }

    public static void main(String[] args) {
        ExamenEscrito examen = new ExamenEscrito("Marta Fernandez", 8.0, 10);

        System.out.println("METODO ABSTRACTO IMPLEMENTADO POR LA CLASE");
        System.out.printf("Alumno: %s | Puntaje: %.2f%n", examen.alumno, examen.obtenerPuntaje());

        System.out.println("\nMETODO default HEREDADO DE LA INTERFAZ");
        System.out.println("Aprobado: " + examen.esAprobado());
    }
}
