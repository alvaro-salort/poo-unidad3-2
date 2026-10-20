package ejercitacion3_4.ejercicio04;

public class AulaMagna extends EspacioUniversitario {

    public AulaMagna(String nombre) {
        super(nombre);
    }

    @Override
    public void limpiar() {
        System.out.println("Limpieza general de " + this.getNombre() + " en curso.");
    }

    public void probarSistemaAudio() {
        System.out.println("Sistema de audio de " + this.getNombre() + " probado correctamente.");
    }
}
