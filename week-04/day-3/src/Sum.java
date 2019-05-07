import java.util.List;

public class Sum {

  public int summingElements(List<Integer> listToSum){
    int num = 0;
    for (Integer i : listToSum){
      num += i;
    } return num;
  }
}
