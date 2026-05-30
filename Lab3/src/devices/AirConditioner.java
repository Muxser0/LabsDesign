package devices;

import observer.Observer;

public class AirConditioner implements Observer {
    @Override
    public void update(float temperature) {
        if (temperature > 26) {
            System.out.println("Aire Acondicionado: ENCENDIDO");
        } else {
            System.out.println("Aire Acondicionado: APAGADO");
        }
    }
}