import java.util.*;
import java.util.stream.Collectors;

public class Streams {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("such", "words", "wow");
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

    List<Integer> filteredNums = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n ->  n* 2)
            .collect(Collectors.toList());

    Map<Integer,List<Integer>> oddsAndEvens = numbers.stream()
            .collect(Collectors.groupingBy(n -> n % 2));

    Map<Boolean,List<Integer>> smallers = numbers.stream()
            .collect(Collectors.groupingBy(n -> n < 2));
    //words.forEach(w -> System.out.println(w));

    Optional<Integer> optionalValue = numbers.stream()
            .max(Comparator.comparingInt(n -> n));
    if (optionalValue.isPresent()){
      int maximumvalue = optionalValue.get();
      System.out.println(maximumvalue);
    }
  }
}
