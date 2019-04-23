//////////// not completed yet //////////
import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Flower> flowers;
  List<Tree> trees;

  public Garden(){
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
  }

  void addFlowers(Flower flower){
    flowers.add(flower);
  }

  /*
  void checkStatus(){
    if (){
      System.out.println(" needs water.");
    } else {
      System.out.println(" doesn't need water");
    }
  }

   */

  void getInfo(){
    System.out.println(flowers);

  }

}