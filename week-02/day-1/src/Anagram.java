public class Anagram {

  public static void main(String[] args) {
    String input1 = "green";
    String input2 = "fox";

    System.out.println(anaGram(input1,input2));
  }

  public static boolean anaGram(String firstWord, String secondWord) { // takes 2 strings, checks if they are anagrams
    boolean tested = false;   // set the starting value of the boolean

    if (firstWord.length()!= secondWord.length()) {   // 1. they have to have the same number of characters, if not, cannot be anagrams
      tested = false;
      return tested;
    }

    for (int i = 0; i < firstWord.length(); i++) {  // 2. 2nd word has to contain all the characters of the 1st word
      if (firstWord.contains(Character.toString(secondWord.charAt(i)))) { //1st word contains the i-th char of 2nd word
        tested = true;
      } else {
        tested = false;
      }

    } return tested;
    }
  }

/*
Create a function named anagram following your current language's style guide.
It should take two strings and return a boolean value depending on whether its an anagram or not.
Examples
input 1   input 2  output
"dog"     "god"     true
"green"   "fox"     false

1 - 2nd word should have as many characters as 1st word
2 - 2nd word should contain all the characters as 1 st word -> 1st word contains char at 2nd word charAt(any index)

 */