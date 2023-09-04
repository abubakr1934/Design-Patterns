public abstract class Shape {
    abstract void draw() ;
}
class circle extends Shape{
    public void draw()
    {
        System.out.println("drawing a circle");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("drawing a square");
    }
}
class triangle extends Shape{
    public void draw(){
        System.out.println("drawing a triangle");
    }
}
