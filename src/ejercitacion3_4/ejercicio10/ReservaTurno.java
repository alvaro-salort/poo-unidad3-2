package ejercitacion3_4.ejercicio10;

import java.util.ArrayList;

public abstract class ReservaTurno {
    protected String fecha;
    private String persona;

    public ReservaTurno(String persona, String fecha) {
        this.persona = persona;
        this.fecha = fecha;
    }

    // arancel especifico de cada tipo de turno
    public abstract double calcularArancel();

    public String getPersona() {
        return persona;
    }

    public String getFecha() {
        return fecha;
    }

    public static void main(String[] args) {
        ArrayList<ReservaTurno> turnos = new ArrayList<>();
        turnos.add(new TurnoBiblioteca("Julia Roldan", "2026-03-10"));
        turnos.add(new TurnoLaboratorio("Martin Sosa", "2026-03-11", 28000.0));
        turnos.add(new TurnoBiblioteca("Nicolas Ferreyra", "2026-03-12"));
        turnos.add(new TurnoLaboratorio("Ayelen Cruz", "2026-03-13", 35000.0));

        double total = 0;
        System.out.println("--- DETALLE DE CADA TURNO ---");
        for (ReservaTurno turno : turnos) {
            double arancel = turno.calcularArancel();
            total += arancel;
            System.out.printf("%-18s | %-18s | %-24s | Arancel: $%.2f%n",
                    turno.getPersona(), turno.getFecha(), turno.getClass().getSimpleName(), arancel);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("COSTO TOTAL DE ARANCELES: $%.2f%n", total);

        System.out.println("\n--- CANCELACION DE LOS TURNOS QUE LO PERMITEN ---");
        for (ReservaTurno turno : turnos) {
            if (turno instanceof Cancelable) {
                Cancelable cancelable = (Cancelable) turno;
                System.out.printf("%-18s -> cancelacion posible: %s%n",
                        turno.getPersona(), cancelable.cancelar());
            } else {
                System.out.printf("%-18s -> no admite cancelacion%n", turno.getPersona());
            }
        }
    }
}
