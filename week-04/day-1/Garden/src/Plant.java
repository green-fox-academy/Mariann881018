<<<<<<< HEAD
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
=======
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
>>>>>>> c7d4dc96aacaddf400ad898dca067a479021e22a
