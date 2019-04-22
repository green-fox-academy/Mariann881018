import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    rev("rev.txt", "dest.txt");

  }

  public static void rev(String sourcepath, String destinpath) {
    Path source = Paths.get(sourcepath);
    Path destin = Paths.get(destinpath);
    try {
      List<String> lines = Files.readAllLines(source);

      ArrayList<String> linesInReversedOrder = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        linesInReversedOrder.add(lines.get(lines.size() - 1 - i));
      }

      Files.write(destin,linesInReversedOrder);

    } catch (IOException ex) {
      System.out.println("Error!");
    }
  }
}

