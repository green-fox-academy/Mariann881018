import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class test3 {
  public static void main(String[] args) {

    Path src = Paths.get("sourcefile.txt");
    Path dest = Paths.get("destinationfile.txt");
    try {
      List<String> lines = Files.readAllLines(src);
      Files.write(dest, lines);
      for (String s : lines) {
        System.out.println(s);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
