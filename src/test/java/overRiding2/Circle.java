package overRiding2;

public class Circle extends Shape {

    //Overriding method of base class with different implementation
    @Override
    void draw()
    {
        System.out.println("Inside the overridden method of the CHILD class ");
        System.out.println("Drawing Circle");
    }
}
