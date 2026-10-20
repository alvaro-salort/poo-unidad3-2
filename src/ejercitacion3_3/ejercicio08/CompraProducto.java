package ejercitacion3_3.ejercicio08;

public class CompraProducto implements Pagable {
    private String nombreProducto;
    private double precioUnitario;
    private int cantidad;

    public CompraProducto(String nombreProducto, double precioUnitario, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    @Override
    public double obtenerMontoPago() {
        return this.precioUnitario * this.cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
}
