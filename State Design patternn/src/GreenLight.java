public class GreenLight implements state{
    @Override
    public void changeLight(TrafficSignal obj) {
        System.out.println("current light of the signal : Green");
        obj.setNextState(new RedLight());
    }
}
