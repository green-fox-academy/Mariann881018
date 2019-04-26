import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    decrypt("duplicated.txt");

  }
  public static void decrypt (String sourcefile){
    try {
      Path file = Paths.get(sourcefile);
      List<String> lines =  Files.readAllLines(file);

      String newLines = lines.toString();
      String correctLines = "";
      for (int i = 0; i < newLines.length(); i += 2){
        correctLines += String.valueOf(newLines.charAt(i));
      }

      Files.write(file, Collections.singleton(correctLines));

      } catch (IOException ex) {
      System.out.println("cannot read the file");
    }
  }

}

/*
for (int i = 0; i < data.size() ; i++) {
//        if (!newList.contains(data.get(i)))
//        newList.add((data.get(i)));
//        }
//        return newList;
//

 */