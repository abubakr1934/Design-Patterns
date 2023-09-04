public class ShapeFactory {
    public static Shape getShape(String shape)
    {
        if(shape.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        else if(shape.equalsIgnoreCase("Circle"))
        {
            return new circle();
        }
        else if(shape.equals("Triangle"))
        {
            return new triangle();  
        }
        else{
            return null;
        }
    }

}
