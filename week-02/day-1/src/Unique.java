import java.util.*;
import java.util.stream.IntStream;

public class Unique {
  public static void main(String[] args) {
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
  }
  public static String unique(int[] myArray) {
    int[] noDuplicates = IntStream.of(myArray).distinct().toArray();
    return Arrays.toString(noDuplicates);
  }
}


