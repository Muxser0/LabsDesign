package devices;
import observer.Observer;

public class Heater implements Observer {
    @Override
    public void update(float temperature) {
        if (temperature < 16) {
            System.out.println("Calefactor: ENCENDIDO");
        } else {
            System.out.println("Calefactor: APAGADO");
        }
    }
}
