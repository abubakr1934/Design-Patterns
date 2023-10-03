public class Main{
    public static void main(String args[]){
        User u = new LoginDecorator(new Decorator("Abubakr Khanooni",true));
        u.Show();

        User y = new LoginDecorator(new Decorator("Devashree Ambegaokar",false));
        y.Show();

    }
}