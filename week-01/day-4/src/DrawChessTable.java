import java.util.Scanner;
public class DrawChessTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number:");
    int noOfRows = sc.nextInt();

    for(int i = 0; i < noOfRows; i++){
      for(int j = 0; j < noOfRows; j++){
        if( ( i + j ) % 2 == 0){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %