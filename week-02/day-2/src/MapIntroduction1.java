import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
  public static void main(String[] args) {
    Map<Integer, Character> myMap = new HashMap<>();
    System.out.println(myMap.isEmpty());

    myMap.put(97, 'a');
    myMap.put(98, 'b');
    myMap.put(99, 'c');
    myMap.put(65, 'A');
    myMap.put(66, 'B');
    myMap.put(67, 'C');

    for (Integer key : myMap.keySet()){
      System.out.println(key);
    }
    System.out.println();

    for (Character chars : myMap.values()){
      System.out.println(chars);
    }
    System.out.println();
    myMap.put(68, 'D');
    System.out.println(myMap.size());
    System.out.println(myMap.get(99));   // prints the value belonging to this key
    myMap.remove(97);
    System.out.println(myMap.containsKey(100));
    myMap.clear();
  }
}
