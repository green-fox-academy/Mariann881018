import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Flower> flowersList;
  List<Tree> treesList;

  public Garden() {
    this.flowersList = new ArrayList<>();
    this.treesList = new ArrayList<>();
  }

  void addFlower(Flower flower) {
    flowersList.add(flower);
  }

  void addTree(Tree tree) {
    treesList.add(tree);
  }

  public void getStatus(){
    for (Flower flower : flowersList)
      flower.info();
    for (Tree tree : treesList)
      tree.info();
    }

    public void watering(int water){
      System.out.println();
      System.out.println("Watering with " + water);
      int countThirstyPlants = 0;
      for (Flower flower : flowersList)
        if (flower.isThirsty()){
          countThirstyPlants++;
        }
      for (Tree tree : treesList)
        if (tree.isThirsty()){
          countThirstyPlants++;
        }
      int newWaterAmount = water / countThirstyPlants;

      for (Flower flower : flowersList)
        flower.setCurrentWaterAmount((newWaterAmount * 0.75));
      for (Tree tree : treesList)
        tree.setCurrentWaterAmount((newWaterAmount * 1.4));
      for (Flower flower : flowersList)
        flower.info();
      for (Tree tree : treesList)
        tree.info();
    }
}
