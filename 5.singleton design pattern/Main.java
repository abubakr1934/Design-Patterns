
public class Main {
    public static void main(String[] args) {
        Singleton firstobj;
        Singleton secondobj;

        firstobj=Singleton.getInstance();
        secondobj=Singleton.getInstance();

        if(firstobj==secondobj)
        {
            System.out.println("same object");
        }



        singletonextended s1=singletonextended.getInstance();
        singletonextended s2=singletonextended.getInstance();




        s1.childclass();
        s2.childclass();

//        s1.childclass();
//        s2.childclass();

    }
}