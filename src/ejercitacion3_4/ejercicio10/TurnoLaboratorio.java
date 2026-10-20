package ejercitacion3_4.ejercicio10;

public class TurnoLaboratorio extends ReservaTurno implements Cancelable {
    private double costoReactivos;

    public TurnoLaboratorio(String persona, String fecha, double costoReactivos) {
        super(persona, fecha);
        this.costoReactivos = costoReactivos;
    }

    // el arancel es el costo de los reactivos
    @Override
    public double calcularArancel() {
        return this.costoReactivos;
    }

    // unica subclase que implementa la interfaz Cancelable
    @Override
    public boolean cancelar() {
        System.out.println("Cancelacion del turno de laboratorio de " + this.getPersona() + " gestionada.");
        return true;
    }
}
