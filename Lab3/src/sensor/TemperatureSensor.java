package sensor;

import observer.Observer;
import observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Subject {
    private List<Observer> observers;
    private float temperature;
    public TemperatureSensor() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        System.out.println("\n>>> Temperatura actual: " + temperature + "°C");
        this.temperature = temperature;
        notifyObservers();
    }
}