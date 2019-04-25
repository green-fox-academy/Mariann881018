public class GardenApp {
  public static void main(String[] args) {

    Flower flowerOne = new Flower("yellow",0);
    Flower flowerTwo = new Flower("blue",0);
    Tree treeOne = new Tree("purple",0);
    Tree treeTwo = new Tree("orange",0);

    Garden myGarden = new Garden();
    myGarden.addFlower(flowerOne);
    myGarden.addFlower(flowerTwo);
    myGarden.addTree(treeOne);
    myGarden.addTree(treeTwo);
    myGarden.getStatus();
    myGarden.watering(40);
    myGarden.watering(70);
  }
}
