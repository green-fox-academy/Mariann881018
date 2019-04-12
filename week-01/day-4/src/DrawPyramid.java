import java.util.Scanner;
public class DrawPyramid {
  public static void main(String[] args) {
    System.out.println("Give me a number:");
    Scanner num = new Scanner(System.in);
    int a = num.nextInt();

    for (int i = 1; i <= a ; i++) {
      for (int k = i; k < a; k++) {
        System.out.print(" ");
      }
      for (int j = 1; j < i * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
