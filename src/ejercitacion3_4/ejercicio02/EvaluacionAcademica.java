package ejercitacion3_4.ejercicio02;

public abstract class EvaluacionAcademica {
    private String nombreMateria;

    public EvaluacionAcademica(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    // metodo concreto heredable: el encabezado es el mismo para todas las evaluaciones
    public void imprimirEncabezado() {
        System.out.println("--- EVALUACION: " + this.nombreMateria + " ---");
    }

    // comportamiento especializado obligatorio
    public abstract double calcularNotaFinal();

    public String getNombreMateria() {
        return nombreMateria;
    }

    public static void main(String[] args) {
        ExamenParcial parcial = new ExamenParcial("Algoritmos", 7.5, 9.0);
        TrabajoPracticoIntegrador tpi = new TrabajoPracticoIntegrador("Base de Datos", 8.0, 7.0, 0.4);

        System.out.println("--- NOTA FINAL DE CADA TIPO DE EVALUACION ---");
        parcial.imprimirEncabezado();
        System.out.printf("Nota final: %.2f%n", parcial.calcularNotaFinal());

        tpi.imprimirEncabezado();
        System.out.printf("Nota final: %.2f%n", tpi.calcularNotaFinal());
    }
}
