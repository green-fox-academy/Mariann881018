public class CompareLength {
  public static void main(String[] args) {
    int[] pl = {1, 2, 3};
    int[] pl2 = {4, 5};

    if (pl.length < pl2.length) {
      System.out.println("pl2 has more elements");
    } else
      System.out.println("pl1 has more elements");
  }
}
