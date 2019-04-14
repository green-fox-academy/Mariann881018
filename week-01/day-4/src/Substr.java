public class Substr{

  public static void main(String[] args) {
    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one
    //  Example:
    //  should print: `17`

    String firstString = "Create a function that takes two strings as a parameter";
    String secondString = "string";

    System.out.println(subStr(firstString,secondString));

  }

  public static int subStr(String inputOne, String inputTwo) {
    if (inputOne.contains(inputTwo)) {
      return inputOne.indexOf(inputTwo);
    } else {
      return -1;
    }
  }
}
