public class GreatestCommonDivisor {
  public static void main(String[] args) {
    // Find the greatest common divisor of two numbers using recursion.

    int numOne = 100;
    int numTwo = 145;
    int divi = commonDivisor(numOne, numTwo);
    System.out.println(divi);
  }

  public static int commonDivisor(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return commonDivisor(b, a % b);
    }
  }
}

/*
    int base = 5;
    int power = 4;
    int result = powerN(base, power);
    System.out.println(result);

  }
  public static int powerN(int n, int m){
    if ( m == 1 ){
      return n;
    } else {
      return n * powerN(n, m-1);    //
    }
  }
 */