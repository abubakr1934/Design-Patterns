import java.util.ArrayList;
import java.util.List;

// Concrete Subject class implementing the Subject interface
public class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers(); // Notify observers when state changes
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
}
