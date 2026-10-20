package ejercitacion3_4.ejercicio07;

import java.util.ArrayList;

public class AvisoPlataforma implements NotificableCampus {
    private String modulo;

    public AvisoPlataforma(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[PLATAFORMA] Modulo: " + this.modulo + " | Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        ArrayList<NotificableCampus> notificaciones = new ArrayList<>();

        // clases disimiles conviviendo en la misma lista gracias al tipo comun
        notificaciones.add(new NotificacionEmail("alumnos@correo.com"));
        notificaciones.add(new NotificacionSms("+54 9 261 555 9876"));
        notificaciones.add(new AvisoPlataforma("Aula Virtual"));
        notificaciones.add(new NotificacionEmail("docentes@correo.com"));

        System.out.println("--- NOTIFICACIONES DEL CAMPUS VIRTUAL ---");
        for (NotificableCampus notificable : notificaciones) {
            notificable.enviarNotificacion("Vence el entrega del trabajo practico");
        }
    }
}
