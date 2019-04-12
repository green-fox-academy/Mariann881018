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
/*

n=12345

1+2+3+4+5
12345%10 - 5  --
1234%10 - 4
123%3  - 3
12%10 - 2
1%

12345/10  - 1234
1234/10   - 123
123 /10   - 12
12 /10    - 1
1/

  public static int numberAdder(int num) {
    if (num == 0){
      return num;
    } else {
      return num + numberAdder(num -1);
  }

 */