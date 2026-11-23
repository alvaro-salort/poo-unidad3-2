package ejercitacion3_3.ejercicio01;

public abstract class FiguraGeometrica {
    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // metodo abstracto: toda subclase concreta DEBE implementarlo
    public abstract double calcularArea();

    // metodo concreto heredado por todas las subclases
    public String getColor() {
        return this.color;
    }

    public static void main(String[] args) {
        /*
         * Una clase abstracta NO se puede instanciar directamente:
         *
         *   FiguraGeometrica figura = new FiguraGeometrica("rojo");  // no compila
         *
         * error: cannot instantiate abstract class FiguraGeometrica
         */

        Circulo circulo = new Circulo("rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("azul", 4.0, 6.0);

        System.out.println("AREAS DE LAS FIGURAS");
        System.out.printf("Circulo %-8s radio: %.2f | Area: %.2f%n",
                circulo.getColor(), circulo.getRadio(), circulo.calcularArea());
        System.out.printf("Rectangulo %-6s base: %.2f | Altura: %.2f | Area: %.2f%n",
                rectangulo.getColor(), rectangulo.getBase(), rectangulo.getAltura(), rectangulo.calcularArea());

        // el metodo abstracto se puede invocar sobre cualquier referencia de tipo abstracto
        FiguraGeometrica figura = circulo;
        System.out.println("\nLLAMADA POLIMORFICA AL METODO ABSTRACTO");
        System.out.printf("Area desde la referencia abstracta: %.2f%n", figura.calcularArea());
    }
}
