import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    reverse("reversed.txt","cleaned.txt");

  }

  public static void reverse(String pathOfSource, String pathOfDest){
    Path sourceFile = Paths.get(pathOfSource);
    Path destFile = Paths.get(pathOfDest);

    try {
      List<String> lines = Files.readAllLines(sourceFile);
      StringBuilder reversing = new StringBuilder();

      List<String> reversedLines = new ArrayList<>();

      for (int i = 0; i < lines.size(); i++){
        reversing.append(lines.get(i));
        reversing = reversing.reverse();
        reversedLines.add(String.valueOf(reversing));
      }

      Files.write(destFile,reversedLines);

    } catch (Exception ex){
    System.out.println("Error!");
  }
  }
}
//    String reversed = "eslaf"
//    StringBuilder ordered = new StringBuilder(reversed);
//    System.out.println(ordered.reverse().toString());