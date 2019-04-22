import java.util.Arrays;

public class SubInt {

  public static void main(String[] args) {
    System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
  }

  public static String subInt(int a, int origArray[]) {
    int[] newArray = {};
    for (int i = 0; i < origArray.length; i++){
      if (origArray[i] == a || origArray[i] % 10 == a || origArray[i] / 10 == a) {
        newArray = Arrays.copyOf(newArray, newArray.length + 1);
        newArray[newArray.length - 1] = i;
      }
    }
    return Arrays.toString(newArray);
  }
}
