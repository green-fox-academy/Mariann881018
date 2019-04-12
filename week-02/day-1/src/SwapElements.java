import java.util.Arrays;
public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};

    String s = abc[0];  // 0->third, 1->second, 2->first
    abc[0] = abc[2];
    abc[2] = s;

    System.out.println(Arrays.toString(abc));
  }
}

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
// print out the elements:
