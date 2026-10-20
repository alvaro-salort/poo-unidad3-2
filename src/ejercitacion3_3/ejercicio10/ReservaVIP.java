package ejercitacion3_3.ejercicio10;

public class ReservaVIP extends Reserva implements Cancelable {
    private String nombrePasajero;

    public ReservaVIP(double precioBase) {
        super(precioBase);
        this.nombrePasajero = "Pasajero VIP";
    }

    // el costo final incluye un recargo fijo del 30%
    @Override
    public double calcularCostoFinal() {
        return this.precioBase * 1.30;
    }

    // unica subclase que implementa la interfaz Cancelable
    @Override
    public boolean cancelar() {
        System.out.println("Cancelacion de " + this.nombrePasajero + " gestionada con penalidad del 30%.");
        return true;
    }
}
