package devices;
import observer.Observer;

public class LCDDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Pantalla LCD: Temperatura = " + temperature + "°C");
    }
}