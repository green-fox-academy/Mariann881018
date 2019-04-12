import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    List<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    List<String> listB = listA;

    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    System.out.println("ListB now:" + listB);
    listA.add(3, "Kiwifruit");
    System.out.println("ListA now:" + listA);
    System.out.println(listA.size());    //Compare the size of List A and List B
    System.out.println("Index of Avocado in listA: " + listA.indexOf("Avocado"));
    System.out.println("Index of Durian in listB: " + listB.indexOf("Durian"));
    listB.addAll(Arrays.asList("Passion Fruit", "Pommelo"));
    System.out.println("ListB now is: " + listB);
    System.out.println(listA.get(2));
  }
}
/*
Create a list ('List A') which contains the following values: Apple, Avocado, Blueberries, Durian, Lychee
Create a new list ('List B') with the values of List A
Print out whether List A contains Durian or not
Remove Durian from List B
Add Kiwifruit to List A after the 4th element
Compare the size of List A and List B
Get the index of Avocado from List A
Get the index of Durian from List B
Add Passion Fruit and Pummelo to List B in a single statement
Print out the 3rd element from List A
 */