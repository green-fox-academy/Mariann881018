public class Sum {
  public static void main(String[] args) {

    int num = 100;
    int sumOf = sum(num);
    System.out.println(sumOf);
  }

  public static int sum(int i) {
    int sum = 0;
    for (int a = 0; a < i + 1; a++) {
      sum += a;
    }
    return sum;
  }
}

// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
