public class gelPenFactory implements PenFactory{
    @Override
    public Tube gettube() {

        return new Metal();
    }

    @Override
    public Refill getrefill() {
        return new Plastic();
    }

    @Override
    public PenFactory getProduct() {

        this.gettube();

        this.getrefill();

        System.out.println("gel pen composed");
        return this;
    }
}
