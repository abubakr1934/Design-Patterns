public class Chess extends Game{
    @Override
    void initialize() {
        System.out.println("chess game comprising of 2 players initialized");
    }

    @Override
    void startPlay() {
        System.out.println("10 minutes each to play");
    }

    @Override
    void endPlay() {
        System.out.println("time ended p1 wins");
    }
}
