public class EmailFactory extends NotificationFactory{
    @Override
    public Notification crearNotificacion() {
        return new NotificationEmail();
    }
}
