package ejercitacion3_3.ejercicio07;

public class NotificacionEmail implements Notificable {
    private String destinatario;

    public NotificacionEmail(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[EMAIL]    Para: " + this.destinatario + " | Mensaje: " + mensaje);
    }
}
