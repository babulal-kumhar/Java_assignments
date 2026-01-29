package Assignment2.q4;

interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class ShapeFactory{
    static Shape getShape(String type){
        if(type.equalsIgnoreCase("circle"))
            return new Circle();
        else if(type.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
}
public class Factory {
    public static void main(String[]args){
        Shape s1=ShapeFactory.getShape("circle");
        s1.draw();

        Shape s2=ShapeFactory.getShape("rectangle");
        s2.draw();
    }
}
