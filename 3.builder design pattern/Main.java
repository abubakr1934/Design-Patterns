public class Main {
    public static void main(String[] args) {
        Phone p1=new Phone.Builder().setScreensize(7).setOS("Ios").setRam(8).build();
        //static class is a class defined inside another class-this class allows multiple methods called simultaneously on a single line
        //build method returns the main phone object with all the properties contained in the builder class as object as its parameter

        System.out.println("The operating system of the phone is "+p1.getOS()+" ,the ram is "+p1.getRam()+"gb and screen size is "+p1.getScreensize()+" inches .");

        p1=new Phone.Builder().setOS("Android").setRam(12).setScreensize(12).build();
        System.out.println("The operating system of the phone is "+p1.getOS()+" ,the ram is "+p1.getRam()+"gb and screen size is "+p1.getScreensize()+" inches .");
    }
}
