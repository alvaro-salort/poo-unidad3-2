package ejercitacion3_4.ejercicio02;

public class ExamenParcial extends EvaluacionAcademica {
    private double notaTeoria;
    private double notaPractica;

    public ExamenParcial(String nombreMateria, double notaTeoria, double notaPractica) {
        super(nombreMateria);
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
    }

    // la nota final es el promedio de ambas notas
    @Override
    public double calcularNotaFinal() {
        return (this.notaTeoria + this.notaPractica) / 2.0;
    }

    public double getNotaTeoria() {
        return notaTeoria;
    }

    public double getNotaPractica() {
        return notaPractica;
    }
}
