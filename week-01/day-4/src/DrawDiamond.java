import java.util.*;
public class DrawDiamond {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number:");

    int noOfRows = sc.nextInt();
    int midRow = (noOfRows)/2;
    int row = 1;

    for (int i = midRow; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= row; j++) {
        System.out.print("* ");
      }
      System.out.println();
      row++;
    }
    for (int i = 0; i <= midRow; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int j = row; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
      row--;
    }
  }
}