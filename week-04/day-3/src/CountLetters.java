import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public Map countLetters(String input){
    Map<Character,Integer> dictionary = new HashMap<>();
    int lenght = input.length();
    int count = 1;
    for (int i = 0; i < lenght; i++) {
      int integer = 0;
      char charAt = input.charAt(i);

      if (!dictionary.containsKey(charAt)) {
      dictionary.put(charAt, 0);
      }
      integer = dictionary.get(charAt);
      integer = count + integer;
      dictionary.put(charAt, integer);
    }
    return dictionary;
  }

}
/*
Write a function, that takes a string as an argument
and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
 */