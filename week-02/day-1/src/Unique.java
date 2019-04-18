import java.util.*;
import java.util.stream.IntStream;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})); //  should print: `[1, 11, 34, 52, 61]`
  }

  public static String unique(int[] myArray) {  // from stack overflow, stream has to be imported
    int[] noDuplicates = IntStream.of(myArray).distinct().toArray(); // instream has a method to remove duplicates
    return Arrays.toString(noDuplicates);
  }
}


