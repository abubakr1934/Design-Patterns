public class sketchPenFactory implements PenFactory{
    @Override
    public Tube gettube() {
        return new Fiber();
    }

    @Override
    public Refill getrefill() {
        return new Sponge();
    }

    @Override
    public PenFactory getProduct() {
        this.gettube();
        this.getrefill();
        System.out.println("sketch pen composed");
        return this;
    }
}
