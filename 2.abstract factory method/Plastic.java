import java.sql.Ref;

public class Plastic implements Refill {
    Plastic(){
        this.getrefill();
    }
    public void getrefill(){
        System.out.println("Plastic Refill recieved");
    }
}
