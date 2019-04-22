import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {

    write5Lines("my-file.txt", "apple", 5);
  }

  public static void write5Lines (String path, String inputWord, int n) {

    List<String> lines = new ArrayList<>();

    try { Path sourceFile = Paths.get(path);
      for (int i = 0; i < n; i++){
        lines.add(inputWord);
        Files.write(sourceFile,lines);}
      System.out.print(Files.readAllLines(sourceFile));
    } catch (IOException ex){
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}

