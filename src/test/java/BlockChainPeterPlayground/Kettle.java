package BlockChainPeterPlayground;

public class Kettle {

    String kettleName;
    int minTemp;
    int roomTemp;
    int boilingTemp;


    public int setMinTemp(int minTemp) {
        this.minTemp = minTemp;
        System.out.println(minTemp);
        return minTemp;
    }

    public int setRoomTemp(int roomTemp) {
        this.roomTemp = roomTemp;
        return roomTemp;
    }

    public int setBoilingTemp(int boilingTemp) {
        this.boilingTemp = boilingTemp;
        return boilingTemp;
    }

    public int getMinTemp() {
        return this.minTemp;
    }

    public int getRoomTemp() {
        return this.roomTemp;
    }


    public int setBoilingTemp() {
        return this.boilingTemp;
    }
}
