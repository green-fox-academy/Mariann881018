public class Plant {
  String color;
  int wateramount;
  boolean needsWater;

  public Plant(){
  }

  public Plant(String color, int wateramount, boolean needsWater) {
    this.color = color;
    this.wateramount = wateramount;
    this.needsWater = needsWater;
  }

  void watering(int num) {
    if (this.needsWater) {
      this.wateramount += num;
    }
  }
}
