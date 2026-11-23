package ejercitacion3_3.ejercicio05;

public class Factura implements Imprimible {
    private String numero;
    private double importe;

    public Factura(String numero, double importe) {
        this.numero = numero;
        this.importe = importe;
    }

    @Override
    public void imprimir() {
        System.out.printf("Factura Nro %-10s | Importe: $%.2f%n", this.numero, this.importe);
    }

    public String getNumero() {
        return numero;
    }

    public double getImporte() {
        return importe;
    }

    public static void main(String[] args) {
        // dos variables de referencia del tipo interfaz, con implementaciones distintas
        Imprimible documento1 = new Factura("F-0001", 45500.0);
        Imprimible documento2 = new Reporte("Ventas del mes", 12);

        System.out.println("IMPRESION POLIMORFICA SOBRE EL TIPO Imprimible");
        documento1.imprimir();
        documento2.imprimir();
    }
}
