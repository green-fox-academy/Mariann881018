public class Tree extends Plant {

  public Tree(String color, double currentWaterAmount){
    this.setColor(color);
    this.setCurrentWaterAmount(currentWaterAmount);
    boolean thirsty;
  }

  public String getType() {
    return this.getClass().getSimpleName();
  }

  public void checkIfNeedsWater() {
    String result = "";
    if (this.getCurrentWaterAmount() < 10){
      result = " needs water";
    } else
      result = " does not need water";
    System.out.println(result);
  }

  public boolean isThirsty(){
    if (getCurrentWaterAmount() < 10){
      return true;
    }
    return false;
  }

  public void info() {
    System.out.print("The " + getColor() + " " + getType() + "");
    checkIfNeedsWater();
  }
}
