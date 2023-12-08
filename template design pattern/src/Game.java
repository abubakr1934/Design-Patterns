abstract class Game {
    public final void play(){
        jssofsportscommittee();
        initialize();//this is the template that will be followed for extending subclasses
        startPlay();
        endPlay();
    }
    void jssofsportscommittee()
    {
        System.out.println("devashree is jss of sports committee rcoem");
    }
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}
