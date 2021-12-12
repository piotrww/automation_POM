package BlockChainPeterPlayground;


public class Main {

    public static void main(String[] args) {


        Kettle myKettle = new Kettle();
        myKettle.setMinTemp(1);
        myKettle.setRoomTemp(44);
        myKettle.setBoilingTemp(213);

        System.out.println(myKettle.getMinTemp());


        String myName = "Zdzi";


        String myNewName = myName.toLowerCase().concat("cho");

        System.out.println(myNewName);

       // myName.toLowerCase().concat("cho"); ASK!
       // System.out.println(myName);


    }
}
