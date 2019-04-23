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

/*
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4

 */