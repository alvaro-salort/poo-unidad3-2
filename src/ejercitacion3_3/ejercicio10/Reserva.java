package ejercitacion3_3.ejercicio10;

import java.util.ArrayList;

public abstract class Reserva {
    protected double precioBase;

    public Reserva(double precioBase) {
        this.precioBase = precioBase;
    }

    // costo final especifico de cada tipo de reserva
    public abstract double calcularCostoFinal();

    public double getPrecioBase() {
        return precioBase;
    }

    public static void main(String[] args) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        reservas.add(new ReservaEstandar(45000.0));
        reservas.add(new ReservaVIP(120000.0));
        reservas.add(new ReservaEstandar(28000.0));
        reservas.add(new ReservaVIP(85000.0));

        double total = 0;
        System.out.println("--- DETALLE DE CADA RESERVA ---");
        for (Reserva reserva : reservas) {
            double costo = reserva.calcularCostoFinal();
            total += costo;
            System.out.printf("%-18s | Precio base: $%.2f | Costo final: $%.2f%n",
                    reserva.getClass().getSimpleName(), reserva.getPrecioBase(), costo);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("Costo acumulado del sistema: $%.2f%n", total);

        System.out.println("\n--- CANCELACION DE LAS RESERVAS ELEGIBLES ---");
        for (Reserva reserva : reservas) {
            if (reserva instanceof Cancelable) {
                // downcasting seguro: solo las ReservationVIP implementan Cancelable
                Cancelable cancelable = (Cancelable) reserva;
                System.out.printf("%s -> cancelable: %s%n",
                        reserva.getClass().getSimpleName(), cancelable.cancelar());
            } else {
                System.out.printf("%s -> no admite cancelacion%n", reserva.getClass().getSimpleName());
            }
        }
    }
}
