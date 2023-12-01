public class TrafficSignal {
    private state newState;
    TrafficSignal(){
        newState=new RedLight();
    }
    void setNextState(state s1){
        newState=s1;
    }
    void changeLightColor(){
        newState.changeLight(this);
    }
}
