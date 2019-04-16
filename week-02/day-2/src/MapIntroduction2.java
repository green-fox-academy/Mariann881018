import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {

  public static void main(String[] args) {
    Map<String, String> myMap = new HashMap<>();
    myMap.put("978-1-60309-452-8", "A Letter to Jo");
    myMap.put("978-1-60309-459-7", "Lupus");
    myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    myMap.put("978-1-60309-461-0", "The Lab");

    for (Map.Entry<String, String> value: myMap.entrySet()) {
      System.out.println(value.getValue() + " (ISBN: " + value.getKey() + ")");
    }
    myMap.remove(978-1-60309-444-3);
    myMap.values().remove("978-1-60309-444-3");

    myMap.put("978-1-60309-450-4", "They Called Us Enemy");
    myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");




    System.out.println(myMap.containsKey("478-0-61159-424-8"));
    System.out.println(myMap.get("978-1-60309-453-5"));





  }


}
/*
Print whether there is an associated value with key 478-0-61159-424-8 or not
Print the value associated with key 978-1-60309-453-5


 */