public class WeatherStationDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        PhoneAppDisplay phoneAppDisplay = new PhoneAppDisplay();
        PhoneAppDisplay p1=new PhoneAppDisplay();

        // Register observers with the subject
        weatherStation.registerObserver(tempDisplay);
        weatherStation.registerObserver(phoneAppDisplay);

        // Simulate temperature changes
        weatherStation.setTemperature(25); // Notifies both observers

        // Unregister an observer
        weatherStation.removeObserver(tempDisplay);

        // Simulate temperature changes after removal
        weatherStation.setTemperature(30); // Only the PhoneAppDisplay observer is notified
    }
}
