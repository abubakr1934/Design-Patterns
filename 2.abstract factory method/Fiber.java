public class Fiber implements Tube{
    Fiber(){
        this.gettube();
    }

    @Override
    public void gettube() {
        System.out.println("fiber tube recieved");

    }
}
