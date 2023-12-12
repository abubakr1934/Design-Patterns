public class Main{
    public static void main(String[] args) {
        HomeTheatre h1=new HomeTheatre(new DVDPlayer(),new Amplifier(),new Screen());
        h1.startHomeTheatre();
        h1.stopHomeTheatre();
    }
}