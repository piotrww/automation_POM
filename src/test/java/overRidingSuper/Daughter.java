package overRidingSuper;

public class Daughter extends Father {


    public void appeal() {

        System.out.println("I am the daughter");
    }

//    public void appealExtra() {
//
//        System.out.println("I am the daughter extra, over father");
//    }

    public void appealByFather() {
        super.appealByFather();
        System.out.println("I am the daughter again!");
    }



}
