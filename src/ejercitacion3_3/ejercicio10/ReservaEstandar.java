package ejercitacion3_3.ejercicio10;

public class ReservaEstandar extends Reserva {

    public ReservaEstandar(double precioBase) {
        super(precioBase);
    }

    // el costo final es el precio base
    @Override
    public double calcularCostoFinal() {
        return this.precioBase;
    }
}
