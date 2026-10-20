package ejercitacion3_4.ejercicio08;

public class BecaInvestigacion extends SolicitudBeca {

    public BecaInvestigacion(String solicitante, double montoBase) {
        super(solicitante, montoBase);
    }

    // se agrega un 30% adicional por merito investigativo
    @Override
    public double calcularMontoAsignado() {
        return this.montoBase * 1.30;
    }
}
