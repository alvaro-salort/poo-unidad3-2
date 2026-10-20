package ejercitacion3_3.ejercicio06;

// una clase puede implementar VARIAS interfaces a la vez
public class TelefonoInteligente implements Conectable, Recargable {
    private String marca;
    private int nivelBateria;

    public TelefonoInteligente(String marca, int nivelBateria) {
        this.marca = marca;
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void conectar() {
        System.out.println("El " + marca + " se conecto a la red.");
    }

    @Override
    public void desconectar() {
        System.out.println("El " + marca + " se desconecto de la red.");
    }

    @Override
    public void cargarBateria() {
        this.nivelBateria = 100;
        System.out.println("Bateria del " + marca + " cargada al " + this.nivelBateria + "%.");
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public static void main(String[] args) {
        TelefonoInteligente telefono = new TelefonoInteligente("Samsung", 45);

        System.out.println("--- COMO CONECTABLE ---");
        Conectable conectable = telefono;
        conectable.conectar();

        System.out.println("\n--- COMO RECARGABLE ---");
        Recargable recargable = telefono;
        recargable.cargarBateria();

        System.out.println("\n--- COMO TELFONO INTELIGENTE (clase concreta) ---");
        telefono.desconectar();
        System.out.printf("Nivel de bateria final: %d%%%n", telefono.getNivelBateria());
    }
}
