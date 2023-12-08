public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("football game comprising of 11 players initialized");
    }

    @Override
    void startPlay() {
        System.out.println("game started you have 90+6 minutes");
    }

    @Override
    void endPlay() {
        System.out.println("time ended thank you for playing");
    }
}
