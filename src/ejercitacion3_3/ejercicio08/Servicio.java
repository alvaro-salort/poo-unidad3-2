package ejercitacion3_3.ejercicio08;

import java.util.ArrayList;
import java.util.List;

public class Servicio implements Pagable {
    private String nombreServicio;
    private double facturaImporte;

    public Servicio(String nombreServicio, double facturaImporte) {
        this.nombreServicio = nombreServicio;
        this.facturaImporte = facturaImporte;
    }

    @Override
    public double obtenerMontoPago() {
        return this.facturaImporte;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public double getFacturaImporte() {
        return facturaImporte;
    }

    public static void main(String[] args) {
        List<Pagable> pagos = new ArrayList<>();

        pagos.add(new Servicio("Internet fibra", 35000.0));
        pagos.add(new CompraProducto("Mouse Gamer", 45000.0, 2));
        pagos.add(new Servicio("Almacenamiento en la nube", 12000.0));
        pagos.add(new CompraProducto("Teclado mecanico", 85000.0, 1));

        double total = 0;
        System.out.println("--- DETALLE DE CADA MONTO A PAGAR ---");
        for (Pagable pagable : pagos) {
            double monto = pagable.obtenerMontoPago();
            total += monto;
            System.out.printf("[%s] Monto a pagar: $%.2f%n", pagable.getClass().getSimpleName(), monto);
        }
        System.out.println("----------------------------------------------");
        System.out.printf("TOTAL GENERAL A PAGAR: $%.2f%n", total);
    }
}
