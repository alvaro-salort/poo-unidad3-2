package ejercitacion3_3.ejercicio07;

import java.util.ArrayList;

public class NotificacionPush implements Notificable {
    private String dispositivo;

    public NotificacionPush(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[PUSH]     En: " + this.dispositivo + " | Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        ArrayList<Notificable> notificaciones = new ArrayList<>();

        // la lista guarda clases disimiles gracias al tipo comun Notificable
        notificaciones.add(new NotificacionEmail("alvaro@correo.com"));
        notificaciones.add(new NotificacionSMS("+54 9 261 555 1234"));
        notificaciones.add(new NotificacionPush("Samsung Galaxy S24"));
        notificaciones.add(new NotificacionEmail("profes@correo.com"));

        System.out.println("NOTIFICACIONES ENVIADAS");
        for (Notificable notificable : notificaciones) {
            notificable.enviarNotificacion("Mensaje de prueba");
        }
    }
}
