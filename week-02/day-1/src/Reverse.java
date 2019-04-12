import java.util.Arrays;
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};

    for (int i = 0; i < aj.length/2; i++) {
      int newlist = aj[i];
      aj[i] = aj[aj.length - 1 - i];
      aj[aj.length - 1 - i] = newlist;
    }

    System.out.print("The reverse order is: ");

    for ( int j = 0; j < aj.length; j++){
      System.out.print(aj[j]);
    }
  }
}

// - Create an array variable named `aj` with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

/*  String[] abc = {"first", "second", "third"};
    String s = abc[0];  // 0->third, 1->second, 2->first
    abc[0] = abc[2];
    abc[2] = s;
    System.out.println(Arrays.toString(abc));
 */