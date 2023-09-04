public class Factorymain {
    public static void main(String args[])
    {
        ShapeFactory sF=new ShapeFactory();
        Shape s=sF.getShape("square");
        s.draw();

        Shape s1=ShapeFactory.getShape("circle");
    }
}

