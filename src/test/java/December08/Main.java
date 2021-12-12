package December08;

public class Main {

    public static void main(String[] args) {

        //
//        byte myByte = 4;
//
//        Wheel wheelWinter = new Wheel();




        Car myCar = new Car((byte) 4, new Wheel());
        System.out.println(myCar.getNumberOfWheels());

        myCar.setNumberOfWheels((byte)3);
        System.out.println(myCar.getNumberOfWheels());


//       myCar.setNumberOfWheels((byte)3);



    }


}
