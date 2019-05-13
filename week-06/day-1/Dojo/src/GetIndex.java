import java.util.List;

public class GetIndex {
  public static void main(String[] args) {


  }

  public int getIndex(int value, List<Integer> list) {
    int returnValue = -1;
    for (int i = 0; i < list.size(); i++) {
      if (value == list.get(i)) {
        returnValue = i;
      } else {
        returnValue= -1;
      }
    }
    return returnValue;
  }
}
