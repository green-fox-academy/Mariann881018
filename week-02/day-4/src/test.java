public class test {
  public static void main(String[] args) {
    int n = 3;
    fact(n);
    System.out.println(n);

  }

  public static int fact(int n) {
    if (n == 0)
      return 1;
    else {
      int result = fact(n - 1);
      return (fact (n - 1) *n);
    }
  }
}


