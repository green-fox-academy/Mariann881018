public class Anagram {


  public boolean anaGram(String firstWord, String secondWord) {
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