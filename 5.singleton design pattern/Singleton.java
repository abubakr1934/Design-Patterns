public class Singleton {
    int a=5;
    private  static final Singleton singleton=new Singleton();

    public Singleton(){
        System.out.println("singleton object created");
    }
    public static Singleton getInstance()
    {
        return singleton;
    }

    public void display(){
        System.out.println("main singleton class");
    }

}
