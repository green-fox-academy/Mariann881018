import java.util.Scanner;
public class DrawSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number:");
    int noOfRows = sc.nextInt();

    for (int i = 1; i <= noOfRows; i++) {
      for (int j = 1; j <= noOfRows; j++) {
        if (j == 1 || i == 1 || i == noOfRows || j == noOfRows){
          System.out.print("%");
        } else  {
          System.out.print(" ");
        }
      } System.out.println();
    }
  }
}

// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%