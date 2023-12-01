public class JuniorLoanOfficer implements LoanApprover{
    private LoanApprover nextApprover;
    @Override
    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover=nextApprover;

    }

    @Override
    public void processLoan(Loan l1) {
        int loanAmount=l1.getLoan_amount();
        if(loanAmount<=100000)
        {
            System.out.println("loan has been approved by junior loan officer ");
        }
        else{
                nextApprover.processLoan(l1);
        }

    }
}
