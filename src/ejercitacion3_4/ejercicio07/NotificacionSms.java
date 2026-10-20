package ejercitacion3_4.ejercicio07;

public class NotificacionSms implements NotificableCampus {
    private String numeroTelefono;

    public NotificacionSms(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[SMS]       Telefono: " + this.numeroTelefono + " | Mensaje: " + mensaje);
    }
}
