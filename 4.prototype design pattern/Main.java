
public class Main {
    public static void main(String[] args) {
        Chess c1=new Chess("rubber",64,"green",32);
        Tic_tac_toe t1=new Tic_tac_toe("wood",9,"blue");

        Chess c2= (Chess) c1.getclone();
        Tic_tac_toe t2=(Tic_tac_toe)t1.getclone();

        System.out.println("for chess");

        c1.show_details();
        c2.show_details();

        System.out.println("for tic tac now");

        t1.show_details();
        t2.show_details();

    }
}