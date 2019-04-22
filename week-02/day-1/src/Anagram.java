public class Anagram {
  public static void main(String[] args) {
    String input1 = "green";
    String input2 = "fox";
    System.out.println(anaGram(input1,input2));
  }

  public static boolean anaGram(String firstWord, String secondWord) {
    boolean tested = false;
    if (firstWord.length()!= secondWord.length()) {
      tested = false;
      return tested;
    }

    for (int i = 0; i < firstWord.length(); i++){
      if (firstWord.contains(Character.toString(secondWord.charAt(i)))){
        tested = true;
      } else {
        tested = false;
      }

    } return tested;
  }
}
