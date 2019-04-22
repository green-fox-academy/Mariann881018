import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PalindromeSearcher {
  public static void main(String[] args) {
    String origWord = "racecar";
    System.out.println(findAllPalindromes(origWord));
  }

  public static Set<String> findAllPalindromes(String input) {
    String error = "The original word should be at least 3 characters long";
    Set<String> palindromes = new HashSet<>();

    if (input.length()< 3 ) {
      return Collections.singleton(error);
    } else {
      for (int i = 0; i < input.length(); i++) {
        palindromes.addAll(findPalindromes(input, i, i + 1));
        palindromes.addAll(findPalindromes(input, i, i));
      }
      return palindromes;
    }
  }

  private static Set<String> findPalindromes(String input, int low, int high) {
    Set<String> result = new HashSet<>();
    while (low >= 0 && high < input.length() && input.charAt(low) == input.charAt(high)) {
      result.add(input.substring(low, high + 1));
      low--;
      high++;
    }
    return result;
  }
}