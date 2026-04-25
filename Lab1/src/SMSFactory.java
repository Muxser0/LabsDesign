public class SMSFactory extends NotificationFactory{
    @Override
    public Notification crearNotificacion() {
        return new NotificationSMS();
    }
}
