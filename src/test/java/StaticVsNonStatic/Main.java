package StaticVsNonStatic;

public class Main {

    public static void main(String[] args) {
        //calling static
        ClassA.sum(5, 12);


        //calling non-static;
        ClassA myObjectA = new ClassA();
        myObjectA.multiply(44, 12);
    }

}
