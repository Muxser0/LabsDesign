import devices.AirConditioner;
import devices.Heater;
import devices.LCDDisplay;
import sensor.TemperatureSensor;

public class Main {
    static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        AirConditioner airConditioner = new AirConditioner();
        Heater heater = new Heater();
        LCDDisplay lcdDisplay = new LCDDisplay();
        sensor.registerObserver(airConditioner);
        sensor.registerObserver(heater);
        sensor.registerObserver(lcdDisplay);
        float[] temperatures = {14, 18, 22, 27, 30, 15};
        for (float temp : temperatures) {
            sensor.setTemperature(temp);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}