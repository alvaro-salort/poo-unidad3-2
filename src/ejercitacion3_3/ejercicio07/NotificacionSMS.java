package ejercitacion3_3.ejercicio07;

public class NotificacionSMS implements Notificable {
    private String numeroTelefono;

    public NotificacionSMS(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[SMS]      Al: " + this.numeroTelefono + " | Mensaje: " + mensaje);
    }
}
