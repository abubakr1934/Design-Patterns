import java.util.ArrayList;

public class banned_class implements Banned{
    static ArrayList<String> a1 =new ArrayList<>();
    @Override
    public void add_site(String sitename) {
        if (!a1.contains(sitename)) {
            a1.add(sitename);
        } else {
            System.out.println("cant add duplicate");
        }
    }
    public void display(){
        System.out.println(a1);
    
}
