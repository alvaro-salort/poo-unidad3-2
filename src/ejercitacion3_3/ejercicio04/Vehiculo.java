package ejercitacion3_3.ejercicio04;

public class Vehiculo {

    public void encender() {
        System.out.println("Vehículo encendido");
    }

    // metodo cliente: siempre enciende y despues completa la accion segun el tipo real
    public static void probarVehiculo(Vehiculo v) {
        v.encender();

        if (v instanceof Auto) {
            // downcasting seguro: solo se hace si la comprobacion fue verdadera
            Auto auto = (Auto) v;
            auto.abrirBaul();
        } else if (v instanceof Moto) {
            Moto moto = (Moto) v;
            moto.hacerPique();
        } else {
            System.out.println("No hay acciones especificas para este tipo de vehiculo.");
        }
    }

    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota", "Etios");
        Vehiculo moto = new Moto("Honda", "XR150L");

        System.out.println("--- PRUEBA CON UN AUTO ---");
        probarVehiculo(auto);

        System.out.println("\n--- PRUEBA CON UNA MOTO ---");
        probarVehiculo(moto);
    }
}
