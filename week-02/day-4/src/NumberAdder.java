public class NumberAdder {
  public static void main(String[] args) {

   // int n = 5;
   // int sum = 0;
   // for (int i = 1; i <= n; i++) {
   //   sum+=i ;
   // } System.out.println(sum);

    int n = 5;
    int sum = numberAdder(n);
    System.out.println(sum);

  }

  public static int numberAdder(int num) {
    if (num == 0){
      return num;
    } else {
      return num + numberAdder(num -1);
    }
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

/*
numberAdder(5)
1+2+3+4+5
reverse:
5+4     +3    +2     +1
n+n-1,  +n-2, +n-3   +n-4
n+n-1   +n-1


public static int factorialWithRecursion(int n) {
  if (n == 1) {
    return 1;
  } else {
    return n * factorialWithRecursion(n - 1);
  }
}

 */