public class Metal implements Tube{
    Metal(){
        this.gettube();
    }
    @Override
    public void gettube() {
        System.out.println("metal tube recieved");

    }
}
