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
