import java.util.Scanner;
public class DrawTriangle {
  public static void main(String[] args) {
    System.out.println("Give me a number:");
    Scanner num = new Scanner(System.in);
    int a = num.nextInt();

    for( int i = 1; i <= a; i++ ){
      for( int j = 0; j < i; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
