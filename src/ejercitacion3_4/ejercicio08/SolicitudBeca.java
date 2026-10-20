package ejercitacion3_4.ejercicio08;

import java.util.ArrayList;

public abstract class SolicitudBeca {
    protected double montoBase;
    private String solicitante;

    public SolicitudBeca(String solicitante, double montoBase) {
        this.solicitante = solicitante;
        this.montoBase = montoBase;
    }

    // monto asignado segun el tipo de beca
    public abstract double calcularMontoAsignado();

    public String getSolicitante() {
        return solicitante;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public static void main(String[] args) {
        ArrayList<SolicitudBeca> solicitudes = new ArrayList<>();
        solicitudes.add(new BecaInvestigacion("Sofia Benitez", 120000.0));
        solicitudes.add(new BecaComedor("Carlos Ruiz", 90000.0));
        solicitudes.add(new BecaInvestigacion("Lena Ortiz", 150000.0));
        solicitudes.add(new BecaComedor("Diego Paz", 90000.0));

        double presupuesto = 0;
        System.out.println("--- DESGLOSE DE LAS SOLICITUDES ---");
        for (SolicitudBeca solicitud : solicitudes) {
            double monto = solicitud.calcularMontoAsignado();
            presupuesto += monto;
            System.out.printf("%-22s | %-18s | Monto base: $%.2f | Monto asignado: $%.2f%n",
                    solicitud.getSolicitante(), solicitud.getClass().getSimpleName(),
                    solicitud.getMontoBase(), monto);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("PRESUPUESTO TOTAL REQUERIDO: $%.2f%n", presupuesto);
    }
}
