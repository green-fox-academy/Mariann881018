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

  void checkStatus(){
    if (flowers){
      System.out.println(" needs water.");
    } else {
      System.out.println(" doesn't need water");
    }
  }

  void getInfo(){
    System.out.println(flowers);

  }

}

/*

The yellow Flower needs water
The blue Flower needs water
The purple Tree needs water
The orange Tree needs water

oneFlower.color + " Flower " + needs water

The Garden
is able to hold unlimited amount of flowers or trees
when watering it should only water those what needs water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10


 */
