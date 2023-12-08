// Concrete Observer classes implementing the Observer interface
public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: " + temperature);
        // Logic to update temperature display
    }
}

class PhoneAppDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Phone App Display: " + temperature);
        // Logic to update phone app display
    }
}
