import java.util.Arrays;

public class SubInt {

  public static void main(String[] args) {
    System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
  }

  public static String subInt(int a, int origArray[]) {
    int[] newArray = {};

    for (int i = 0; i < origArray.length; i++) {  // go through the list, put the index in the new list, if the element = a, or the number contains a
      if (origArray[i] == a || origArray[i] % 10 == a || origArray[i] / 10 == a) {
        newArray = Arrays.copyOf(newArray, newArray.length+1);
        newArray[newArray.length - 1] = i;
      }
    }
    return Arrays.toString(newArray);
  }
}

/*
public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of -->that will be a new array, elements are the indexes of the original one
    //  Or returns an empty array if the number is not part of any of the integers in the array
    //  Example:
    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'
  }
}
 */