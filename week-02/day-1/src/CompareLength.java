import java.util.Arrays;
public class CompareLength {
  public static void main(String[] args) {

    int[] pl = {1, 2, 3};
    int[] pl2 = {4, 5};

    if (pl.length < pl2.length) {
      System.out.println("pl2 has more elements");
    } else
      System.out.println("pl1 has more elements");
  }
}

// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`