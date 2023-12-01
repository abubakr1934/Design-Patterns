public class CreditCard implements PaymentStrategy{
    String cardnumber;
    int cvv;
    CreditCard(String cardnumber,int cvv)
    {
        this.cardnumber=cardnumber;
        this.cvv=cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+ " paid via credit card ");

    }
}
