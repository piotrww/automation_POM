package overRiding2;

public class Main {

    public static void main(String args[])
    {
        //creating object of Base class Shape
        // If a Parent type reference refers
        // to a Parent object, then Parent's draw() method is called
        Shape obj = new Shape();
        obj.draw();
        // If a Parent type reference refers to a Child object Child's draw() method is called.
        //This is called RUN TIME POLYMORPHISM.
        Shape obj1=new Circle();
        obj1.draw();
    }
}
