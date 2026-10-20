package ejercitacion3_4.ejercicio04;

public class Laboratorio extends EspacioUniversitario {

    public Laboratorio(String nombre) {
        super(nombre);
    }

    @Override
    public void limpiar() {
        System.out.println("Limpieza general de " + this.getNombre() + " en curso.");
    }

    public void calibrarEquipos() {
        System.out.println("Equipos de " + this.getNombre() + " calibrados.");
    }
}
