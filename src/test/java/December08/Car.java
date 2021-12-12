package December08;

public class Car {

    private byte numberOfWheels;
    private Wheel wheel;

    public Car(byte numberOfWheels, Wheel wheel) {
        this.numberOfWheels = numberOfWheels;
        this.wheel = wheel;
    }

    public void setNumberOfWheels(byte numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public byte getNumberOfWheels() {
        return numberOfWheels;
    }
}
