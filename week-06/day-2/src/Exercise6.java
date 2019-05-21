public class Exercise6 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!

    String testString = "MyNameIsMariann";
    testString.chars()
            .filter(c -> Character.isUpperCase(c))
            .forEach(c -> System.out.print((char)c));
  }
}
