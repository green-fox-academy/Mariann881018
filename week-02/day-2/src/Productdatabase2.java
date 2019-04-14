import java.util.HashMap;
import java.util.Map;

public class Productdatabase2 {
  public static void main(String[] args) {
    HashMap<String, Integer> productDatabase = new HashMap<>();
    productDatabase.put("Eggs", 200);
    productDatabase.put("Milk", 200);
    productDatabase.put("Fish", 400);
    productDatabase.put("Apples", 150);
    productDatabase.put("Bread", 50);
    productDatabase.put("Chicken", 550);
    myFunction(productDatabase);

  }

  public static void myFunction(HashMap<String, Integer> inputList){
    for (Map.Entry<String, Integer> templist : inputList.entrySet()){
      if (templist.getValue() < 201) {
        System.out.println(templist.getKey());
      }
    }

    for (Map.Entry<String, Integer> templist : inputList.entrySet()){
      if (templist.getValue() > 150) {
        System.out.println(templist.getKey() + " " + templist.getValue());
      }
    }
  }
}


//Which products cost less than 201? (just the name)
//Which products cost more than 150? (name + price)
/*
Product database 2
We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
Create a map with the following key-value pairs.
Product name (key)   Price (value)
Eggs                 200
Milk                 200
Fish                 400
Apples               150
Bread                 50
Chicken              550
Create an application which solves the following problems.
Which products cost less than 201? (just the name)
Which products cost more than 150? (name + price)
 */