import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public Map countLetters(String input){
    Map<Character,Integer> dictionary = new HashMap<>();
    int count = 1;
    for (int i = 0; i < input.length(); i++) {
      int integer = 0;
      char aChar = input.charAt(i);
      if (!dictionary.containsKey(aChar)) {
      dictionary.put(aChar, 0);
      }
      integer = dictionary.get(aChar);
      integer += count;
      dictionary.put(aChar, integer);
    }
    return dictionary;
  }
}

/*
Write a function, that takes a string as an argument
and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
 */