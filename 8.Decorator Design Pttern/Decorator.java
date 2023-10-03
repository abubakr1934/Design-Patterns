public class Decorator extends User{
    User u;
    public Decorator(String name,boolean admin){
        u = User(name,admin);
    }
}