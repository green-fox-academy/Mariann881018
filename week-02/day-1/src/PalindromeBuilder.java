public class PalindromeBuilder {
  public static void main(String[] args) {
    String origWord = "greenfox";
    System.out.println(createPalindrom(origWord));
  }
  public static String createPalindrom (String originalWord) {
    String palindromeWord = new String();
    StringBuilder newWord = new StringBuilder();
    newWord.append(originalWord);
    newWord = newWord.reverse();
    System.out.println(originalWord+newWord);
    return palindromeWord;
  }
}
