import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {

    int[] numList = {3, 4, 5, 6, 7};
    System.out.println("Original array: " + Arrays.toString(numList));
    int[] arrTwo = new int[numList.length];

    for (int i = 0; i<numList.length;i++){
      arrTwo[i] = numList[i]*2;
    }
    System.out.println("Doubled array:  " + Arrays.toString(arrTwo));
  }
}

// - Create an array variable named `numList` with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array