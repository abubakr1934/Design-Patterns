public class HomeTheatre {
    DVDPlayer p1;
    Amplifier p2;
    Screen p3;
    HomeTheatre(DVDPlayer p1,Amplifier p2,Screen p3)
    {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    void startHomeTheatre(){
        System.out.println("Get ready to watch a movie...");
        p1.play();
        p2.on();
        p3.screenon();
    }
    void stopHomeTheatre(){
        System.out.println("Shutting down the movie...");
        p1.stop();
        p2.off();
        p3.screenoff();
    }
}
