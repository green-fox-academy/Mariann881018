import java.util.Scanner;
public class DrawTriangle {
  public static void main(String[] args) {
    System.out.println("Give me a number:");
    Scanner num = new Scanner(System.in);
    int noOfRows = num.nextInt();

    for( int row = 2; row <= noOfRows; row++ ){
      for( int stars = 0; stars < row; stars++ ){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
