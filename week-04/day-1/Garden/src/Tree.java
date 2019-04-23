//////////// not completed yet //////////
public class Tree extends Plant{

  public Tree(String color, int wateramount, boolean needsWater) {
    super(color, wateramount, needsWater);
  }

  void needWatering(){
    if (this.wateramount < 10){
      needsWater = true;
    }
  }

  @Override
  void watering(int num) {
    if (needsWater) {
      this.wateramount += (num * 0.4);
    }
  }

}
