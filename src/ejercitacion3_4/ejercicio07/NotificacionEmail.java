package ejercitacion3_4.ejercicio07;

public class NotificacionEmail implements NotificableCampus {
    private String destinatario;

    public NotificacionEmail(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[EMAIL]     Destinatario: " + this.destinatario + " | Mensaje: " + mensaje);
    }
}
