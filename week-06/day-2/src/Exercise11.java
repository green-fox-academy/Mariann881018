import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise11 {
  public static void main(String[] args) {
    String filename = "wiki.txt";
    System.out.println(readFile(filename));
  }

   static List<String> readFile(String filename) {
    try {
      List<String> linesOfFile = Files.readAllLines(Paths.get(filename));
      return linesOfFile;
    } catch (IOException e) {
      final String s = "cannot read the file";
    }
    return null;
  }
}
