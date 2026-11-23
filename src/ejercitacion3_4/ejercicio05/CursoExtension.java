package ejercitacion3_4.ejercicio05;

public class CursoExtension implements Acreditable {
    private String nombre;
    private int duracionSemanas;
    private static final int HORAS_POR_SEMANA = 4;

    public CursoExtension(String nombre, int duracionSemanas) {
        this.nombre = nombre;
        this.duracionSemanas = duracionSemanas;
    }

    // cada semana del curso certifica 4 horas
    @Override
    public int obtenerHorasAcreditadas() {
        return this.duracionSemanas * HORAS_POR_SEMANA;
    }

    public static void main(String[] args) {
        Acreditable curso = new CursoExtension("Extension en Gestion de Proyectos", 8);
        Acreditable proyecto = new ProyectoInvestigacion("INV-220", 120);

        System.out.println("HORAS ACREDITADAS SEGUN EL TIPO Acreditable");
        System.out.printf("Curso de extension:      %d horas%n", curso.obtenerHorasAcreditadas());
        System.out.printf("Proyecto de investigacion: %d horas%n", proyecto.obtenerHorasAcreditadas());
    }
}
