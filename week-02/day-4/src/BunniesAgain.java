public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ...
    // The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int bunnies = 5;
    int ears = noOfEars(bunnies);
    System.out.println(ears);
  }

  public static int noOfEars(int n) {
    if (n == 1) {
      return 2;
    } else if (n % 2 == 1) {
      return 2 + noOfEars(n - 1);
    } else {
      return 3 + noOfEars(n - 1);
    }
  }
}


//return 2 * noOfEars(a - 1);
/*
10 bunnies --> 1, 3, 5, --->6
          --> 2, 4,---> 6
(bunnies/2)*2 +
bunnies + (bunnies/2)*2 +

 */