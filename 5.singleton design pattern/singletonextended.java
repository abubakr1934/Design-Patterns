public class singletonextended extends Singleton{
    static singletonextended s10=new singletonextended(7);
    int a;
    public singletonextended(int a)
    {
        super();
        this.a=a;
    }
    public static singletonextended getInstance(){
        return s10;
    }
    public void childclass(){
        System.out.println(" in the child class of singleton "+a);
    }
}
