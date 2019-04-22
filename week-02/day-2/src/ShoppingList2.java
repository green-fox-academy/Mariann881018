import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {
    Map<String, Double> prodList = new HashMap<>();
    prodList.put("Milk", 1.07);
    prodList.put("Rice", 1.59);
    prodList.put("Eggs", 3.14);
    prodList.put("Cheese", 12.60);
    prodList.put("Chicken Breast", 9.40);
    prodList.put("Apples", 2.31);
    prodList.put("Tomato", 2.58);
    prodList.put("Potato", 1.75);
    prodList.put("Onion", 1.10);

    Map<String, Integer> bobList = new HashMap<>();
    bobList.put("Milk", 3);
    bobList.put("Rice", 2);
    bobList.put("Eggs", 2);
    bobList.put("Cheese", 1);
    bobList.put("Chicken Breast", 4);
    bobList.put("Apples", 1);
    bobList.put("Tomato", 2);
    bobList.put("Potato", 1);

    Map<String, Integer> aliceList = new HashMap<>();
    aliceList.put("Rice", 1);
    aliceList.put("Eggs", 5);
    aliceList.put("Chicken Breast", 2);
    aliceList.put("Apples", 1);
    aliceList.put("Tomato", 10);

    int bobbought = 0;
    double bobTotal = 0;
    for (String key : bobList.keySet()) {
      bobTotal += bobList.get(key) * prodList.get(key);
      bobbought += bobList.get(key);
    }
    System.out.println("Bob pays " + bobTotal);

    int alicebought = 0;
    double aliceTotal = 0;
    for (String key : aliceList.keySet()) {
      aliceTotal += aliceList.get(key) * prodList.get(key);
      alicebought += aliceList.get(key);
    }
    System.out.println("Alice pays " + aliceTotal);

    if (aliceList.get("Rice") > bobList.get("Rice")) {
      System.out.println("Alice buys more rice");
    } else {
      System.out.println("Bob buys more rice");
    }

    if (!aliceList.containsKey("Potato") || (bobList.get("Potato") > aliceList.get("Potato"))) {
      System.out.println("Bob buys more potatoes");
    } else {
      System.out.println("Alice buys more potatoes");
    }

    if (bobList.size() > aliceList.size()){
      System.out.println("Bob buys more diff products");
    } else {
      System.out.println("Alice buys more diff products");
    }

    if (bobbought > alicebought) {
      System.out.println("Bob buys more pieces");
    } else {
      System.out.println("Alice buys more pieces");
    }
  }
}
