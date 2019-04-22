public class DiagonalMatrix {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    System.out.println("This is the two dimensional matrix array:");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (j == i) {
          matrix[i][j] = 1;
        } else {
          matrix[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}