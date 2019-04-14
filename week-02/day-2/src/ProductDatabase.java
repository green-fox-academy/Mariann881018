import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> productDatabase = new HashMap<>();
    productDatabase.put("Eggs", 200);
    productDatabase.put("Milk", 200);
    productDatabase.put("Fish", 400);
    productDatabase.put("Apples", 150);
    productDatabase.put("Bread", 50);
    productDatabase.put("Chicken", 550);

    System.out.println("Price of fish: " + checkPrice(productDatabase, "Fish"));
    System.out.println("The most expensive is: " + mostExpensive(productDatabase));
    System.out.println("The average price is: " + average(productDatabase));
    System.out.println("How many products' price is below 30: " + prodfor300(productDatabase));
    System.out.println("Anything for 125? " + anythingfor125(productDatabase));
    System.out.println("What is the cheapest product?" + cheapest(productDatabase));
  }

  public static int checkPrice(HashMap<String, Integer> inputList, String product) {
    int searchedPrice = inputList.get(product);
    return searchedPrice;
  }

  public static Map.Entry<String, Integer> mostExpensive(HashMap<String, Integer> inputList) {
    Map.Entry<String, Integer> maxEntry = null;
    for (Map.Entry<String, Integer> entry : inputList.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    return maxEntry;
  }

  public static int average(HashMap<String, Integer> inputList) {
    int sum = 0;
    int count = 0;
    int average = 0;

    for (int i : inputList.values()) {
      sum += i;
      count++;
    }
    average = sum / count;
    return average;
  }

  public static int prodfor300(HashMap<String, Integer> inputList) {
    int below300 = 0;
    for (String i : inputList.keySet()) {
      if (inputList.get(i) < 300) {
        below300++;
      }
    }
    return below300;
  }

  public static boolean anythingfor125 (HashMap<String, Integer> inputList){
    boolean a = false;
    if (inputList.containsValue(125)){
      a = true;
    }
      return a;
  }

  public static Map.Entry<String, Integer> cheapest(HashMap<String, Integer> inputList) {
    Map.Entry<String, Integer> minEntry = null;
    for (Map.Entry<String, Integer> entry : inputList.entrySet()) {
      if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0) {
        minEntry = entry;
      }
    }
    return minEntry;
  }
}

