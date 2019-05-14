import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    //Create a Fox class with 3 properties: name, color and age, Fill a list with at least 5 foxes

    List<Fox> foxList = new ArrayList<>();
    Fox one = new Fox("Joe","red",5);
    foxList.add(one);
    Fox two = new Fox("Jim","green",4);
    foxList.add(two);
    Fox three = new Fox("James","green",3);
    foxList.add(three);
    Fox four = new Fox("Johnny","blue",2);
    foxList.add(four);
    Fox five = new Fox("John","yellow",3);
    foxList.add(five);
    Fox six = new Fox("Joel","green",8);
    foxList.add(six);

    System.out.println("Stream Expression to find the foxes with green color:");
    foxList.stream()
            .filter(e -> e.color.equals("green"))
            .forEach(n -> System.out.println(n.name + " - " + n.age));
    System.out.println();


    System.out.println("Stream Expression to find the foxes with green color, and age less then 5 years:");
    foxList.stream()
            .filter(e -> e.color.equals("green") && e.age < 5)
           // .filter(e -> e.age < 5)
            .forEach(n -> System.out.println(n.name));
    System.out.println();


    System.out.println("Stream Expression to find the frequency of foxes by color:");
    Map<String,Integer> frequencyByColor = foxList.stream()
            .collect(Collectors.groupingBy(Fox::getColor, Collectors.summingInt(fox -> 1)));
    System.out.println(frequencyByColor);
  }
}
