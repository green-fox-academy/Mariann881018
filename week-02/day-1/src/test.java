//import java.util.Arrays;

public class test {
  public static void main(String[] args) {

    int[][] firstArry = {{1, 2, 3, 4}, {2, 3, 1}};
    int[][] secondArr = {{11, 12, 13, 14},{21, 22, 23, 24}};

    System.out.println("This is the first array");
    display(firstArry);

    System.out.println("This is the second array");
    display(secondArr);
  }

    public static void display(int x[][]){
      for (int row=0; row<x.length; row++){
        for (int columm=0; columm<x[row].length;columm++){
          System.out.print(x[row][columm]+"\t");
        }
        System.out.println();
      }
    }
  }
