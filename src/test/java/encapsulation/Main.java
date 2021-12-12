package encapsulation;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class Main {

    public static void main(String[] args) {
    ExampleToEncapsulation myExampleGetAge = new ExampleToEncapsulation();
    myExampleGetAge.setAge(33);
        System.out.println(myExampleGetAge.publicID);
    //    System.out.println(myExampleGetAge.age); - not access, encapsulation
        System.out.println(myExampleGetAge.getAge());
    }
}
