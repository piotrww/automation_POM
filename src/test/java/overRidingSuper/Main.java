package overRidingSuper;

public class Main {

    public static void main(String[] args) {

        Father father = new Father();
        father.appeal();

        Daughter daughter = new Daughter();
        daughter.appeal();
        daughter.appealByFather();


    }
}
