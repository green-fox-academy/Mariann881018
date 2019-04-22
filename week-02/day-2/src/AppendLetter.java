import java.util.*;
public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    System.out.println(appendA(far));
  }
  public static List appendA (List<String> inputList){
    for (int i = 0; i < inputList.size(); i++){
      inputList.set(i, inputList.get(i) + "a");
    }
    return inputList;
  }
}
