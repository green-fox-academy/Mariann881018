import java.util.Arrays;
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] newArr = new int[5];           //->0=7; 1=6; 2=5...4.=3

    int n = aj[0];                       // 0->third, 1->second, 2->first
    newArr[0] = aj[4];
    newArr[1] = aj[3];
    newArr[2] = aj[2];
    newArr[3] = aj[1];
    newArr[4] = n;
    System.out.println(Arrays.toString(newArr));
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