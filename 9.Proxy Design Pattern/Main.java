public class Main{
    public static void main(String[] args) {
        Proxy proxy=new Proxy_Impl();
        proxy.add_site("xyz.com");
        proxy.display();
    }
}