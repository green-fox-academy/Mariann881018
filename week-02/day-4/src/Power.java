public class Power {

  public static void main(String[] args) {
// Given base and n that are both 1 or more,
// compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
        /* with for:
    for (int i = 0; i < power; i++) {
      result = base*result;
    } System.out.println(result);
    */

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
}

/*
n 5, m 4
5*5*5*5

n*n*n*n - m times
n*n*n   - m-1 times
n*n     - m-2 times   (m-1)-1 times
n       - m-3 times   (((m-1))- 1)-1 times

5
5*5
5*5*5


//////
    int num = 123456;
    int sum = SumDigits(num);
    System.out.println(sum);

  public static int SumDigits(int n){
    if (n == 0){
      return n;
    } else {
      return n%10 + SumDigits(n/10) ;
    }
  }

 */
