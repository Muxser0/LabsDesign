public class NotificationPush implements Notification{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Push: " + mensaje);
    }
}
