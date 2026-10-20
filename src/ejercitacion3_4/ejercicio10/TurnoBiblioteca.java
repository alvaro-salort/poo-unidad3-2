package ejercitacion3_4.ejercicio10;

public class TurnoBiblioteca extends ReservaTurno {

    public TurnoBiblioteca(String persona, String fecha) {
        super(persona, fecha);
    }

    // el turno de biblioteca no tiene arancel
    @Override
    public double calcularArancel() {
        return 0.0;
    }
}
