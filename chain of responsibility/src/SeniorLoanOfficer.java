public class SeniorLoanOfficer implements LoanApprover{
    private LoanApprover nextApprover;
    @Override
    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover=nextApprover;
    }

    @Override
    public void processLoan(Loan l1) {
        if(l1.getLoan_amount()<=200000)
        {
            System.out.println("loan approved by senior loan officer");
        }
        else{
            nextApprover.processLoan(l1);
        }

    }
}
