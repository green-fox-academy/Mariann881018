import java.util.*;
public class Matchmaking{

  public static void main(String... args){

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // If someone has no pair, he/she should be the element of the list too
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girlsList, ArrayList<String> boysList){
    ArrayList<String> newList = new ArrayList<>(boysList);
    for (int i = 0; i < girlsList.size(); i++) {
      newList.add(2*i, girlsList.get(i)); // to every 2nd index insert girls into boysList
    }
    return newList;
  }
}