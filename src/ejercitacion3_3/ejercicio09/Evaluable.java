package ejercitacion3_3.ejercicio09;

public interface Evaluable {
    // metodo abstracto: cada implementador define su propia nota
    double obtenerPuntaje();

    // metodo default: comportamiento base reutilizable sin romper las implementaciones
    default boolean esAprobado() {
        return this.obtenerPuntaje() >= 6.0;
    }
}
