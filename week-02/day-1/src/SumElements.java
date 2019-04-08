public class SumElements {
  public static void main(String[] args) {

    int r[] = {54, 23, 66, 12};
    /*
    int a = r[1]+r[2];
    System.out.println("The sum of the second and the third element is " + a);
     */
    int sum = 0;
    for (int num: r) {
      sum = r[1] + r[2];
    }
    System.out.println("The sum of the second and the third element is " + sum);
  }
}

// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element