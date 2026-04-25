public class PushFactory extends NotificationFactory{
    @Override
    public Notification crearNotificacion() {
        return new NotificationPush();
    }
}
