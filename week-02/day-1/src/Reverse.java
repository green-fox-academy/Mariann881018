public class Reverse {
  public static void main(String[] args){
    int[] aj = {3, 4, 5, 6, 7};
    int[] newlist = new int[aj.length];

    for (int i = 0; i < aj.length; i++){
      newlist[i] = aj[aj.length - 1 - i];
    }
    System.out.print("The reverse order is: ");

    for ( int j = 0; j < newlist.length; j++) {
      System.out.print(newlist[j]);
    }
  }
}