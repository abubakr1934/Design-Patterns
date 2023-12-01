public interface LoanApprover {
    void setNextApprover(LoanApprover nextApprover);

    void processLoan(Loan l1);
}