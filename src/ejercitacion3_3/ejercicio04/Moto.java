package ejercitacion3_3.ejercicio04;

public class Moto extends Vehiculo {
    private String marca;
    private String modelo;

    public Moto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void hacerPique() {
        System.out.println("La " + marca + " " + modelo + " hace un pique.");
    }
}
