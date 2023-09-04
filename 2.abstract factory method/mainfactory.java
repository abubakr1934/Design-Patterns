public class mainfactory implements PenFactory {
    String pen;
    mainfactory(String type_of_pen)
    {
        this.pen=type_of_pen;
        this.objectreturn();


    }
     public PenFactory objectreturn(){
        if(pen.equalsIgnoreCase("gelpen"))
        {
            System.out.println("hello1");
            return new gelPenFactory();


        }
        else {
            System.out.println("hello2");
            return new sketchPenFactory();
        }

    }
    @Override
    public Tube gettube() {
        return null;
    }

    @Override
    public Refill getrefill() {
        return null;
    }

    @Override
    public PenFactory getProduct() {
        return null;
    }

}
