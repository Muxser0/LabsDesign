import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de notificación: ");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese el mensaje de la notificación: ");
        String mensaje = scanner.nextLine();

        NotificationFactory factory;

        switch (tipo.toUpperCase()) {
            case "SMS":
                factory = new SMSFactory();
                break;
            case "EMAIL":
                factory = new EmailFactory();
                break;
            case "PUSH":
                factory = new PushFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado");
        }

        Notification notification = factory.crearNotificacion();
        notification.enviar(mensaje);
    }
}