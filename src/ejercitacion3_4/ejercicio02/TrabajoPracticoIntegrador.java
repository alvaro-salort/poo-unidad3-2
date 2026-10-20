package ejercitacion3_4.ejercicio02;

public class TrabajoPracticoIntegrador extends EvaluacionAcademica {
    private double notaEntrega;
    private double notaExposicion;
    private double ponderacionExpo;

    public TrabajoPracticoIntegrador(String nombreMateria, double notaEntrega, double notaExposicion,
                                     double ponderacionExpo) {
        super(nombreMateria);
        this.notaEntrega = notaEntrega;
        this.notaExposicion = notaExposicion;
        this.ponderacionExpo = ponderacionExpo;
    }

    /*
     * La exposicion pesa ponderacionExpo (valor entre 0 y 1)
     * y la entrega pesa el resto de la nota.
     */
    @Override
    public double calcularNotaFinal() {
        return (this.notaEntrega * (1 - this.ponderacionExpo)) + (this.notaExposicion * this.ponderacionExpo);
    }

    public double getNotaEntrega() {
        return notaEntrega;
    }

    public double getNotaExposicion() {
        return notaExposicion;
    }

    public double getPonderacionExpo() {
        return ponderacionExpo;
    }
}
