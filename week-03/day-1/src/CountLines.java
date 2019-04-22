import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) throws IOException {
    sumLines("myfile.txt");
  }

  public static void sumLines (String path) throws IOException {
    Path sourceFile = Paths.get(path);

    try {
      List<String> linesOfFile = Files.readAllLines(sourceFile);
      linesOfFile = Files.readAllLines(sourceFile);
      int sumOfLines = 0;
      for (String a : linesOfFile) {
        sumOfLines++;
        System.out.println(sumOfLines);
      }
    } catch (FileNotFoundException ex){
      System.out.println("0");
    } catch (Exception ex){
      System.out.println();
    }
  }
}
