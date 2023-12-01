public class Loan {
    String name;
    int loan_amount;

    public Loan(String name, int loan_amount) {
        this.name = name;
        this.loan_amount = loan_amount;
    }

    public String getName() {
        return name;
    }

    public int getLoan_amount() {
        return loan_amount;
    }
}
