<<<<<<< HEAD
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

/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5




}


=======
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

/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5




}


>>>>>>> c7d4dc96aacaddf400ad898dca067a479021e22a
 */