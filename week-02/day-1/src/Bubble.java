import java.util.Arrays;
public class Bubble {
  public static void main(String[] args) {
    int[] list = new int[]{34, 12, 24, 9, 5};

    System.out.println("Original list: " + Arrays.toString(list));
    System.out.println("In ascending order: " + bubble(list));
    System.out.println("In descending order: " + advancedBubble(list, true));
  }

  public static String bubble(int[] origlist) {
    Arrays.sort(origlist);
    String sortedlist = Arrays.toString(origlist);
    return sortedlist;
  }

    private static String advancedBubble(int[] origlist, boolean b) {
    Arrays.sort(origlist);
    if (b == true) {
      Arrays.sort(origlist);
      for (int i = 0; i < origlist.length / 2; i++) {
        int tempList = origlist[i];
        origlist[i] = origlist[origlist.length - 1 - i];
        origlist[origlist.length - 1 - i] = tempList;
      }
      String descendingList = Arrays.toString(origlist);
      return descendingList;
    }
    else {
      String sortedlist = Arrays.toString(origlist);
      return sortedlist;
    }
  }
}
//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending
//  Example:
//    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));    should print [5, 9, 12, 24, 34]
//    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));   should print [34, 24, 12, 9, 5]