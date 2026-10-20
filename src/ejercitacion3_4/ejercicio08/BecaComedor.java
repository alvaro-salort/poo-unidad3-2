package ejercitacion3_4.ejercicio08;

public class BecaComedor extends SolicitudBeca {
    // monto fijo estandarizado para la beca de comedor
    private static final double MONTO_COMEDOR = 45000.0;

    public BecaComedor(String solicitante, double montoBase) {
        super(solicitante, montoBase);
    }

    @Override
    public double calcularMontoAsignado() {
        return MONTO_COMEDOR;
    }
}
