import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file By writing your name into it as a single line
    // The file should be named "my-file.txt"  In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"

    writeInFile("my-file.txt");

  }
  public static void writeInFile (String path){

    List<String> contentOfFile = new ArrayList<>();
    contentOfFile.add("Hello, I'm Mariann");
    try {Path sourcefile = Paths.get(path);
      Files.write(sourcefile,contentOfFile);
      System.out.println(Files.readAllLines(sourcefile));
    } catch (IOException ex) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}

/*

public class WriteFile {
  public static void main(String[] args) {
    List<String> content = new ArrayList();   // create a new string list, then add the first line
    content.add("First line of my file");
    try {
      Path filePath = Paths.get("assets/new-file.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}
 */