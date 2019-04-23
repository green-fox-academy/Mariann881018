public class Flower extends Plant {


  public Flower(String color, int wateramount, boolean needsWater) {
    super(color, wateramount, needsWater);
  }

  void needWatering(){
    if (this.wateramount < 5){
      needsWater = true;
    }
  }




}

/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
 */