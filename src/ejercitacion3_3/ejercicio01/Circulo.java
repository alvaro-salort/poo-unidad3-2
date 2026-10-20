package ejercitacion3_3.ejercicio01;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // implementacion concreta del metodo abstracto
    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
