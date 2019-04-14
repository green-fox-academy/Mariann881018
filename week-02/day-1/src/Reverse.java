public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] newlist = new int[aj.length];

    for (int i = 0; i < aj.length; i++) {   // go through the orig list and put elements in a new list, in reverse order
      newlist[i] = aj[aj.length - 1 - i];   // newlist[0] legyen -- org list 5-1 -- > orig list4., then 3rd, then2n
    }

    System.out.print("The reverse order is: ");

    for ( int j = 0; j < newlist.length; j++) {
      System.out.print(newlist[j]);
    }
  }
}

// - Create an array variable named `aj` with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

