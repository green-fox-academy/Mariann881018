import java.util.Arrays;

public class PalindromeSearcher {
  public static void main(String[] args) {
    String origWord = "greenfox";
    System.out.println(palindrome(origWord));
  }

  public static String palindrome(String origWord){
    String error = "The original word should be at least 3 characters long";
    String[] newArray = {};

    if (origWord.length()< 3 ) {
     return error;
    }

    return Arrays.toString(newArray);
  }
}

/*
Create a function named search palindrome following your current language's style guide.
It should take a string, search for palindromes that at least 3 characters long and return a list with the found palindromes.
Examples
input                                 output
"dog goat dad duck doodle never"      ["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
"apple"                               []
"racecar"                             ["racecar", "aceca", "cec"]
 */