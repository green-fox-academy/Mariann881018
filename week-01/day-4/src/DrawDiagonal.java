import java.util.Scanner;
public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number:");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= n; j++){
        if (i == 1 || i == n){
          System.out.print("%");
        } else if (j == 1 || j == n){
          System.out.print("%");
        } else if(i == j) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

// %%%%%    % kell ha: i=1,2,3,4...n
// %%  %              + ha i=j
// % % %
// %  %%
// %%%%%

// i - no of rows, j no of columns