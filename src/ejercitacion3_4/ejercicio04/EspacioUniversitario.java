package ejercitacion3_4.ejercicio04;

public abstract class EspacioUniversitario {
    private String nombre;

    public EspacioUniversitario(String nombre) {
        this.nombre = nombre;
    }

    // limpieza basica comun a todos los espacios
    public abstract void limpiar();

    public String getNombre() {
        return nombre;
    }

    // metodo cliente: limpia siempre y luego completa segun el tipo real
    public static void prepararEspacio(EspacioUniversitario espacio) {
        espacio.limpiar();

        if (espacio instanceof Laboratorio) {
            Laboratorio laboratorio = (Laboratorio) espacio;
            laboratorio.calibrarEquipos();
        } else if (espacio instanceof AulaMagna) {
            AulaMagna aula = (AulaMagna) espacio;
            aula.probarSistemaAudio();
        } else {
            System.out.println("No hay pasos adicionales para este tipo de espacio.");
        }
    }

    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio("Laboratorio de Quimica");
        AulaMagna aula = new AulaMagna("Aula Magna");

        System.out.println("PREPARACION DE UN LABORATORIO");
        prepararEspacio(laboratorio);

        System.out.println("\nPREPARACION DEL AULA MAGNA");
        prepararEspacio(aula);
    }
}
