import java.util.*;
public class ElementFinder{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
  }

  public static String containsSeven(ArrayList<Integer> inputList) {
    String result;
    if (inputList.contains(7)) {
      result ="Hoorray";
    } else {
      result = "Noooooo";
    } return result;
  }

  public static String containSeven(ArrayList<Integer> inputList){
    String result;
    List<Integer> nextList = new ArrayList<>(Arrays.asList(7));
    if (inputList.containsAll(nextList)){
     result = "Hoorray";
    } else {
      result = "Noooooo";
    }
    return result;
  }

}