public class SubStrList {
  public static void main(String[] args) {
    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("wh", searchArr)); //  should print: `4`
    System.out.println(subStrList("not", searchArr)); //  should print: `-1`
  }
  public static int subStrList(String string, String[] list){
    for (int i = 0; i < list.length; i++){
      if (list[i].contains(string)){
        return i;
      }
    }
    return -1;
  }
}