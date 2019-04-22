public class Factorio {
  public static void main(String[] args) {
    int input = 3;
    int fact = factorio(input);
    System.out.println(fact);
  }
  public static int factorio(int a) {
    int numTwo;
    numTwo = a * (a-1);
    return numTwo;
  }
}
