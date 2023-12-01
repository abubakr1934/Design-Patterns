public class YellowLight implements state{
    @Override
    public void changeLight(TrafficSignal obj) {
        System.out.println("current light of the signal : Yellow");
        obj.setNextState(new GreenLight());
    }
}
