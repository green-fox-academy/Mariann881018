
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {

    Path myPath = Paths.get("my-file.txt");
    try {
      List<String> linesOfFile = Files.readAllLines(myPath);
      //linesOfFile = Files.readAllLines(myPath);

      for (String newString : linesOfFile) {
        System.out.println(newString);
      }
    } catch (Exception ex) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}