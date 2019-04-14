import java.util.*;
public class Candyshop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);
    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream" No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }
  public static List sweets (ArrayList<Object> inputList) {

    inputList.set(1,"Croissant");
    inputList.set(3, "Ice Cream");
    return inputList;
  }

}
/*
  public static List appendA (List<String> inputList){
    for (int i = 0; i < inputList.size(); i++){
      inputList.set(i, inputList.get(i) + "a");
    }
    return inputList;
  }
 */