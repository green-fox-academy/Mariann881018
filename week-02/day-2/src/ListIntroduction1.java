import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction1 {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<>();
    System.out.println(myList.size());
    myList.add("William");
    System.out.println(myList.isEmpty());
    myList.add("John");
    myList.add("Amanda");
    System.out.println(myList.size());
    System.out.println(myList.get(2));
    System.out.println();

    for (String name: myList) {
      System.out.println(name);
    }
      System.out.println();

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(i + 1 + ". " + myList.get(i));
    }

    myList.remove(1);
    System.out.println();
    for (String name: myList){
      System.out.println(name);
    }
    //Iterate through the list in a reversed order and print out each name
    myList.clear();
    System.out.println(myList);

    }
  }
