public class PalindromeBuilder {
  public static void main(String[] args) {
    String origWord = "greenfox";

    System.out.println(createPalindrom(origWord));

  }
  public static String createPalindrom (String originalWord) {
    String palindromeWord = new String();

    StringBuilder newWord = new StringBuilder(); //Stringbuilder has a method to reverse a String
    newWord.append(originalWord);
    newWord = newWord.reverse();
    System.out.println(originalWord+newWord);    // put the reversed string to the end of the original word
    return palindromeWord;
  }
}
/*
Create a function named create palindrome following your current language's style guide.
It should take a string, create a palindrome from it and then return it.
Examples
input       output
"greenfox"  "greenfoxxofneerg"
"123"       "123321"
 */