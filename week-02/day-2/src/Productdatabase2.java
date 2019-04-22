import java.util.HashMap;
import java.util.Map;

public class Productdatabase2 {
  public static void main(String[] args) {
    Map<String, Integer> database = new HashMap<>();
    database.put("Eggs",200);
    database.put("Milk",200);
    database.put("Fish",400);
    database.put("Apples",150);
    database.put("Bread",50);
    database.put("Chicken",550);

    for (Map.Entry<String,Integer> prices : database.entrySet()){
      if (prices.getValue() < 201 ) {
        System.out.println(prices.getKey());
      }
    }

    for (Map.Entry<String,Integer> pricecheck : database.entrySet()){
      if (pricecheck.getValue() > 150){
        System.out.println(pricecheck.getKey() + " - " + pricecheck.getValue());
      }
    }

  }
}


/*
Create an application which solves the following problems.
Which products cost less than 201? (just the name)
Which products cost more than 150? (name + price)
 */