package ejercitacion3_3.ejercicio04;

public class Auto extends Vehiculo {
    private String marca;
    private String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void abrirBaul() {
        System.out.println("El baul del " + marca + " " + modelo + " se abrio.");
    }
}
