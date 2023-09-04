public class Sponge implements Refill{
    Sponge(){
        this.getrefill();
    }
    @Override
    public void getrefill() {
        System.out.println("sponge refill recieved");

    }
}
