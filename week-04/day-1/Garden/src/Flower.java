//////////// not completed yet //////////
public class Flower extends Plant {

  public Flower(){
  }

  public Flower(String color, int wateramount, boolean needsWater) {
    super(color, wateramount, needsWater);
  }

  void needWatering(){
    if (this.wateramount < 5){
      this.needsWater = true;
    }
  }

@Override
  void watering(int num) {
    if (this.needsWater) {
      this.wateramount += (num * 0.75);
    }
  }
}
