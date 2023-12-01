public class PayPal implements PaymentStrategy{
    String email;
    String password;
    PayPal(String email,String password)
    {
        this.email=email;
        this.password=password;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid via paypal");
    }
}
