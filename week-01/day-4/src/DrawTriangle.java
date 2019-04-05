import java.util.Scanner;
public class DrawTriangle {
  public static void main(String[] args) {
    System.out.println("Give me a number:");
    Scanner num = new Scanner(System.in);
    int a = num.nextInt();

    for( int b = 1; b <= a; b++ ){
      for( int c = 0; c < b; c++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
