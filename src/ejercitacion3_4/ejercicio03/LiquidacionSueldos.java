package ejercitacion3_4.ejercicio03;

public class LiquidacionSueldos {

    // el cliente trabaja con el tipo abstracto y no conoce las subclases concretas
    public void procesarPago(PersonalUniversitario p) {
        System.out.printf("%-8s %-15s | Sueldo a cobrar: $%.2f%n",
                p.getLegajo(), p.getNombre(), p.calcularSueldoCobrar());
    }
}
