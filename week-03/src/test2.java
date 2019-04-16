import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class test2 {
  public static void main(String[] args) {
    Path path = Paths.get("week-03.iml");  // path is a utility class with useful methods
    Files.isReadable(path);                    // another utility class for file system interactions
    Files.isWritable(path);
    Files.isDirectory(path);
    try {
      List<String> lines = Files.readAllLines(path);
     // Files.write(path, lines);      // write the specific lines into the file
      for (String line : Files.readAllLines(path)){
        System.out.println(line);
      }
      Files.lines(Paths.get("week-03.iml"))
              .map(line->line.toUpperCase())
              .filter(line-> line.startsWith(" "))
              .forEach(line -> System.out.println(line.toUpperCase()));

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
