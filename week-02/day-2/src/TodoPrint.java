import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoPrint {
  public static void main(String... args){

    String todoText = " - Buy milk\n";
    System.out.println(corrector(todoText));
  }
  public static String corrector (String origtext) {
    String todoTitle = "My todo: \n";
    String todoTextTwo = " - Download games \n";
    String todoTextThird = "\t - Diablo \n";
    return todoTitle + origtext + todoTextTwo + todoTextThird;
  }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention
// Expected output:
// My todo:
//  - Buy milk
//  - Download games
//      - Diablo