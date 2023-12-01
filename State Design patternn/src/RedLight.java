public class RedLight implements state{

    @Override
    public void changeLight(TrafficSignal obj) {
        System.out.println("current light of the signal :Red");
        obj.setNextState(new YellowLight());
    }
}
