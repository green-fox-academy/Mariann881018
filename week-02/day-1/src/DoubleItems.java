import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {
    int[] numList = {3, 4, 5, 6, 7};
    int[] arrTwo = new int[numList.length];
    System.out.println("Original array: " + Arrays.toString(numList));

    for (int i = 0; i<numList.length;i++){
      arrTwo[i] = numList[i]*2;
    }
    System.out.println("Doubled array:  " + Arrays.toString(arrTwo));
  }
}
