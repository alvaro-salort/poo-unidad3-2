package ejercitacion3_4.ejercicio09;

public interface Evaluable {
    // metodo abstracto: cada evaluacion define como se calcula su puntaje
    double obtenerPuntaje();

    // metodo default: comportamiento base reutilizable
    default boolean estaAprobado() {
        return this.obtenerPuntaje() >= 6.0;
    }
}
