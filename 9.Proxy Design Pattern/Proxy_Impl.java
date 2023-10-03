public class Proxy_Impl implements Proxy{
    private banned_class bl;
    Proxy_Impl()
    {

        bl=new banned_class();
    }
    @Override
    public void add_site(String sitename) {
        bl.add_site(sitename);

    }

    @Override
    public void display() {
        bl.display();
    }

}
