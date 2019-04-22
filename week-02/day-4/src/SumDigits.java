public class SumDigits {

  public static void main(String[] args) {
//Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    int num = 123456;
    int sum = SumDigits(num);
    System.out.println(sum);
  }

  public static int SumDigits(int n){
    if (n == 0){
      return n;
    } else {
      return n%10 + SumDigits(n/10) ;
    }
  }
}


