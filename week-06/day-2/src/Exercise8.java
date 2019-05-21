import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    // Write a Stream Expression to concatenate a Character list to a string!
    List<Character> characterList = Arrays.asList('O','t', 't','e','r');

    String result = characterList.stream()
            .map(n -> n.toString())
            .collect(Collectors.joining());
    System.out.println(result);
  }
}
