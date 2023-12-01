public class PaymentContext {
    PaymentStrategy paymentmethod;
    PaymentContext(PaymentStrategy paymentmethod)
    {
        this.paymentmethod=paymentmethod;
    }
    void set(PaymentStrategy paymentmethod)
    {
        this.paymentmethod=paymentmethod;
    }
    void execute(int amount)
    {
        paymentmethod.pay(amount);
    }
}
