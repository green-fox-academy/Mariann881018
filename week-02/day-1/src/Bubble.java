import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    int[] list = new int[]{34, 12, 24, 9, 5};
    System.out.println("Original list: " + Arrays.toString(list));
    System.out.println("In ascending order: " + bubble(list));
    System.out.println("In descending order: " + advancedBubble(list, false));
  }

  public static String bubble(int[] origlist) {
    Arrays.sort(origlist);
    String sortedlist = Arrays.toString(origlist);
    return sortedlist;
  }
    private static String advancedBubble(int[] origlist, boolean b) {
    Arrays.sort(origlist);
    String no = "boolean is false!";
    int[] newlist = new int[origlist.length];
    String descending;

    if (b == true) {
      for (int i = 0; i < origlist.length; i++) {
        newlist[i] = origlist[origlist.length - 1 - i];
      }
      descending = Arrays.toString(newlist);
      return descending;
    } else {
      return no;
    }
  }
}