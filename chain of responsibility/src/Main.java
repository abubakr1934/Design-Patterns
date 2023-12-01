// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LoanApprover juniorLoanOfficer = new JuniorLoanOfficer();
        LoanApprover seniorLoanOfficer = new SeniorLoanOfficer();
        LoanApprover loanManager = new LoanManager();

        juniorLoanOfficer.setNextApprover(seniorLoanOfficer);
        seniorLoanOfficer.setNextApprover(loanManager);

        int loanAmount1 = 8000;
        int loanAmount2 = 45000;
        int loanAmount3 = 100000;
        Loan l1=new Loan("abubakr",150000);
        Loan l2=new Loan("devashree",1000000);

        juniorLoanOfficer.processLoan(l1);
        juniorLoanOfficer.processLoan(l2);
//        juniorLoanOfficer.processLoan(loanAmount3);
    }
}