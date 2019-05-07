import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Sum myObject = new Sum();

    int[] nums = {15};
    List<Integer> testList = new ArrayList<>();
    myObject.summingElements(testList);


    Sharpie one = new Sharpie();
    one.inkAmount = 1;
    System.out.println(one.isUsable());
  }
}
