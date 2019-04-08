public class DiagonalMatrix {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    System.out.println("This is the two dimensional matrix array:");
    for (int i = 0; i < matrix.length; i++) {        // adding values to the rows
      for (int j = 0; j < matrix[i].length; j++) {   // adding values to the columns
        if (j == i) {                                //m[0][0], [1][1], [2][2], [3][3] should be 1, the rest 0
          matrix[i][j] = 1;
        } else {
          matrix[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}
// - Create (dynamically) a two dimensional array with the following matrix. Use a loop!
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
// Print this two dimensional array to the output
/*
two dimensional arrays:
how to declare them:  int[][] arr = new int[4][4];
how to print them:
for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix[i].length; j++) {
    System.out.println(matrix[i][j]);
      }
    }
 */