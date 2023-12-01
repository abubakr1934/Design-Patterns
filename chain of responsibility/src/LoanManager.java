import java.sql.SQLOutput;

public class LoanManager implements LoanApprover{
    private LoanApprover nextApprover;
    @Override
    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover=nextApprover;

    }

    @Override
    public void processLoan(Loan l1) {
        System.out.println("loan is approved by loan manager ");
    }
}
