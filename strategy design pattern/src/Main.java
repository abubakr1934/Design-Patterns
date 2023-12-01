public class Main{
    public static void main(String[] args) {
        PaymentContext p1=new PaymentContext(new CreditCard("123456789",123));
        p1.execute(100);
        p1.set(new PayPal("ambegaonkard@rknec.edu","devashree123"));
        p1.execute(1000);
    }
}