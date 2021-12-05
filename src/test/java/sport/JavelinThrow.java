package sport;

public class JavelinThrow extends ParentPolishTeam implements SportsMethods {

  public int heartRateOfThisSportsMan;

  //New object:
  JavelinThrow marysia = new JavelinThrow(heartRateOfThisSportsMan);

  public JavelinThrow(int heartRateOfThisSportsMan) {
    this.heartRateOfThisSportsMan = heartRateOfThisSportsMan;
  }



  @Override
    public void heartRateOfSportsMan() {
        super.heartRateOfSportsMan();
  }

    @Override
    public int run() {

    return 0;
    }

    public String goToSportEvent() {

        return "test";
    }



}
