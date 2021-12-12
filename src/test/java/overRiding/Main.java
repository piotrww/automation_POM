package overRiding;

public class Main {

    public static void main(String[] args) {

        SuperClass myS1 = new SuperClass();
        myS1.setName("myS1 | test");
        System.out.println(myS1.getName());

        SubClass mySub = new SubClass();
        mySub.setName("mySub | 2");
        System.out.println(mySub.getName());


    }
}
